package DomainModels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "KhachHang")
public class KhachHang {

    @Id
    @Column(name = "IdKH")
    @GeneratedValue(strategy = GenerationType.UUID)
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(name = "MaKH")
    private String ma;

    @Column(name = "HoTen")
    private String hoTen;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "Email")
    private String email;

    public KhachHang() {
    }

    public KhachHang(UUID id, String ma, String hoTen, String sdt, String email) {
        this.id = id;
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
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

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", ma=" + ma + ", hoTen=" + hoTen + ", sdt=" + sdt + ", email=" + email + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{ma, hoTen, sdt, email};
    }

}
