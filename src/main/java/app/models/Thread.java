package app.models;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "threads")
public class Thread {

    @Id
    @GeneratedValue
    @JoinColumn(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @OneToMany
    @JoinColumn(name = "post_id", nullable = false)
    private List<Post> posts;

    public Thread(){}

    public Thread(Thread copy){
        this.id = copy.id;
        this.board = copy.board;
        this.posts = copy.posts;
    }
}
