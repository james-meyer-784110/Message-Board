package app.models;

import javax.persistence.*;

@Entity @Table(name = "posts")
public class Post {

    public static final int MAX_TITLE_LEN = 128;
    public static final int MAX_MESSAGE_LEN = 1024;

    @Id
    @GeneratedValue
    @JoinColumn(name = "post_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

    @ManyToOne
    @JoinColumn(name = "thread_id", nullable = false)
    private Thread thread;

    @Column(name = "title", nullable = false, length = MAX_TITLE_LEN)
    private String title;

    @Column(name = "message", nullable = false, length = MAX_MESSAGE_LEN)
    private String message;

    public Post(){}

    public Post(Post copy){
        this.id = copy.id;
        this.author = copy.author;
        this.thread = copy.thread;
        this.message = copy.message;
        this.title = copy.title;
    }
}
