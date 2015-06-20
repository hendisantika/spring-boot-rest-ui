package com.simple;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Configuration
public class RepositoryConfig extends RepositoryRestMvcConfiguration {
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Planet.class);
    }
}
