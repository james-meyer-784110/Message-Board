package app.models;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "threads")
public class Thread {

    public static final int MAX_TITLE_LENGTH = 128;
    public static final int HASH_ID_LENGTH = 64;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @OneToMany
    @JoinColumn(name = "post_id", nullable = false)
    private List<Post> posts;

    @Column(name = "title", nullable = false, length = MAX_TITLE_LENGTH)
    private String title;

    @Column(name = "created", nullable = false)
    private String created;

    @Column(name = "hash_id", nullable = false, length = HASH_ID_LENGTH)
    private String hashId;

    public Thread(){}

    public Thread(final Thread copy){
        this.id = copy.id;
        this.board = copy.board;
        this.posts = copy.posts;
        this.title = copy.title;
        this.created = copy.created;
        this.hashId = copy.hashId;
    }

    public String getTitle(){
        return this.title;
    }
}
