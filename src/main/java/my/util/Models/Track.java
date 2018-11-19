package my.util.Models;

import javax.persistence.*;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "TrackId", nullable = false)
    private Integer trackid;

    @Column(name = "Name", length = 200, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AlbumId")
    private Album albumid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MediaTypeId", nullable = false)
    private MediaType mediatypeid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "GenreId")
    private Genre genreid;

    @Column(name = "Composer", length = 220)
    private String composer;

    @Column(name = "Milliseconds", nullable = false)
    private Integer milliseconds;

    @Column(name = "Bytes")
    private Integer bytes;

    @Column(name = "UnitPrice", nullable = false)
    private Long unitprice;

    public Track() {
    }

    public Track(String name, Album albumid, MediaType mediatypeid,
                 Genre genreid, String composer, Integer milliseconds,
                 Integer bytes, Long unitprice) {

        this.name = name;
        this.albumid = albumid;
        this.mediatypeid = mediatypeid;
        this.genreid = genreid;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitprice = unitprice;
    }

    public Integer getTrackid() {
        return trackid;
    }

    public void setTrackid(Integer trackid) {
        this.trackid = trackid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Album albumid) {
        this.albumid = albumid;
    }

    public MediaType getMediatypeid() {
        return mediatypeid;
    }

    public void setMediatypeid(MediaType mediatypeid) {
        this.mediatypeid = mediatypeid;
    }

    public Genre getGenreid() {
        return genreid;
    }

    public void setGenreid(Genre genreid) {
        this.genreid = genreid;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Long getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Long unitprice) {
        this.unitprice = unitprice;
    }
}
