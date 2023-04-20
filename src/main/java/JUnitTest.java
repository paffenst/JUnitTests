public class JUnitTest {
    public static void main(String[] args) {
        int zahl1 = 20;
        int zahl2 = 50;
        System.out.println("Summe ist: " + add(zahl1, zahl2));
        System.out.println("FizzBuzz: " + FizzBuzz(40));
        System.out.println("SmallerThen: " + smallerThanZero(40));

    }

    public static int add(int a, int b) {
        return a + b;
    }


    public static String FizzBuzz(int num) {
        int num1 = 3;
        int num2 = 5;
        if (isTeilbar(num, num1) && isTeilbar(num, num2)) {
            return "fizzbuzz";
        }
        if (isTeilbar(num, num1)) {
            return "fizz";
        }
        if (isTeilbar(num, num2)) {
            return "buzz";
        }
            return String.valueOf(num);
    }

    public static boolean isTeilbar(int eins, int durch) {
        return eins % durch == 0;
    }

    public static boolean smallerThanZero(int num) {
        //check if number is positive or negative
        return num < 0;
    }
}