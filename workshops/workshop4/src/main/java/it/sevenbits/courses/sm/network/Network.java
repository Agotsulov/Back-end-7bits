package it.sevenbits.courses.sm.network;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Network implements INetwork {
    private final int maxSize;
    private ConcurrentLinkedDeque<NetworkPackage> packages = new ConcurrentLinkedDeque<NetworkPackage>();

    private Logger logger = LoggerFactory.getLogger(Network.class);

    public Network(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean hasPackage() {
       return packages.size() > 0;
    }

    @Override
    public NetworkPackage getPackage(){
        NetworkPackage p = packages.removeFirst();
        logger.debug("packages.removeFirst() = " + p);
        return p;
    }

    @Override
    public void addPackage(String message, String type) {
        if(packages.size() < maxSize) {
            logger.debug("packages.size() = " + packages.size());
            packages.addLast(new NetworkPackage(type, message));
        }
        else {
            logger.error("packages.size() < maxSize");
        }
    }
}
