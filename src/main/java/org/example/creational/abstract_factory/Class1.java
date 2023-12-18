package org.example.creational.abstract_factory;

public class Class1 implements IAbstract{
    @Override
    public ISubClass1 methode1() {
        return new SubClass11();
    }

    @Override
    public ISubClass2 methode2() {
        return new SubClass21();
    }
}
