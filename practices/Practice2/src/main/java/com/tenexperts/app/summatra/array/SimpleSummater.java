package com.tenexperts.app.summatra.array;
/**
 *  Данный сумматор складывает все значения массива и возвращает полученное значение
 */
public class SimpleSummater implements IArraySummater {

    @Override
    public int sum(final int[] array) throws ArraySummaterException {
        if ((array == null) || (array.length == 0)) {
            throw new ArraySummaterException();
        }
        int result = 0;

        for (int i:array) {
            result += i;
        }

        return result;
    }

}
