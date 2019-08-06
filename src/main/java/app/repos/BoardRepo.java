package app.repos;

import app.models.Board;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepo extends CrudRepository<Board, Long> {

    List<Board> findAll();

}
