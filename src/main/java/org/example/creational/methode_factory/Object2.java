package org.example.creational.methode_factory;

public class Object2 extends Object {
    @Override
    public String factoryMethode1(String arg) {
        return arg+" ::Object2::factoryMethode1";
    }

    @Override
    public String factoryMethode2(String arg) {
        return arg+" ::Object2::factoryMethode2";
    }

    @Override
    public String factoryMethode3(String arg) {
        return arg+" ::Object2::factoryMethode3";
    }
}
