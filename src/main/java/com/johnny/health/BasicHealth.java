package com.johnny.health;

import com.codahale.metrics.health.HealthCheck;
import com.johnny.models.BasicModel;

import java.util.UUID;

public class BasicHealth extends HealthCheck {
    @Override protected Result check() throws Exception {
        final UUID id = UUID.randomUUID();
        final String content = "Test 1234 :D";

        final BasicModel model = new BasicModel(id, content);
        if (!model.getContent().equals(content) || !model.getId().equals(id)) {
            return Result.unhealthy("passed id and content dont match values on object");
        }
        return Result.healthy();
    }
}
