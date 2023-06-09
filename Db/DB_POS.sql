﻿USE POS_BMS 
GO

--Khách Hàng

CREATE TABLE KhachHang(
IdKH UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaKH VARCHAR(20) UNIQUE,
HoTen NVARCHAR(50),
Sdt VARCHAR(30)  NULL,
Email VARCHAR(40) NULL,
)
GO

------------------------------

--Chức vụ
CREATE TABLE ChucVu(
IdCV UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaCV VARCHAR(20) UNIQUE,
TenCV NVARCHAR(50) DEFAULT NULL,
)
GO

------------------------------

--Nhân viên

CREATE TABLE NhanVien(
IdNV UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaNV VARCHAR(20) UNIQUE,
HoTen NVARCHAR(50) DEFAULT NULL,
GioiTinh NVARCHAR(10) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL,
IdCV UNIQUEIDENTIFIER
)
GO

------------------------------

--Sản phẩm

CREATE TABLE SanPham(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
)
GO

------------------------------

--Thương hiệu

CREATE TABLE ThuongHieu(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
)
GO

------------------------------

--Chất liệu

CREATE TABLE ChatLieu(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
)
GO

------------------------------

--Đế

CREATE TABLE DeGiay(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
)
GO

------------------------------

--Size

CREATE TABLE Size(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Size VARCHAR(20),
)
GO

------------------------------

--Màu

CREATE TABLE Mau(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Mau NVARCHAR(30),
)
GO

------------------------------

--Chi tiết sản phẩm

CREATE TABLE ChiTietSP(
IdCTSP UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdSP UNIQUEIDENTIFIER,
IdTH UNIQUEIDENTIFIER,
IdCL UNIQUEIDENTIFIER,
IdDG  UNIQUEIDENTIFIER,
IdSize UNIQUEIDENTIFIER,
IdMau UNIQUEIDENTIFIER,
SoLuong INT,
DonGia Decimal(20,0) DEFAULT 0,
TrongLuong int ,
TrangThai int, /*0: hết , 1: còn hàng*/
)

------------------------------

--Hóa đơn

CREATE TABLE HoaDon(
IdHD UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKH UNIQUEIDENTIFIER,
IdNV UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayDat DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
NgayShip DATE DEFAULT NULL,
NgayNhan DATE DEFAULT NULL,
TinhTrang INT DEFAULT 0,
TenNguoiNhan NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
HinhThucGiaoDich int , /*0: trực tiếp , 1: ship*/
HinhThucThanhToan int  /*0: tiền mặt , 1: chuyển khoản*/
)
GO

------------------------------

--Chi tiết hóa đơn

CREATE TABLE ChiTietHoaDon(
IdHoaDonCT UNIQUEIDENTIFIER,
IdHD UNIQUEIDENTIFIER,
IdChiTietSP UNIQUEIDENTIFIER,
SoLuong INT,
DonGia DECIMAL(20,0) DEFAULT 0,
CONSTRAINT PK_HoaDonCT PRIMARY KEY (IdHoaDonCT),
CONSTRAINT FK1 FOREIGN KEY(IdHD) REFERENCES HoaDon(IdHD),
CONSTRAINT FK2 FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(IdCTSP),
)
GO


--TẠO QUAN HỆ GIỮA CÁC BẢNG

--NhanVien - ChucVu
ALTER TABLE NhanVien ADD FOREIGN KEY (IdCV) REFERENCES ChucVu(IdCV)

-- HoaDon - KhachHang
ALTER TABLE HoaDon ADD FOREIGN KEY (IdKH) REFERENCES KhachHang(IdKH)

-- HoaDon - NhanVien
ALTER TABLE HoaDon ADD FOREIGN KEY (IdNV) REFERENCES NhanVien(IdNV)

-- ChiTietSP - SanPham
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdSP) REFERENCES SanPham(Id)

-- ChiTietSP - ThuongHieu
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdTH) REFERENCES ThuongHieu(Id)

-- ChiTietSP - SIZE
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdSize) REFERENCES Size(Id)

-- ChiTietSP - CHATLIEU
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdCL) REFERENCES ChatLieu(Id)

-- ChiTietSP - DEGIAY
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdDG) REFERENCES DeGiay(Id)

-- ChiTietSP - Mau
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdMau) REFERENCES Mau(Id)



