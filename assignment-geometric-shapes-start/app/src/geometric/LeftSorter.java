package geometric;
import java.util.*;

public class LeftSorter implements Comparator<Geometric> {
    public int compare(Geometric o1, Geometric o2){
        return (int)(o1.get_left_rect()-o2.get_left_rect());
    }
}
