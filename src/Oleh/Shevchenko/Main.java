package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
        String result = multiplesOutput();
        System.out.println(result);
    }
    public static String multiplesOutput () {
        String result = "";
        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += i + " HelloWorld ";
            }
            else if (i % 3 == 0) {
                result += i + " Hello ";
            }
            else if (i % 5 == 0) {
                result += i + " World ";
            }
            else {
                result += i + " ";
            }
        }
       return result;
    }
}
