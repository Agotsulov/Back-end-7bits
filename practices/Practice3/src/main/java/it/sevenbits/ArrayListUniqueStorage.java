package it.sevenbits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayListUniqueStorage implements IUniqueStorage<Planet> {

    private List<Planet> planetList;
    private Logger logger = LoggerFactory.getLogger(ArrayListUniqueStorage.class);

    public ArrayListUniqueStorage() {
        planetList = new ArrayList<>();
    }

    @Override
    public void add(final Planet planet) {
        if (contains(planet)) {
            logger.warn("Already contains " + planet.getName());
        } else {
            logger.info("Add " + planet.getName());
            planetList.add(planet);
        }
    }

    @Override
    public void remove(final Planet planet) {
        logger.info("Remove " + planet.getName());
        planetList.remove(planet);
    }

    @Override
    public boolean contains(final Planet planet) {
        return planetList.contains(planet);
    }

    @Override
    public Iterator<Planet> iterator() {
        return planetList.iterator();
    }
}
