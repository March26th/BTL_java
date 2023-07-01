create Database QLMT
use QLMT
go
CREATE TABLE [dbo].[HoaDonNhap](
	[MaHDN] [char](10) NOT NULL,
	[MaNCC] [char](10) NULL,
	[MaMayTinh] [char](10) NULL,
	[SoLuong] [int] NULL,
	[GiaNhap] [decimal](18, 0) NULL,
	[ThanhTien] [decimal](18, 0) NULL,
	[NgayNhap] [date] NULL,
 CONSTRAINT [PK_HoaDonNhap] PRIMARY KEY CLUSTERED 
(
	[MaHDN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
go
CREATE TABLE [dbo].[HoaDonXuat](
	[MaHDX] [char](10) NOT NULL,
	[MaKH] [char](10) NULL,
	[MaMayTinh] [char](10) NULL,
	[SoLuong] [int] NULL,
	[DonGia] [decimal](18, 0) NULL,
	[NgayXuat] [date] NULL,
	[ThanhTien] [decimal](18, 0) NULL,
 CONSTRAINT [PK_HoaDonXuat] PRIMARY KEY CLUSTERED 
(
	[MaHDX] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
go
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [char](10) NOT NULL,
	[TenKH] [nvarchar](100) NULL,
	[DiaChi] [nvarchar](500) NULL,
	[SoDienThoai] [varchar](20) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [char](10) NOT NULL,
	[TenNhaCC] [nvarchar](100) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SoDienThoai] [varchar](20) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TenTaiKhoan] [char](100) PRIMARY KEY NOT NULL,
	[MatKhau] [char](100) NULL,
	[TenNguoiDung] [nvarchar](100) NULL,
	[GioiTinh] [bit] NULL,
	[SoDienThoai] [varchar](20) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Quyen] [bit] null
) ON [PRIMARY]
GO
CREATE TABLE [dbo].[MayTinh](
	[MaMayTinh] [char](10) NOT NULL,
	[TenMayTinh] [nvarchar](100) NULL,
	[MaNCC] [char](10) NULL,
	[SoLuong] [int] NULL,
	[DonGia] [decimal](18, 0) NULL,
	[HanSD] [date] NULL,
	[NgaySX] [date] NULL,
	[CongDung] [text] NULL,
 CONSTRAINT [PK_MayTinh] PRIMARY KEY CLUSTERED 
(
	[MaMayTinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO


CREATE TABLE HoiDap(
 TenTaiKhoan char(100) not null,
 NgayHoi date not null,
 NoiDungHoi nvarchar(3000) not null
	)
GO



ALTER TABLE [dbo].[HoaDonNhap]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonNhap_NhaCungCap] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[HoaDonNhap] CHECK CONSTRAINT [FK_HoaDonNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[HoaDonNhap]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonNhap_MayTinh] FOREIGN KEY([MaMayTinh])
REFERENCES [dbo].[MayTinh] ([MaMayTinh])
GO
ALTER TABLE [dbo].[HoaDonNhap] CHECK CONSTRAINT [FK_HoaDonNhap_MayTinh]
GO
ALTER TABLE [dbo].[HoaDonXuat]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonXuat_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDonXuat] CHECK CONSTRAINT [FK_HoaDonXuat_KhachHang]
GO
ALTER TABLE [dbo].[HoaDonXuat]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonXuat_MayTinh] FOREIGN KEY([MaMayTinh])
REFERENCES [dbo].[MayTinh] ([MaMayTinh])
GO
ALTER TABLE [dbo].[HoaDonXuat] CHECK CONSTRAINT [FK_HoaDonXuat_MayTinh]
GO
ALTER TABLE [dbo].[MayTinh]  WITH CHECK ADD  CONSTRAINT [FK_MayTinh_NhaCungCap] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[MayTinh] CHECK CONSTRAINT [FK_MayTinh_NhaCungCap]
GO
ALTER TABLE [dbo].[HoiDap]  WITH CHECK ADD  CONSTRAINT [FK_HoiDap_TaiKhoan] FOREIGN KEY([TenTaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([TenTaiKhoan])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_HoiDap_TaiKhoan]
GO


CREATE proc [dbo].[sp_AllHDN]
as
SELECT        HoaDonNhap.MaHDN, NhaCungCap.TenNhaCC, MayTinh.TenMayTinh, HoaDonNhap.SoLuong, HoaDonNhap.GiaNhap, HoaDonNhap.ThanhTien, HoaDonNhap.NgayNhap
FROM            HoaDonNhap INNER JOIN
                         NhaCungCap ON HoaDonNhap.MaNCC = NhaCungCap.MaNCC INNER JOIN
                         MayTinh ON HoaDonNhap.MaMayTinh = MayTinh.MaMayTinh


go
CREATE proc [dbo].[sp_AllHDX]
as
SELECT        HoaDonXuat.MaHDX, KhachHang.TenKH, MayTinh.TenMayTinh, HoaDonXuat.SoLuong, HoaDonXuat.DonGia, HoaDonXuat.ThanhTien, HoaDonXuat.NgayXuat
FROM            HoaDonXuat INNER JOIN
                         KhachHang ON HoaDonXuat.MaKH = KhachHang.MaKH INNER JOIN
                         MayTinh ON HoaDonXuat.MaMayTinh = MayTinh.MaMayTinh
GO
--xử lý số lượng xuất
create trigger Xuat
on HoaDonXuat
for insert
as
begin
if(not exists(select*from MayTinh inner join 
inserted
         on MayTinh.MaMayTinh=inserted.MaMayTinh))
		 begin
		   Raiserror(' Loi Khong co hang',16,1)
		   rollback tran
		 end
		 else
		 begin
		 declare @soluong int
		 declare @soluongX int
		 select @soluong=MayTinh.SoLuong from MayTinh inner join inserted on MayTinh.MaMayTinh=inserted.MaMayTinh
		 select @soluongX=inserted.SoLuong from inserted
		 if(@soluong<@soluongX)
		 begin
		     raiserror('Ban khong du hang de xuat',16,1)
			 rollback tran
		 end
		 else
		     
			 update MayTinh set MayTinh.SoLuong=MayTinh.SoLuong-@soluongX
			 from MayTinh inner join inserted on MayTinh.MaMayTinh=inserted.MaMayTinh
		 end
		 end

go
--Xử lí số lượng nhập
create trigger Nhap
on HoaDonNhap
for insert
as
begin
if(not exists(select*from MayTinh inner join 
inserted
         on MayTinh.MaMayTinh=inserted.MaMayTinh))
		 begin
		   Raiserror(' Loi Khong co hang',16,1)
		   rollback tran
		 end
		 else
		 begin
		 declare @soluong int
		 declare @soluongN int
		 select @soluong=MayTinh.SoLuong from MayTinh inner join inserted on MayTinh.MaMayTinh=inserted.MaMayTinh
		 select @soluongN=inserted.SoLuong from inserted
	
			 update MayTinh set MayTinh.SoLuong=MayTinh.SoLuong+@soluongN
			 from MayTinh inner join inserted on MayTinh.MaMayTinh=inserted.MaMayTinh
		 end
		 end
go
--- xu li update Hoa Don X

create trigger SuaX
on HoaDonXuat
for update
as
begin

		 
		 declare @soluong int
		 declare @soluongX int 
		set @soluong=(select SoLuong from deleted)
		set @soluongX=(select SoLuong from inserted)
		update MayTinh set SoLuong=SoLuong-(@soluongX-@soluong)
		 end

go

create trigger SuaN
on HoaDonNhap
for update
as
begin 
		 declare @soluong int
		 declare @soluongN int 
		 set @soluong=(select SoLuong from deleted)
		 set @soluongN=(select SoLuong from inserted)
		update MayTinh set SoLuong=SoLuong+(@soluongN-@soluong)
		 end
		

go

create trigger XoaN
on HoaDonNhap
after delete
as
begin
 declare @MaHDN char(10)

 declare @MaNCC char(10)
 declare @MaMayTinh char(10)
 declare @SoLuong int
 declare @GiaNhap decimal(18,0)
 declare @ThanhTien decimal(18,0)
 declare @NgayNhap date
 select @MaHDN=MaHDN,@MaNCC=MaNCC,@MaMayTinh=MaMayTinh,@SoLuong=SoLuong,@GiaNhap=GiaNhap,@ThanhTien=ThanhTien,@NgayNhap=NgayNhap from deleted
 insert into MayTinh values('m1','TenMayTinh',@MaNCC,@SoLuong,1000,'2022-1-1','2020-2-2','cc')

end

----
go
create trigger XoaX
on HoaDonXuat
after delete
as
begin
 declare @MaHDX char(10)

 declare @MaKH char(10)
 declare @MaMayTinh char(10)
 declare @SoLuong int
 declare @DonGia decimal(18,0)
 declare @NgayXuat date
 declare @ThanhTien decimal(18,0)
 select @MaHDX=MaHDX,@MaKH=MaKH,@MaMayTinh=MaMayTinh,@SoLuong=SoLuong,@DonGia=DonGia,@ThanhTien=ThanhTien,@NgayXuat=NgayXuat from deleted
 insert into MayTinh values(@MaMayTinh,'TenMayTinh','MaNCC',@SoLuong,1000,'2022-1-1','2020-2-2','cc')
end