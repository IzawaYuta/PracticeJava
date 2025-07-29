import java.util.Scanner;

public class PracticeJava_if {
    public static void main(String[] args) {
        // int score = new Scanner(System.in) .nextInt();

        // if (score >= 90) {
        //     System.out.println("A判定");
        // } else if (score >= 70) {
        //     System.out.println("B判定");
        // } else {
        //     System.out.println("C判定");
        // }

        //文字列の条件分岐
        System.out.println("今日の天気は？");
        String weather = new Scanner(System.in).next();

        if (weather.equals("晴れ")) {
            System.out.println("Tシャツで出かけよう☀️");
        } else if (weather.equals("雨")) {
            System.out.println("傘を忘れずに☂️");
        } else if (weather.equals("雪")) {
            System.out.println("暖かいコートを着よう⛄️");
        } else {
            System.out.println("天気を取得できません");
        }
    }
}
