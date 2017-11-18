package com.johnny.resources;

import com.johnny.models.BasicModel;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.UUID;


@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
public class BasicResource {

    private final String defaultContent = "Default content :P";

    @GET
    @Timed
    public BasicModel genRand(
            @QueryParam("content") String passedContent
    ) {
        String content = defaultContent;

        if (passedContent != null) {
            content = passedContent;
        }

        return new BasicModel(UUID.randomUUID(), content);
    }

}
