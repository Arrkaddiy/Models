package my.util.models;

import javax.persistence.*;

@Entity
@Table(name = "media_types")
public class MediaType {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "MediaTypeId", nullable = false)
    private Integer mediatypeid;

    @Column(name = "Name", length = 120)
    private String name;

    public MediaType() {
    }

    public MediaType(String name) {
        this.name = name;
    }

    public Integer getMediatypeid() {
        return mediatypeid;
    }

    public void setMediatypeid(Integer mediatypeid) {
        this.mediatypeid = mediatypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
