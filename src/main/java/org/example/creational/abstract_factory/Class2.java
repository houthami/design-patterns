package org.example.creational.abstract_factory;

public class Class2 implements IAbstract{
    @Override
    public ISubClass1 methode1() {
        return new SubClass12();
    }

    @Override
    public ISubClass2 methode2() {
        return new SubClass22();
    }
}
