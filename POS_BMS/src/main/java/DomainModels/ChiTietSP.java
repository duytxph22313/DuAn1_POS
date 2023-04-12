package DomainModels;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "ChiTietSP")
public class ChiTietSP {

    @Id
    @Column(name = "IdCTSP")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne()
    @JoinColumn(
            name = "IdSP",
            referencedColumnName = "Id"
    )
    private SanPham sanPham;

    @ManyToOne()
    @JoinColumn(
            name = "IdTH",
            referencedColumnName = "Id"
    )
    private ThuongHieu thuongHieu;

    @ManyToOne()
    @JoinColumn(
            name = "IdCL",
            referencedColumnName = "Id"
    )
    private ChatLieu chatLieu;

    @ManyToOne()
    @JoinColumn(
            name = "IdDG",
            referencedColumnName = "Id"
    )
    private DeGiay deGiay;

    @ManyToOne()
    @JoinColumn(
            name = "IdSize",
            referencedColumnName = "Id"
    )
    private Size size;

    @ManyToOne()
    @JoinColumn(
            name = "IdMau",
            referencedColumnName = "Id"
    )
    private Mau mau;

    private Integer soLuong;
    private BigDecimal donGia;
    private Integer trongLuong;
    private Integer trangThai;

    public ChiTietSP() {
    }

    public ChiTietSP(UUID id, SanPham sanPham, ThuongHieu thuongHieu, ChatLieu chatLieu, DeGiay deGiay, Size size, Mau mau, Integer soLuong, BigDecimal donGia, Integer trongLuong, Integer trangThai) {
        this.id = id;
        this.sanPham = sanPham;
        this.thuongHieu = thuongHieu;
        this.chatLieu = chatLieu;
        this.deGiay = deGiay;
        this.size = size;
        this.mau = mau;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.trongLuong = trongLuong;
        this.trangThai = trangThai;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public DeGiay getDeGiay() {
        return deGiay;
    }

    public void setDeGiay(DeGiay deGiay) {
        this.deGiay = deGiay;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Mau getMau() {
        return mau;
    }

    public void setMau(Mau mau) {
        this.mau = mau;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public Integer getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(Integer trongLuong) {
        this.trongLuong = trongLuong;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", sanPham=" + sanPham + ", thuongHieu=" + thuongHieu + ", chatLieu=" + chatLieu + ", deGiay=" + deGiay + ", size=" + size + ", mau=" + mau + ", soLuong=" + soLuong + ", donGia=" + donGia + ", trongLuong=" + trongLuong + ", trangThai=" + trangThai + '}';
    }

}
