package app.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Post {

    @Id
    @GeneratedValue
    private long id;

    @Column
    User creator;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String message;
}
