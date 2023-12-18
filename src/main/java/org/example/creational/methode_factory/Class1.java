package org.example.creational.methode_factory;

public class Class1 implements ICommun{
    @Override
    public String factorymethode(Object o) {
        return o.factoryMethode1("Class1::factorymethode");
    }
}
