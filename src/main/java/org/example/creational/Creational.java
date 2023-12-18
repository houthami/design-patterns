package org.example.creational;

import org.example.config.Config;
import org.example.creational.abstract_factory.AbstractFactory;
import org.example.creational.abstract_factory.IAbstract;
import org.example.creational.builder.Builder;
import org.example.creational.builder.DirecteurBuilder;
import org.example.creational.builder.IBuilder;
import org.example.creational.methode_factory.FactoryMethode;
import org.example.creational.methode_factory.ICommun;
import org.example.creational.methode_factory.Object;
import org.example.creational.prototype.Object1;
import org.example.creational.singleton.Singleton;
import org.json.simple.JSONObject;

public class Creational {
    public static void excut(){
        Config.createConfig();
        System.out.println("Factory Methode");
        ICommun clazz = new FactoryMethode<>(ICommun.class).factoryMethode();
        Object obj = new FactoryMethode<>(Object.class).factoryMethode();
        System.out.println( clazz.factorymethode((Object) obj));

        System.out.println("Abstract methode");
        IAbstract aClazz = new AbstractFactory<IAbstract>().abstractFactory();
        System.out.println(aClazz.methode2().methode("test"));

        System.out.println("Builder");
        IBuilder builder = new Builder<IBuilder>().builder();
        DirecteurBuilder directer = new DirecteurBuilder();
        directer.constructObject(builder);
        System.out.println(builder);

        System.out.println("prototype");
        JSONObject json = new JSONObject();
        json.put("test", "data");
        Object1 object1 = new Object1(json);
        Object1 prototype = object1.clone();
        System.out.println("origin : "+object1.toString());
        System.out.println("prototype : "+prototype.toString());

        System.out.println("Singleton");
        Singleton singleton = Singleton.createSinglton();
        System.out.println(singleton.getS());
        singleton = Singleton.createSinglton("test");
        System.out.println(singleton.getS());
        singleton.setS("test");
        System.out.println(singleton.getS());
    }
}
