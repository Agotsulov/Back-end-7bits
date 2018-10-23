
package com.tenexperts.app.summatra.array;

/**
 * интерфейс который имеет метод sum
 */
public interface IArraySummater {

    /**
     *
     * @param array - массив int
     * @return int с неким значением
     * @throws ArraySummaterException - при исключительной ситуации выбрасывает
     */
    int sum(int[] array) throws ArraySummaterException;

}
