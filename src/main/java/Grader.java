import java.util.Scanner;

public class Grader {

    private final Scanner scanner;
    private String input;
    private int bulls;
    private int cows;

    public Grader() {
        this.scanner = new Scanner(System.in);
        this.input = "";
    }

    private void takeInput() {
        this.input = this.scanner.nextLine();
    }

    public void grade(String secretNumber) {
        //System.out.println(secretNumber);
        this.takeInput();

        for(int i = 0; i < this.input.length(); i++) {
            for(int j = 0; j < secretNumber.length(); j++) {
                if(this.input.charAt(i) == secretNumber.charAt(j)) {
                    if(i == j) {
                        this.bulls++;
                    } else {
                        this.cows++;
                        i++;
                    }
                }
            }
        }

        if (bulls != 0 && cows != 0) {
            System.out.printf("Grade: %d bull(s) and  %d cow(s). The secret code is %s%n", bulls, cows, secretNumber);
        } else if(bulls != 0 && cows == 0) {
            System.out.printf("Grade: %d bull(s). The secret code is %s%n", bulls, secretNumber);
        } else if(bulls == 0 && cows != 0) {
            System.out.printf("Grade: %d cow(s). The secret code is %s%n", cows, secretNumber);
        } else {
            System.out.printf("Grade: None. The secret code is %s%n", secretNumber);
        }

        System.out.println("bulls: " + this.bulls);
        System.out.println("cows: " + this.cows);
    }
}
