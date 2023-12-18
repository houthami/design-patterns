package org.example.creational.builder;

import org.example.config.Config;
import org.json.simple.JSONObject;

import java.lang.reflect.InvocationTargetException;

public class Builder<T> {


    public T builder()  {
        try {
            JSONObject config = Config.getConfigJson();
            JSONObject abstractFactory = (JSONObject) config.get("builder");
            Class<?> clazz = Class.forName("org.example.creational.builder." + abstractFactory.get("class"));
            return (T) clazz.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | ClassNotFoundException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
