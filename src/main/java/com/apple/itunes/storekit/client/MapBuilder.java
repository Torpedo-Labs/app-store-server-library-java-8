package com.apple.itunes.storekit.client;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder {
    public static Map<String, String> mapWithValues(String...values) {
        Map<String, String> map = new HashMap<String, String>();

        for (int x = 0; x < values.length; x = x+2) {
            map.put(values[x], values[x+1]);
        }

        return map;
    }
}
