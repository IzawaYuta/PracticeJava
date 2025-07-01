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
        int score = 30;
        if (score >= 30) {
            System.out.println("赤点回避！");
        } else {
            System.out.println("赤点だよ...");
        }
    }
}
