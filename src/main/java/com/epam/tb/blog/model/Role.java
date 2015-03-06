package com.epam.tb.blog.model;

import java.util.UUID;

public class Role extends BaseEntity {
    String name;

    public Role() {}

    public Role(UUID uuid) {
        super(uuid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
