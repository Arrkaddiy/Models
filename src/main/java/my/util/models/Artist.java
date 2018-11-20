package my.util.models;

import javax.persistence.*;

@Entity
@Table(name = "albums")
public class Artist {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "ArtistId", nullable = false)
    private Integer artistId;

    @Column(name = "Name", length = 120)
    private String name;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
