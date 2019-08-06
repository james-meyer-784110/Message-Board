package app.models;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "users")
public class User {

    public static final int MAX_FEILD_LENGTH = 64;

    @Id @GeneratedValue @Column(name = "user_id")
    private long id;

    @Column(name = "username", nullable = false, length = MAX_FEILD_LENGTH)
    private String username;

    @Column(name = "email", nullable = false, length = MAX_FEILD_LENGTH)
    private String email;

    @Column(name = "password", nullable = false, length = MAX_FEILD_LENGTH)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Post> posts;

    public User(){}

    public User(User copy){
        this.id = copy.id;
        this.username = copy.username;
        this.email = copy.email;
        this.password = copy.password;
        this.posts = copy.posts;
    }
}
