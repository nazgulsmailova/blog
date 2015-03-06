package com.epam.tb.blog.model;

import java.util.List;
import java.util.UUID;

public class Post extends Publication {
    Blog blog;
    int views;
    List<Comment> comments;
    List<Tag> tags;

    public Post() {}

    public Post(UUID uuid) {
        super(uuid);
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
