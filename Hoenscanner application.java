package com.hoenscanner;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.hoenscanner.resources.SearchResource;

public class HoenScannerApplication extends Application<HoenScannerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HoenScannerApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<HoenScannerConfiguration> bootstrap) {
        // Application initialization
    }

    @Override
    public void run(final HoenScannerConfiguration configuration, final Environment environment) {
        // Register the resource
        environment.jersey().register(new SearchResource());
    }
}
