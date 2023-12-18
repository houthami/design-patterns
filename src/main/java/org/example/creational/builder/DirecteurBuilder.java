package org.example.creational.builder;

import org.example.config.Config;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DirecteurBuilder{


    public void constructObject(IBuilder builder) {
        try {
            JSONObject config = Config.getConfigJson();
            JSONObject builderJson = (JSONObject) config.get("builder");
            JSONArray methods = (JSONArray) builderJson.get("methods");

            for (Object meth : methods) {
                JSONObject methodJson = (JSONObject) meth;
                String methodName = (String) methodJson.get("name");
                JSONArray methodAttr = (JSONArray) methodJson.get("attribute");

                // Get the method using reflection
                Method method = builder.getClass().getMethod(methodName, String.class);

                // Invoke the method on the builder instance
                method.invoke(builder, methodAttr.get(0));
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
    }
}
