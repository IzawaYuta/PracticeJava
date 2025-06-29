public class Calculation {
    public static void main(String[] args) {

        String string1 = "改行は、";
        String string2 = "しません。";

        // System.out.print(string1);
        // System.out.print(string2);

        String string3 = "改行を、";
        String string4 = "します。";

        // System.out.println(string3);
        // System.out.println(string4);

        //基本的な計算
        int a = 5;
        int b = 2;
        // System.out.println(a + b); //足し算
        // System.out.println(a - b); //引き算
        // System.out.println(a * b); //掛け算
        // System.out.println(a / b); //割り算
        // System.out.println(a % b); //余り

        //forを使った計算(繰り返し)
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i; 
        }
        // System.out.println("1から10までの合計: " + sum);

        //if文を使った計算（条件分岐）
        int num = 2;

        if (num > 0) {
            // System.out.println(num + "は正の数です");
        } else {
            // System.out.println(num + "は負の数です");
        }
    }
}
