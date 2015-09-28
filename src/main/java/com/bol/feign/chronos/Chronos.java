package com.bol.feign.chronos;

import com.bol.feign.chronos.model.Job;
import feign.RequestLine;

import javax.inject.Named;
import java.util.List;

/**
 * See https://mesos.github.io/chronos/docs/api.html for the full API
 *
 * Example usage:
 * <code>
 *     compile "com.bol.feign:feign-client-provider:0.3"
 * </code>
 */
public interface Chronos {

    @RequestLine("POST /scheduler/iso8601")
    void add(Job job);

    @RequestLine("DELETE /scheduler/job/{name}")
    void deleteJob(@Named("name") String name);

    @RequestLine("GET /scheduler/jobs")
    List<Job> getJobs();


}
