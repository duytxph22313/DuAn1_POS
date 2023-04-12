package DomainModels;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Size")
public class Size {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Size")
    private String sz;

    @OneToMany(
            mappedBy = "size",
            fetch = FetchType.EAGER
    )
    private List<ChiTietSP> listCTSP;

    public Size() {
    }

    public Size(UUID id, String ma, String sz) {
        this.id = id;
        this.ma = ma;
        this.sz = sz;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    @Override
    public String toString() {
        return sz;
    }

    public Object[] toDataRow() {
        return new Object[]{ma, sz};
    }

}
