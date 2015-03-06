package com.epam.tb.blog.model.factory;

import com.epam.tb.blog.model.User;
import com.thedeanda.lorem.Lorem;

import java.util.Date;

public class UserFactory {
    private static final Date BIRTHDAY_START = new Date(70, 0, 1);
    private static final Date BIRTHDAY_END = new Date(100, 0, 1);
    private static final Date REGISTER_START = new Date(100, 0, 1);
    private static final Date REGISTER_END = new Date(114, 0, 1);

    public static User create() {
        User user = new User();
        user.setBirthday(Dates.randomDateBetween(BIRTHDAY_START, BIRTHDAY_END));
        String firstName = Lorem.getFirstName();
        String lastName = Lorem.getLastName();
        user.setEmail(firstName.toLowerCase() + "@" + lastName.toLowerCase() + ".com");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setRegisterDate(Dates.randomDateBetween(REGISTER_START, REGISTER_END));
        user.setRole(RoleFactory.getRole("user"));
        return user;
    }
}
