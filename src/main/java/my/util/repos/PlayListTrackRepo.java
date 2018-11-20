package my.util.repos;

import my.util.models.PlayListTrack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListTrackRepo extends JpaRepository<PlayListTrack, Long> {
}
