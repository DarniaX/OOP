package quiz;

public abstract class Question {
    protected String question;
    protected int score;

    // Constructos
    public Question (String question){
        this.question = question;
        this.score = 3; // assuming 3 is the default value of points for a question (no points or 0 would be invalid)
    }
    public Question (String question, int score){
        this.question = question;
        this.setScore(3);
    }

    // Methods
    public int getScore(){
        return score;
    }
    public void setScore(int val){
        if (val < 1 || val > 5)
            score = 3;
        else score = val;
    }
    
    
    // Abstract methods
    public abstract String toString();
    public abstract boolean isCorrect(String answer);
    public abstract String correctAnswer();

}
