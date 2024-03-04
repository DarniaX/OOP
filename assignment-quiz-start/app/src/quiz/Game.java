package quiz;

import java.util.*;

public class Game {

    public static void startGame(){
        List<Question> questions = new LinkedList<>();
        questions.add(new OpenQuestion("What is the big O complexity of binary search?", "O(log N)"));
        questions.add(new OpenQuestion("How would you read an integer i from scanner s in Java?", "i = s.nextInt();", 2));
        questions.add(new OpenQuestion("What is the minimum amount of constructors you have to define for a class in Java?", "0", 2));

        questions.add(new MultipleChoiceQuestion("What is the best achievable complexity of in situ sorting?", new String[] { "O(N^2)", "O(N log N)", "O(N)", "O(log N)" }, 1, 4));
        questions.add(new MultipleChoiceQuestion("How do you print \"Hello world\" on a line in Java?", new String[] { "System.out.print(\"Hello world\");", "System.out.println(\"Hello world\");", "cout << \"Hello world\";" }, 1));
        questions.add(new MultipleChoiceQuestion("How do you read a non-empty word in Java using scanner s?", new String[] { "s.nextline()", "s.next(\"\\S+\")", "s.next(\"\\a*\")", "s.next(\"\\S*\")", "s.next(\"\\\\s+\")", "s.next(\"\\s+\")", "s.nextString(\"\\s*\")", "s.next(\"\\\\S+\")", "s.nextString()" }, 7, 1));

        questions.add(new ThisThatQuestion("Every class must have a constructor", "Right", "Wrong", 1));
        questions.add(new ThisThatQuestion("Is there a difference between an interface and an abstract class?", "Yes", "No", 0, 5));
        questions.add(new ThisThatQuestion("Is there a maximum to the amount of constructors a class can have in Java?", "Yes", "No", 1));
        
        // Implement the game stuff here.
        System.out.println("Welcome to the Java Quiz! We'll be asking two rounds of questions!");
        Scanner s = new Scanner(System.in);
        int ScoreRound1 = 0;
        List<Question> WrongQuestions = new LinkedList<>();

        for (int i=0; i < questions.size(); i++){
            Question questionnow = questions.get(i);
            System.out.println(questionnow);
            String input = s.nextLine();
            if(questionnow.isCorrect(input)){
                System.out.println("Nice work! You got the answer correct" + '\n');
                ScoreRound1 += questionnow.getScore();
            }
            else{
                System.out.println("That is not the correct answer, you'll get a second chance though!" + '\n');
                WrongQuestions.add(questionnow);
            }

        }
        int ScoreRound2 = 0;
        System.out.println("That was the first round, we will now be going over all the wrong questions!");
        for(int i=0; i<WrongQuestions.size(); i++){
            Question questionnow = WrongQuestions.get(i);
            System.out.println(questionnow);
            String input = s.nextLine();
            if(questionnow.isCorrect(input)){
                System.out.println("Nice work! You got the answer correct, learning fast ;)" + '\n');
                ScoreRound2 += questionnow.getScore();
            }
            else{
                System.out.println("That is not the correct answer, maybe next time!" + '\n');
            }
        }
        System.out.println("That was all! We will now be going over your score!");
        System.out.println("Your score from round 1 is: "+ ScoreRound1);
        System.out.println("Your score from round 2 is: "+ ScoreRound2);
        System.out.println("That brings your total score to: " + (ScoreRound1 + ScoreRound2) + ", Well done!");

        System.out.println("Thank you for playing, until next time!");
        s.close();
    }

}
