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

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i; // sumにiを加算
        }
        System.out.println("1から10までの合計: " + sum);
    }
}
