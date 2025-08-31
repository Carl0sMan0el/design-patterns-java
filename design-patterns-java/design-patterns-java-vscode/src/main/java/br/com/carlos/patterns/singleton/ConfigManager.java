package br.com.carlos.patterns.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConfigManager {
    private static volatile ConfigManager instance;
    private final Map<String, String> configs = new ConcurrentHashMap<>();

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public void set(String key, String value) {
        configs.put(key, value);
    }

    public String get(String key) {
        return configs.get(key);
    }
}
