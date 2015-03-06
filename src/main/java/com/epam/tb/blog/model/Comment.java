package com.epam.tb.blog.model;

import java.util.UUID;

public class Comment extends Publication {
    Post post;

    public Comment() {}

    public Comment(UUID uuid) {
        super(uuid);
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
