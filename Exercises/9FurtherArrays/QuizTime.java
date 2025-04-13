import java.util.ArrayList;
import java.util.Scanner;

// Define the Question class
class Question {
    protected String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getText() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

// Define the Quiz class
class Quiz {
    protected ArrayList<Question> questions = new ArrayList<>();
    protected int totalQuestions = 0;

    public void add(Question question) {
        if (questions.size() < 25) {
            questions.add(question);
            totalQuestions++;
        } else {
            System.out.println("Quiz is full. Cannot add more questions.");
        }
    }

    public void askQuestion() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < totalQuestions; i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getText());
            System.out.print("Your answer: ");
            String yourAnswer = scanner.nextLine();

            if (yourAnswer.equalsIgnoreCase(currentQuestion.getAnswer())) {
                System.out.println("Good!");
                score++;
            } else {
                System.out.println("Wrong. The answer is: " + currentQuestion.getAnswer());
            }
        }

        System.out.println("\nQuiz finished!");
        System.out.println("Your score: " + score + "/" + totalQuestions);
    }
}

public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Sample questions
        quiz.add(new Question("Where is LeedsBeckett University located?", "Leeds West Yorkshire"));
        quiz.add(new Question("Computer Science is in which Campus ?", "Headingley"));
        quiz.add(new Question("How many Generations of computer do we have?", "5"));
        quiz.add(new Question("What is the meaning of AI?", "artificial intelligence"));

        quiz.askQuestion();
    }
}
