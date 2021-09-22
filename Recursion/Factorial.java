public class Factorial {

    public static void main(String[] args) {

        // normalFactorial(5);
        // 5 * 4 * 3 * 2 * 1

        System.out.println();

        System.out.println("============ Recursive Factorial result here ===========");
        System.out.println("5! is equals:" + recursiveFctorial(5));

        System.out.println();
        System.out.println();

        System.out.println("============ Normal Factorial result here ===========");
        System.out.println("5! is equals:" + iterativeFactorial(5));
    }

    public static int recursiveFctorial(int number) {

        if (number == 2) {

            return number;
        }

        return number * recursiveFctorial(number - 1);

    }

    public static int iterativeFactorial(int number) {

        for (int i = number - 1; i > 1; i--) {

            number *= i;

        }

        return number;

    }

}
