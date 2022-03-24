package com.github.genericity.generictiyInterface;

public interface Data<T> {
    void add(T t);
    void delete(int id);
    void update(T t);
    T queryById(int id);
}
