package com.bol.feign.chronos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * {
 * "schedule": "R/2014-09-25T17:22:00Z/PT2M",
 * "name": "dockerjob",
 * "container": {
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
 * },
 * "cpus": "0.5",
 * "mem": "512",
 * "uris": [],
 * "command": "while sleep 10; do date =u %T; done"
 * }
 * </pre>
 */
public class Job {

    private String schedule;
    private String name;
    /**
     * only used for DockerJobs
     */
    private Container container;
    private String cpus;
    private String mem;
    private String command;
    private boolean async;
    private String owner;
    private int retries;
    private List<EnvironmentVariables> environmentVariables;
    private List<String> arguments;
    private boolean shell;

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public String getCpus() {
        return cpus;
    }

    public void setCpus(String cpus) {
        this.cpus = cpus;
    }

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public List<EnvironmentVariables> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(List<EnvironmentVariables> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public boolean isShell() {
        return shell;
    }

    public void setShell(boolean shell) {
        this.shell = shell;
    }
}
