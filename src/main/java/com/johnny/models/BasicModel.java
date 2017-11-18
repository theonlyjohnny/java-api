package com.johnny.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

public class BasicModel {
    private UUID id;

    @Length(max = 3)
    private String content;

    public BasicModel() {
        // Jackson deserialization
    }

    public BasicModel(UUID id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return "BasicModel {" +
                "id=" + this.id +
                ", content=" + this.content +
                "}";
    }

    @JsonProperty
    public UUID getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}