package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = multiplesOutput();
        System.out.println(result);
    }
    public static StringBuilder multiplesOutput () {
        StringBuilder result = new StringBuilder(" ");
        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append(i).append(" HelloWord ");
            }
            else if (i % 3 == 0) {
                result.append(i).append(" Hello ");
            }
            else if (i % 5 == 0) {
                result.append(i).append(" World ");
            }
            else {
                result.append(i).append(" ");
            }
        }
       return result;
    }
}
