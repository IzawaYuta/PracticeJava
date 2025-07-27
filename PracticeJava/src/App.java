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
        //変数のルール
        //最初にintで宣言したら他の型をあとから再代入できない
        int price = 150;
        System.out.println(price * 120);
        System.out.println(price * 130);
        System.out.println(price * 140);

        //変数の再代入
        price = 200;
        // price = price + 50;
        // price += 50;
        System.out.println(price * 120);
        System.out.println(price * 130);
        System.out.println(price * 140);

        //定数
        //定数の命名は全て大文字
        //単語の間は_を
        //例：MY_NAME
        final double TAX = 0.08; //消費税
        System.out.println(100 + 100 * TAX); //金額 + 消費税
        System.out.println(200 + 200 * TAX);
        System.out.println(300 + 300 * TAX);

        //文字列
        System.out.println("Hello, Java!");
        System.out.println("Hello, \"Java\"!"); //""を文字として認識させる
        System.out.println("Hello, \nJava!"); //改行

        //文字列と変数の組み合わせ
        String name1 = "Taro";
        String name2 = "Hanako";
        System.out.println("Hello, " + name1);
        System.out.println(String.format("Hello. %s, %s", name1, name2));

        //配列
        //書き方１
        // int[] scores;
        // scores = new int[3];
        //書き方２
        // int[] scores = new int[3];
        // scores[0] = 60;
        // scores[1] = 70;
        // scores[2] = 80;
        //簡単な書き方
        int[] scores = {60, 70, 80};
        System.out.println(scores[0]); //配列の要素を取り出す
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        scores[1] = 100; //値の再代入
        System.out.println(scores[1]);
        System.out.println(scores.length); //配列の要素数を取得

        //より複雑な配列
        //以下二つの配列は、点数の配列だから１つにまとめたい
        int[] firstYearScores = {60, 70, 80};
        int[] secondYearScores = {30, 40, 50};
        //１つにまとめる書き方
        int[][] firstAndSecondScores = {
            {60, 70, 80}, //firstAndSecondScores[0]
            {30, 40, 50} //firstAndSecondScores[1]
        };
        //取り出す
        //firstAndSecondScores[1]の[2]
        System.out.println(firstAndSecondScores[1][2]);
    }
}
