package com.zuora;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<AppConfig>{

    public static void main(String[] args) throws Exception{
        new App().run();
    }

    @Override
    public void initialize(Bootstrap<AppConfig> bootstrap) {

    }

    @Override
    public void run(AppConfig config, Environment env) throws Exception {

    }

}
