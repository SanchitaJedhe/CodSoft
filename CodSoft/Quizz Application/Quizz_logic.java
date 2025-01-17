import java.util.*;
public class Quizz_logic extends Object {
   

    List<Questions> questions = new ArrayList<>();
    private int score = 0;

    public  Quizz_logic( ) {
       // Add sample questions
        questions.add(new Questions("What is the capital of France?", new String[]{"Paris", "Berlin", "Madrid", "Rome"}, 1));
        questions.add(new Questions("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 2));
        questions.add(new Questions("What is 5 + 3?", new String[]{"6", "7", "8", "9"}, 3));
   }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            Questions q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.getQuestionText());
            String[] options = q.getOptions();

            // Display options
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            // Timer (10 seconds per question)
            long startTime = System.currentTimeMillis();
            int answer = -1;
            while ((System.currentTimeMillis() - startTime) < 10000) {
                if (scanner.hasNextInt()) {
                    answer = scanner.nextInt();
                    break;
                }
            }

            if (answer == q.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + options[q.getCorrectOption() - 1]);
            }
        }
        displayResults();
        scanner.close();
    }

    public void displayResults() {
        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
}

    

