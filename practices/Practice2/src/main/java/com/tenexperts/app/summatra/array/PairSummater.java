package com.tenexperts.app.summatra.array;

import com.tenexperts.app.summatra.array.ArraySummaterException;
import com.tenexperts.app.summatra.array.IArraySummater;

/**
 * Данный сумматор попарно складывает значения массива и возвращает наибольшую сумму из этих пар
 */
public class PairSummater implements IArraySummater {

    @Override
    public int sum(final int[] array) throws ArraySummaterException {
        if ((array == null) || (array.length == 0) || (array.length % 2 == 1)) {
            throw new ArraySummaterException();
        }
        int result = Integer.MIN_VALUE;

        int sum;
        for (int i = 0; i < array.length; i += 2) {
            sum = array[i] + array[i + 1];
            if (result <= sum) {
                result = sum;
            }
        }
        return result;
    }

}
