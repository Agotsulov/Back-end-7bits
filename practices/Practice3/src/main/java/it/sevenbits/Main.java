package it.sevenbits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(final String[] args) {
        ArrayListUniqueStorage arrayListUniqueStorage = new ArrayListUniqueStorage();

        arrayListUniqueStorage.add(new Planet("Mercury"));
        arrayListUniqueStorage.add(new Planet("Venus"));
        arrayListUniqueStorage.add(new Planet("Earth"));
        arrayListUniqueStorage.add(new Planet("Mars"));
        arrayListUniqueStorage.add(new Planet("Jupiter"));
        arrayListUniqueStorage.add(new Planet("Saturn"));
        arrayListUniqueStorage.add(new Planet("Uranus"));

        arrayListUniqueStorage.add(new Planet("Earth"));
        arrayListUniqueStorage.add(new Planet("Saturn"));

        arrayListUniqueStorage.remove(new Planet("Earth"));

        arrayListUniqueStorage.add(new Planet("Earth"));


        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet uranus = new Planet("Uranus");
        Planet pluto = new Planet("Pluto");

        HashMapFixedStorage hashMapFixedStorage = new HashMapFixedStorage(7);

        hashMapFixedStorage.add(mercury.getId(), mercury);
        hashMapFixedStorage.add(venus.getId(), venus);
        hashMapFixedStorage.add(earth.getId(), earth);
        hashMapFixedStorage.add(mars.getId(), mars);
        hashMapFixedStorage.add(jupiter.getId(), jupiter);
        hashMapFixedStorage.add(saturn.getId(), saturn);
        hashMapFixedStorage.add(uranus.getId(), uranus);
        hashMapFixedStorage.add(pluto.getId(), pluto);


        for (Planet p: arrayListUniqueStorage) {
            if (!hashMapFixedStorage.contains(p)) {
                logger.error(p.getName() + "not contained");
            } else {
                logger.info(p.getName() + " contained");
            }
        }
    }

}
