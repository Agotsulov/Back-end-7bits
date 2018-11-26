package it.sevenbits;

import java.util.Iterator;

public interface IUniqueStorage<T> extends Iterable<T>{

    void add(T t);

    void remove(T t);

    boolean contains(T t);

}
