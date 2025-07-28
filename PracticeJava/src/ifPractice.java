import java.util.Scanner;

public class ifPractice {
    public static void main(String[] args) {
        int score = new Scanner(System.in) .nextInt();

        if (score >= 90) {
            System.out.println("A判定");
        } else {
            System.out.println("Not A");
        }
    }
}
