package com.epam.tb.blog.model.factory;

import com.epam.tb.blog.model.Role;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RoleFactory {

    static Map<String, Role> roles = new HashMap<>();

    static {
        Role adminRole = new Role(new UUID(0, 0));

        adminRole.setName("admin");

        Role userRole = new Role(new UUID(0, 1));
        userRole.setName("user");

        Role guestRole = new Role(new UUID(0, 2));
        guestRole.setName("guest");

        roles.put(adminRole.getName(), adminRole);
        roles.put(userRole.getName(), userRole);
        roles.put(guestRole.getName(), guestRole);
    }

    public static Role getRole(String roleName) {
        return roles.get(roleName);
    }
}
