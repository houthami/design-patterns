package org.example.structural;

import org.example.structural.adapter.Adaptater;
import org.example.structural.adapter.Object1;
import org.example.structural.adapter.Object2;

public class Structural {
    public static void excut(){
        System.out.println("structural");
        System.out.println("Adapter");
        Object1 object1 = new Object1();
        object1.setO1("this is args of obj1");
        Adaptater adaptater = new Adaptater();
        Object2 object2 = adaptater.toDestination(object1);
        System.out.println(object2.getO2());
    }
}
