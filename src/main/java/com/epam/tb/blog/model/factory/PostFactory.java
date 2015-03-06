package com.epam.tb.blog.model.factory;

import com.epam.tb.blog.model.Blog;
import com.epam.tb.blog.model.Post;
import com.epam.tb.blog.model.Tag;
import com.epam.tb.blog.model.User;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;

public class PostFactory {
    public static List<Post> createList(int amount, Blog blog, User author, List<Tag> tags) {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < amount; i++) posts.add(create(blog, author, tags));
        return posts;
    }

    private static Post create(Blog blog, User author, List<Tag> tags) {
        Post post = new Post();
        post.setAuthor(author);
        post.setCreationDate(Dates.randomDateFrom(blog.getCreationDate()));
        post.setTitle(Lorem.getTitle(5));
        post.setBody(Lorem.getWords(50));
        List<Tag> postTags = new ArrayList<>();
        for (Tag tag : tags) if (Math.random() < 0.5) postTags.add(tag);
        post.setTags(postTags);
        post.setViews((int) (Math.random() * 1000));
        post.setComments(CommentFactory.createList((int) (Math.random() * 20), author, post));
        post.setLikes((int) (Math.random() * 50));
        post.setDeleted(Math.random() < 0.2);
        return post;
    }
}
