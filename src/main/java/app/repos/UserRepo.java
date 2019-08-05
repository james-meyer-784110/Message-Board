package app.repos;

import app.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
}
