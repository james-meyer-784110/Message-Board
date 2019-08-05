package app.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.util.List;

public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private List<Post> posts;
}
