package com.johnny;

import com.johnny.health.BasicHealth;
import com.johnny.resources.BasicResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<Config> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void initialize(Bootstrap<Config> bootstrap) {
//        bootstrap.addBundle(new MultiPartBundle());
    }
    @Override
    public void run(Config config,
                    Environment env
    ) {
        final BasicResource basicResource = new BasicResource();
        final BasicHealth basicHealth = new BasicHealth();
        env.healthChecks().register("model", basicHealth);
        env.jersey().register(basicResource);
    }
}