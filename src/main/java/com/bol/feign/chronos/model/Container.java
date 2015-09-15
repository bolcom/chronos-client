package com.bol.feign.chronos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * "type": "DOCKER",
 * "image": "libmesos/ubuntu",
 * "network": "BRIDGE",
 * "volumes": [
 * {
 * "containerPath": "/var/log/",
 * "hostPath": "/logs/",
 * "mode": "RW"
 * }
 * ]
 * </pre>
 */
public class Container {

    private String type;
    private String image;
    private String network;
    private List<Volume> volumes = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }
}
