--DATA KHACHHANG

 INSERT INTO KhachHang (MaKH, HoTen, Sdt, Email) VALUES
('KH4','Gin','0212345687','gin@gmail.com'),
('KH2','Lan Anh','0123456789', 'lanh@gmail.com'),
('KH3','Bill','0325145697', 'bill@gmail.com'),
('KH1','Duy','0385199661', 'trxuanduy24@gmail.com'),
('KH5',N'Quyên','0123456456', 'quyen@gmail.com')
SELECT * FROM KhachHang


--DATA CHUCVU
INSERT INTO ChucVu VALUES 
('187C1F5A-057E-4F60-885E-BA261B08A74A', 'QL', N'Quản lý'),
('13501863-2202-4E00-B0F2-35138CFAC540', 'NV', N'Nhân viên')
SELECT * FROM ChucVu


--DATA NHANVIEN 

INSERT INTO NhanVien (MaNV, HoTen, GioiTinh, NgaySinh, DiaChi, Sdt, MatKhau, IdCV)
VALUES 
('QL','Tran Xuan Duy','Nam','2003-04-08',N'Từ Sơn','0385199661','123','187C1F5A-057E-4F60-885E-BA261B08A74A'),
('NV1','Nguyen Van A','Nam','2003-04-08',N'Từ Sơn','0385199661','123','13501863-2202-4E00-B0F2-35138CFAC540')

--DATA SANPHAM

INSERT INTO SanPham (Ma, Ten) VALUES
('SP1','MONARCIDA NEO 2 SELECT AS'),
('SP2','MORELIA NEO 3 PRO AS'),
('SP3','FUTURE ULTIMATE CAGE'),
('SP4','PUMA ULTRA ULTIMATE CAGE'),
('SP5','PHANTOM GX PRO TF'),
('SP6','TIEMPO LEGEND 9 PRO TF'),
('SP7','PREDATOR EDGE.1 TF'),
('SP8','X SPEEDPORTAL .1 TF')


--DATA THUONGHIEU
INSERT INTO ThuongHieu(Ma, Ten) VALUES
('TH1','Nike'),
('TH2','Adidas'),
('TH3','Puma'),
('TH4','Mizuno')

--DATA DE
INSERT INTO DeGiay(Ma, Ten) VALUES
('DG1','TF'),
('DG2','AG'),
('DG3','FG')

--DATA CHATLIEU
INSERT INTO ChatLieu(Ma, Ten) VALUES
('CL1',N'Da Kangaroo'),
('CL2',N'Da tổng hợp'),
('CL3',N'Primeknit'),
('CL4',N'NikeSkin'),
('CL5',N'PWRTAPE'),
('CL6',N'Sợi tổng hợp')

--DATA MAU
INSERT INTO MAU(Ma, Mau) VALUES
('M1',N'Xanh da trời'),
('M2',N'Xanh lá cây'),
('M3',N'Xanh ngọc'),
('M4',N'Cam sáng'),
('M5',N'Hồng đen'),
('M6',N'Ghi ')

INSERT INTO Size(Ma,Size) VALUES
('39','39'),
('40','40'),
('41','41'),
('42','42')

SELECT * FROM SanPham
SELECT * FROM ThuongHieu
SELECT * FROM DeGiay
SELECT * FROM ChatLieu
SELECT * FROM Mau
SELECT * FROM Size

SELECT SanPham.Ten, ThuongHieu.Ten, DeGiay.Ten, ChatLieu.Ten, Mau.Mau, Size.Size, TrongLuong, SoLuong, TrangThai, DonGia 
FROM ChiTietSP join SanPham on ChiTietSP.IdSP = SanPham.Id
join ThuongHieu on ChiTietSP.IdTH = ThuongHieu.Id
join DeGiay on ChiTietSP.IdDG = DeGiay.Id
join ChatLieu on ChiTietSP.IdCL = ChatLieu.Id
join Mau on ChiTietSP.IdMau = Mau.Id
join Size on ChiTietSP.IdSize = Size.Id

--DATA CTSP

INSERT INTO ChiTietSP(IdSP, IdTH, IdDG, IdCL, IdMau, IdSize, TrongLuong, SoLuong, TrangThai, DonGia) 
VALUES
('11921CD6-CAF6-4142-B470-11AB25EDECB4','DA514C20-9384-439C-A510-3BBB49A34439','0A46D044-E9D8-408B-A77B-29029CA21701','68CFA590-FF66-4D3E-A08B-FBBD241E09E0','F1411A73-3BC7-4E11-81CE-999DF4F8EBF3','9CFB13FF-B370-471D-B8F6-CBAB1AE51B7E',235,50,1,1200000)
