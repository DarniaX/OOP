package quiz;

public class ThisThatQuestion extends MultipleChoiceQuestion {
    
    // Constructors
    ThisThatQuestion (String question, String answer1, String answer2, int correctAnswer, int score){
        super(question, new String[] {answer1, answer2}, correctAnswer, score);
    };

    ThisThatQuestion (String question, String answer1, String answer2, int correctAnswer){
        super(question, new String[] {answer1, answer2}, correctAnswer);
    }

    // Methods
    @Override
    public String toString() {
        return answer[0] + " or " + answer[1] + ": " + question;
    }

    @Override
    public boolean isCorrect(String answer){
        if (this.answer[correctAnswer].equalsIgnoreCase(answer))
            return true;
        return false;
    }

    @Override
    public String correctAnswer(){
        return "The correct answer is: " + answer[correctAnswer];
    }
}
