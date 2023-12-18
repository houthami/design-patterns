package org.example.creational.methode_factory;

import org.example.config.Config;
import org.json.simple.JSONObject;

import java.lang.reflect.InvocationTargetException;

public class FactoryMethode<T> {
    private final Class<T> clazz;

    private final String classPackage;
    private final String className;

    public FactoryMethode(Class<T> clazz)
    {
        this.className = clazz.toString().split("[.]")[clazz.toString().split("[.]").length-1];
        String packag = clazz.toString().substring(0, clazz.toString().length() - className.length());
        this.classPackage = packag.split(" ")[packag.split(" ").length - 1];
        this.clazz = clazz;
        int i = 0;
    }

    public T factoryMethode()  {
        try {
            JSONObject config = Config.getConfigJson();
            JSONObject factoryMethodes = (JSONObject) config.get("factory_methode");
            Class<?> clazz = Class.forName(classPackage + factoryMethodes.get(className.toLowerCase()));
            return (T) clazz.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException| ClassNotFoundException | InvocationTargetException  e) {
            throw new RuntimeException(e);
        }
    }
}
