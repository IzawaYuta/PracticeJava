public class ifPractice {
    public static void main(String[] args) {
    //if文を使った計算（条件分岐）
        int num = 2;

        if (num > 0) {
            System.out.println(num + "は正の数です");
        } else {
            System.out.println(num + "は負の数です");
        }

        //else if
        if (num == 1) {
            System.out.println("one");
        } else if (num == 2) {
            System.out.println("two");
        } else if (num == 3) {
            System.out.println("three");
        }

        //赤点の判定
        int score1 = 30;
        if (score1 >= 30) {
            System.out.println("赤点回避！");
        } else {
            System.out.println("赤点だよ...");
        }

        //赤点回避（複雑な条件分岐）
        int score2 = 31;
        if (score2 == 100) {
            System.out.println("100点おめでとう!");
        } else {
            if (score2 >= 90) {
                System.out.println("おしい！");
            } else if (score2 < 30) {
                System.out.println("赤点");
            }
        }

        //論理演算子
        int number = 30;
        if (number >= 0 && number <= 100) {
            System.out.println("範囲内です");
        } else {
            System.out.println("範囲外です");
        }
    }
}
