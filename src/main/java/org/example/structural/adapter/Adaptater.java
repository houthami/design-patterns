package org.example.structural.adapter;

public class Adaptater implements IAdaptater<Object1, Object2> {
    @Override
    public Object1 toSource(Object2 object2) {
        Object1 object1 = new Object1();
        object1.setO1(object2.getO2());
        return object1;
    }

    @Override
    public Object2 toDestination(Object1 object1) {
        Object2 object2 = new Object2();
        object2.setO2(object1.getO1());
        return object2;
    }
}
