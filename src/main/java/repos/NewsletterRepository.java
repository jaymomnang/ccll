package repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import models.*;
import java.util.Optional;

public interface NewsletterRepository extends MongoRepository<Newsletter, String> {
    Optional<Newsletter> findByTitle(String title);
}
