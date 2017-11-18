package com.johnny;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class Config extends Configuration {
    @NotEmpty
    public String name;

    public static void setName(String name) {
        name = name;
    }
}
