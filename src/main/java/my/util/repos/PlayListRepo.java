package my.util.repos;

import my.util.models.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepo extends JpaRepository<PlayList, Long> {
}
