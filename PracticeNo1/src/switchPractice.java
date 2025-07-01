public class switchPractice {
    public static void main(String[] args) {
        int num = 4;
        switch (num) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("その他");
                break;
        }
    }
}
