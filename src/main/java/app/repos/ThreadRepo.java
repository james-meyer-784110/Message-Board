package app.repos;

import app.models.Thread;
import org.springframework.data.repository.CrudRepository;

public interface ThreadRepo extends CrudRepository<Thread, Long> {
}
