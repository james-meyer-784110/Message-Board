package app.models;

import javax.persistence.*;

@Entity @Table(name = "posts")
public class Post {

    public static final int MAX_MESSAGE_LEN = 1024;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

    @ManyToOne
    @JoinColumn(name = "thread_id", nullable = false)
    private Thread thread;

    @Column(name = "message", nullable = false, length = MAX_MESSAGE_LEN)
    private String message;

    public Post(){}

    public Post(final Post copy){
        this.id = copy.id;
        this.author = copy.author;
        this.thread = copy.thread;
        this.message = copy.message;
    }

    public final User getAuthor(){
        return this.author;
    }

    public final String getMessage(){
        return this.message;
    }
}
