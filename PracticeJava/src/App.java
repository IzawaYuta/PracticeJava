public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 複数行のコメントです
         * Javaの練習をしています
         * author: taro
         */

        //一行のコメントです

        System.out.println(10); //整数
        System.out.println(-8); //負の数
        System.out.println(2.5); //小数点
        System.out.println(1_000_000); //数値が大きいときに_を入れると見やすくなる。デバッグでは無視してくれる
        System.out.println(1.2e3); //1.2に10の３条をかけたもの → 1.2*1000 = 1200
        System.out.println(1.2e-3); //1.2に10の-3条をかけたもの = 0.0012

        //演算
        System.out.println(10 + 3); //足し算
        System.out.println(10 - 3); //引き算
        System.out.println(10 * 3); //掛け算
        System.out.println(10 / 3); //割り算
        System.out.println(10 % 3); //あまり
        System.out.println(10 + 2 * 3);
        System.out.println((10 + 2) * 3);

        //変数
        int price = 150;
        System.out.println(price * 120);
        System.out.println(price * 130);
        System.out.println(price * 140);

        //変数の再代入
        price = 200;
        System.out.println(price * 120);
        System.out.println(price * 130);
        System.out.println(price * 140);
    }
}
