package com.epam.tb.blog.model;

import java.util.List;
import java.util.UUID;

public class Tag extends BaseEntity {
    Blog blog;
    List<Post> posts;
    String title;

    public Tag() {}

    public Tag(UUID uuid) {
        super(uuid);
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
