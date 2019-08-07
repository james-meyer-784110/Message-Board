package app.models;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "users")
public class User {

    public static final int MAX_FEILD_LENGTH = 64;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public User(String username, String email, String password, List<Post> posts){
        this.username = username;
        this.email = email;
        this.password = password;
        this.posts = posts;
    }

    public void setUsername(String username){
        if(username.length() <= MAX_FEILD_LENGTH){
            this.username = username;
        }
    }

    public void setEmail(String email){
        if(email.length() <= MAX_FEILD_LENGTH) {
            this.email = username;
        }
    }

    public void setPassword(String password){
        if(password.length() <= MAX_FEILD_LENGTH) {
            this.password = password;
        }
    }

    public String getPassword(){
        return this.password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }
}
