package com.danilomaia.workshopspringbootmongodb.entities.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class CommentDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 5047332295213590877L;
    private String text;
    private Instant date;
    private AuthorDTO author;

    public CommentDTO() {
    }

    public CommentDTO(String text, Instant date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}