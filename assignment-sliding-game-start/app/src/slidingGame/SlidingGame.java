package slidingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * A template of a sliding game
 */
public class SlidingGame implements Configuration {

	public static final int N = 3, SIZE = N * N, HOLE = SIZE;
	/**
	 * The board is represented by a 2-dimensional array; the position of the hole
	 * is kept in 2 variables holeX and holeY
	 */
	private int[][] board;
	private int holeX, holeY;
	private int manhattanDist = 1337;
	private SlidingGame parent = null;

	/**
	 * A constructor that initializes the board with the specified array
	 *
	 * @param start: a one dimensional array containing the initial board. The
	 *               elements of start are stored row-wise.
	 */
	public SlidingGame(int[] start) {
		board = new int[N][N];

		assert start.length == N * N : "Length of specified board incorrect";

		for (int p = 0; p < start.length; p++) {
			board[p % N][p / N] = start[p];
			if (start[p] == HOLE) {
				holeX = p % N;
				holeY = p / N;
			}
		}
	}

	public SlidingGame(SlidingGame old, Direction dir) {
		board = new int[N][N];
		for (int i = 0; i < N; i++){
			board[i] = Arrays.copyOf(old.board[i], N);
		}
		holeX = old.holeX + dir.getDX();
		holeY = old.holeY + dir.getDY();
		board[old.holeX][old.holeY] = old.board[holeX][holeY];
		board[holeX][holeY] = HOLE;
		parent = old;
	}

	public int getManhattanDistance() {
		return manhattanDist;
	}

	/**
	 * Converts a board into a printable representation. The hole is displayed as a
	 * space
	 *
	 * @return the string representation
	 */
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				int puzzel = board[col][row];
				buf.append(puzzel == HOLE ? "  " : puzzel + " ");
			}
			buf.append("\n");
		}
		return buf.toString();
	}

	@Override
	public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof SlidingGame)) {
            return false;
        }
        SlidingGame that = (SlidingGame) o;
        if (this.holeX != that.holeX) {
            return false;
        }
        if (this.holeY != that.holeY) {
            return false;
        }
        return true;
	}

	@Override
	public boolean isSolution() {
		if (board == null){
			return false;
		}
		int counter = 1;
		for (int y = 0; y < N; y++){
			for (int x = 0; x < N; x++){
				if (!(board[x][y] == counter)){
					return false;
				}
				counter++;
			}
		}
		return true;
	}

	public boolean canMove(Direction dir) {
        int newHoleX = this.holeX + dir.getDX();
        int newHoleY = this.holeY + dir.getDY();
        if (!(0 <= newHoleX && newHoleX < N)) {
            return false;
        }
        if (!(0 <= newHoleY && newHoleY < N)) {
            return false;
        }
        return true;
    }

	@Override
	public Collection<Configuration> successors() {
        Collection<Configuration> result = new LinkedList<>();
        for (Direction dir : Direction.values()) {
            if (canMove(dir)) {
                result.add(new SlidingGame(this, dir));
            }
        }
        return result;
	}

	@Override
	public int compareTo(Configuration g) {
		return this.manhattanDist - ((SlidingGame) g).manhattanDist;
	}

	@Override
	public Configuration getParent() {
		return parent;
	}

	public int hashCode() {
		int hash = 0;
		if (board == null){
			return hash;
		}
		for ( int x = N-1; x >= 0; x-- ) {
			for ( int y = N-1; y >= 0; y-- ) {
				hash = 31 * hash + board[x][y];
			}
		}
		return hash;
	}
}
