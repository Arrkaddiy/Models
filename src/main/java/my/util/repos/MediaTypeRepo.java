package my.util.repos;

import my.util.models.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaTypeRepo extends JpaRepository<MediaType, Long> {
}
