package my.util.Models;

import javax.persistence.*;

@Entity
@Table(name = "playlist_track")
public class PlayListTrack {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PlaylistId", nullable = false)
    private PlayList playlistid;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TrackId", nullable = false)
    private Track trackid;

    public PlayList getPlaylistid() {
        return playlistid;
    }

    public void setPlaylistid(PlayList playlistid) {
        this.playlistid = playlistid;
    }

    public Track getTrackid() {
        return trackid;
    }

    public void setTrackid(Track trackid) {
        this.trackid = trackid;
    }
}
