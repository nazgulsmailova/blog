package com.epam.tb.blog;

import com.epam.tb.blog.model.Blog;
import com.epam.tb.blog.model.factory.BlogFactory;
import org.boon.Boon;

public class Runner {

    public static void main(String[] args) {
        Blog blog = BlogFactory.create();
        String s = Boon.toPrettyJson(blog);
        System.out.println(s);
    }
}
