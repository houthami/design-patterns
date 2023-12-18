package org.example.structural.adapter;

public interface IAdaptater<T, K> {
    T toSource(K k);
    K toDestination(T t);
}
