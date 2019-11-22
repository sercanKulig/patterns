package com.example.patterns.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private Map<String, Object> objectMap = new HashMap<String, Object>();

    public Object createObject(String key) {
        Object object = objectMap.get(key);
        if (object == null) {
            object = new Letter(key);
            objectMap.put(key,object);
        }
        return objectMap.get(key);
    }
}
