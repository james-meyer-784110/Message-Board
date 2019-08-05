package app.repos;

import app.models.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepo extends CrudRepository<Board, Long> {
}
