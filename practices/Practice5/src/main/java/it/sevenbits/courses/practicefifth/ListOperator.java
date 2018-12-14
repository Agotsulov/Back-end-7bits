package it.sevenbits.courses.practicefifth;

import java.util.List;

public class ListOperator {

    public <T extends Comparable> T max(final List<T> list, final int start, final int end) {
        T result = list.get(start);
        for (int i = start; i < end; i++) { //for (T t:list.subList(start, end) ?
            T buff = list.get(i);
            if (result.compareTo(buff) < 0) {
                result = buff;
            }
        }
        return result;
    }

    public <T> void changeElementsPosition(final List<T> list, final int first, final int second) {
        T buff = list.get(first);
        list.set(first, list.get(second));
        list.set(second, buff);
    }

}
