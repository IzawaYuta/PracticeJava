import java.util.Scanner;

public class PracticeJava_Switch {
    public static void main(String[] args) {
        String weather = new Scanner(System.in).next();
        switch (weather) {
            case "晴れ":
                System.out.println("Tシャツで出かけよう☀️");
                break;
            case "雨":
                System.out.println("傘を忘れずに☂️");
                break;
            case "雪":
                System.out.println("暖かいコートを着よう⛄️");
                break;
            default:
                System.out.println("天気を取得できません");
                break;
        }
    }
}
