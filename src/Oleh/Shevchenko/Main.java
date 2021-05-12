package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = multiplesOutput();
        System.out.println(result);
    }
    public static StringBuilder multiplesOutput () {
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append(" HelloWord " + i);
            }
            else if (i % 3 == 0) {
                result.append(" Hello " + i);
            }
            else if (i % 5 == 0) {
                result.append(" World " + i);
            }
            else {
                result.append(" " + i);
            }
        }
       return result;
    }
}
