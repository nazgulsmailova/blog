package com.epam.tb.blog.model.factory;

import com.epam.tb.blog.model.Comment;
import com.epam.tb.blog.model.Post;
import com.epam.tb.blog.model.User;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;

public class CommentFactory {
    public static List<Comment> createList(int amount, User author, Post post) {
        List<Comment> comments = new ArrayList<>();
        for (int i = 0; i < amount; i++) comments.add(create(author, post));
        return comments;
    }

    private static Comment create(User author, Post post) {
        Comment comment = new Comment();
        comment.setAuthor(Math.random() < 0.2 ? author : UserFactory.create());
        comment.setTitle(Lorem.getTitle(5));
        comment.setBody(Lorem.getTitle(10));
        comment.setCreationDate(Dates.randomDateFrom(post.getCreationDate()));
        comment.setLikes((int) (Math.random() * 50));
        comment.setDeleted(Math.random() < 0.2);
        return comment;
    }
}
