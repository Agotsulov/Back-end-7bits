package it.sevenbits;

public interface IFixedStorage<T> extends Iterable<T>{

    void add(String key, T t);

    T get(String key);

    void remove(String key);

    boolean contains(T t);

}
