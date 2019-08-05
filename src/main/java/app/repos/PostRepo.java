package app.repos;

import app.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
