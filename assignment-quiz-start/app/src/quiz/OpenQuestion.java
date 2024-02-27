package quiz;

public class OpenQuestion extends Question {
    public String answer;

    // constructors
    public OpenQuestion (String question, String answer, int score){
        super(question, score);
        this.answer = answer;
    }

    public OpenQuestion (String question, String answer){
        super(question);
        this.answer = answer;
    }
    
    // Methods
    
    @Override
    public String toString(){
        return question;
    }
    
    @Override
    public boolean isCorrect(String answer){
        if (this.answer.equalsIgnoreCase(answer))
            return true;
        return false;
    }

    @Override
    public String correctAnswer(){
        return "The correct answer is: " + answer;
    }
}
