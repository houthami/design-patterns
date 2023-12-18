package org.example.creational.abstract_factory;

import org.example.config.Config;
import org.json.simple.JSONObject;

import java.lang.reflect.InvocationTargetException;

public class AbstractFactory<T> {


    public T abstractFactory()  {
        try {
            JSONObject config = Config.getConfigJson();
            JSONObject abstractFactory = (JSONObject) config.get("abstract_factory");
            Class<?> clazz = Class.forName("org.example.creational.abstract_factory." + abstractFactory.get("class"));
            return (T) clazz.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | ClassNotFoundException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
