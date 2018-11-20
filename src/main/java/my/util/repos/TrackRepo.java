package my.util.repos;

import my.util.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepo extends JpaRepository<Track, Long> {
}
