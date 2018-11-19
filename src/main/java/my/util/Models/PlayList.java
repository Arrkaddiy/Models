package my.util.Models;

import javax.persistence.*;

@Entity
@Table(name = "playlists")
public class PlayList {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "PlaylistId", nullable = false)
    private Integer playlistid;

    @Column(name = "Name", length = 120)
    private String name;

    public PlayList() {
    }

    public PlayList(String name) {
        this.name = name;
    }

    public Integer getPlaylistid() {
        return playlistid;
    }

    public void setPlaylistid(Integer playlistid) {
        this.playlistid = playlistid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
