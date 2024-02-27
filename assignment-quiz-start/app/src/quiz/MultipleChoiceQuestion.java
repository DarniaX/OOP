package quiz;

public class MultipleChoiceQuestion extends Question {
    protected String[] answer;
    protected int correctAnswer;

    // Constructors
    public MultipleChoiceQuestion (String question, String[] answers, int correctAnswer, int score){
        super(question, score);
        this.answer = answers;
        this.correctAnswer = correctAnswer;
    }

    public MultipleChoiceQuestion (String question, String[] answers, int correctAnswer){
        super(question);
        this.answer = answers;
        this.correctAnswer = correctAnswer;
    }

    // Methods
    @Override
    public String toString() {
        String options = "";
        String[] possibleAnswers = {"a) ", "b) ", "c) ", "d) ", "e) ", "f) ", "g) ", "h) ", "i) "};
        for (int i = 0; i < answer.length; i++){
            options += possibleAnswers[i] + answer[i] + '\n';
        }
        return question + '\n' + options;
    }

    @Override
    public boolean isCorrect(String answer){
        String[] possibleAnswers = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        if (possibleAnswers[correctAnswer].equalsIgnoreCase(answer))
            return true;
        return false;
    }

    @Override
    public String correctAnswer(){
        String[] possibleAnswers = {"a) ", "b) ", "c) ", "d) ", "e) ", "f) ", "g) ", "h) ", "i) "};
        return "The correct answer is: " + possibleAnswers[correctAnswer];
    }
}
