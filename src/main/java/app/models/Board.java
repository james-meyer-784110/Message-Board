package app.models;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "boards")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany
    @JoinColumn(name = "thread_id", nullable = false)
    private List<Thread> threads;

    public Board(){}

    public Board(Board copy){
        this.id = copy.id;
        this.title = copy.title;
        this.description = copy.description;
        this.threads = copy.threads;
    }

    public String getTitle() {
        return title;
    }
}
