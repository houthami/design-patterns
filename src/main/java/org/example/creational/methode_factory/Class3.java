package org.example.creational.methode_factory;

public class Class3 implements ICommun{
    @Override
    public String factorymethode(Object o) {
        return o.factoryMethode3("Class3::factorymethode");
    }
}
