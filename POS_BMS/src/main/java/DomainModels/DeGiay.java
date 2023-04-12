package DomainModels;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "DeGiay")
public class DeGiay {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(
            mappedBy = "deGiay",
            fetch = FetchType.EAGER
    )
    private List<ChiTietSP> listCTSP;

    public DeGiay() {
    }

    public DeGiay(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public DeGiay(UUID id, String ma, String ten, List<ChiTietSP> listCTSP) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.listCTSP = listCTSP;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<ChiTietSP> getListCTSP() {
        return listCTSP;
    }

    public void setListCTSP(List<ChiTietSP> listCTSP) {
        this.listCTSP = listCTSP;
    }

    @Override
    public String toString() {
        return ten;
    }

    public Object[] toDataRow() {
        return new Object[]{ma, ten};
    }

}
