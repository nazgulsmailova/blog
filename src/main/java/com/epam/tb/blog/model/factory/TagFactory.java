package com.epam.tb.blog.model.factory;

import com.epam.tb.blog.model.Tag;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;

public class TagFactory {
    public static List<Tag> createList(int amount) {
        ArrayList<Tag> tags = new ArrayList<>();
        for (int i = 0; i < amount; i++) tags.add(create());
        return tags;
    }

    private static Tag create() {
        Tag tag = new Tag();
        tag.setTitle(Lorem.getWords(1));
        return tag;
    }
}
