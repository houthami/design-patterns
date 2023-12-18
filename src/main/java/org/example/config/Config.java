package org.example.config;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Config {
    private final JSONObject configJson;
    private static Config config;
    private Config(){
        try {
            String configFilePath = "config.json";
            JSONParser parser = new JSONParser();
            this.configJson = (JSONObject) parser.parse(new FileReader(configFilePath));
            config = this;
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Config createConfig(){
        return new Config();
    }

    public static Config getConfig(){
        return config;
    }

    public static JSONObject getConfigJson(){
        return config.configJson;
    }
}
