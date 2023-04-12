package DomainModels;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Mau")
public class Mau {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Mau")
    private String mau;

    @OneToMany(
            mappedBy = "mau",
            fetch = FetchType.EAGER
    )
    private List<ChiTietSP> listCTSP;
    
    public Mau() {
    }

    public Mau(UUID id, String ma, String mau) {
        this.id = id;
        this.ma = ma;
        this.mau = mau;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return mau;
    }

    public Object[] toDataRow() {
        return new Object[]{ma, mau};
    }

}
