package com.tenexperts.app.summatra.array;

/**
 * Main application entry point
 */
public final class Main {

    private Main(){} //А зачем это в checkstyle?

    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String[] args) {
        int[] actual = new int[args.length];

        try {
            for (int i = 0; i < actual.length; i++) {
                actual[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception e) {
            System.out.println("Вводите только целые числа через пробел не больше " + Integer.MAX_VALUE);
        }

        try {
            System.out.println("SimpleSummater = " + new SimpleSummater().sum(actual));
            System.out.println("PairSummater = " + new PairSummater().sum(actual));
        } catch (ArraySummaterException e) {
            System.out.println("Что то пошло не так(");
        }


    }

}
