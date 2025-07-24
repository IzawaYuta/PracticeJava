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
    }
}
