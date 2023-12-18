package org.example.creational.methode_factory;

public class Class2 implements ICommun{
    @Override
    public String factorymethode(Object o) {
        return o.factoryMethode2("Class2::factorymethode");
    }
}
