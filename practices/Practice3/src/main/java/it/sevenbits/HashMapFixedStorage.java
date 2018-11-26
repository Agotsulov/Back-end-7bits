package it.sevenbits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapFixedStorage implements IFixedStorage<Planet> {

    private Logger logger = LoggerFactory.getLogger(HashMapFixedStorage.class);
    private Map<String, Planet> map;
    private int max;

    public HashMapFixedStorage(final int max) {
        this.max = max;
        map = new HashMap<>();
    }

    @Override
    public void add(String key, Planet planet) {
        if (map.size() >= max) {
            logger.error("Maximum number of items reached. Lost " + planet.getName());
            return;
        }

        logger.info("Add {" + key + " : " + planet.getName() + "}");
        map.put(key, planet);
    }

    @Override
    public Planet get(String key) {
        logger.info("Get {" + key + " : " + map.get(key).getName() + "}");
        return map.get(key);
    }

    @Override
    public void remove(String key) {
        logger.info("Get {" + key + " : " + map.get(key).getName() + "}");
        map.remove(key);
    }

    @Override
    public boolean contains(Planet planet) {
        return map.containsValue(planet);
    }

    @Override
    public Iterator<Planet> iterator() {
        return map.values().iterator();
    }
}
