package com.epam.tb.blog.model.factory;

import com.epam.tb.blog.model.Blog;
import com.epam.tb.blog.model.User;
import com.thedeanda.lorem.Lorem;

import java.util.Date;

public class BlogFactory {
    public static Blog create() {
        Blog blog = new Blog();
        User author = UserFactory.create();
        blog.setAuthor(author);
        blog.setCreationDate(Dates.randomDateBetween(author.getRegisterDate(), new Date()));
        blog.setTitle(Lorem.getTitle(5));
        blog.setDescription(Lorem.getWords(10));
        blog.setTags(TagFactory.createList(10));
        blog.setPosts(PostFactory.createList(20, blog, author, blog.getTags()));
        return blog;
    }
}
