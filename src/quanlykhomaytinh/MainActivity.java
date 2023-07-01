package quanlykhomaytinh;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JFrame;
import HoiDap.HoiDap;
import javax.swing.JOptionPane;

public class MainActivity extends JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    HoaDon hoaDon = null;
    KhachHang khachHang = null;
    MayTinh maytinh = null;
    NhaCungCap nhacungcap = null;
    HoiDap hoidap = null;
    BaoCao.BaoCaoDoanhThuTheoNgay theongay = null;

    BaoCao.KhachHangUuTu nhanvien = null;
    BaoCao.MayTinhBanChayNhat chaynhat = null;
    
    KiemSoat.ThietLapThongSo thongso = null;
    KiemSoat.MayTinhSapHetHanSd saphethansd = null;

    /**
     * Creates new form Employee_info
     */
    public MainActivity() {
        initComponents();
        conn = JavaConnect.ConnectDB();
        displayAllTable();

    }

    //Display all table in jdesktop table
    private void displayAllTable() {

        nhacungcap = new NhaCungCap();
        nhacungcap.setVisible(true);
        jDestopTable.add(nhacungcap);

        maytinh = new MayTinh();
        maytinh.setVisible(true);
        jDestopTable.add(maytinh);

        khachHang = new KhachHang();
        khachHang.setVisible(true);
        jDestopTable.add(khachHang);

        hoaDon = new HoaDon();
        hoaDon.setVisible(true);
        jDestopTable.add(hoaDon);

    }
//
//    //close windown login
//

    public void closeWindownMainActivity() {
        WindowEvent winClosingEven = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEven);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDestopTable = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBarMain = new javax.swing.JMenuBar();
        jMenuNhaCungCap = new javax.swing.JMenu();
        jMenuKhachHang = new javax.swing.JMenu();
        jMenuMayTinh = new javax.swing.JMenu();
        jMenuHoaDonNhap = new javax.swing.JMenu();
        kiemsoat = new javax.swing.JMenu();
        ThongSo = new javax.swing.JMenu();
        HanSuDung = new javax.swing.JMenu();
        BaoCao = new javax.swing.JMenu();
        TheoNgay = new javax.swing.JMenu();
        theoKhachHang = new javax.swing.JMenu();
        BanChayNhat = new javax.swing.JMenu();
        HoiDap = new javax.swing.JMenu();
        jMenuDangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ HIỆU THUỐC");

        jDestopTable.setBackground(new java.awt.Color(204, 204, 204));
        jDestopTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jDestopTableLayout = new javax.swing.GroupLayout(jDestopTable);
        jDestopTable.setLayout(jDestopTableLayout);
        jDestopTableLayout.setHorizontalGroup(
            jDestopTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1329, Short.MAX_VALUE)
        );
        jDestopTableLayout.setVerticalGroup(
            jDestopTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN  LÝ  MÁY TÍNH MINH CHÂU");
        jLabel6.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo1.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo2.jpg"))); // NOI18N

        jMenuNhaCungCap.setBackground(new java.awt.Color(0, 51, 255));
        jMenuNhaCungCap.setText("Nhà Cung Cấp");
        jMenuNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNhaCungCapMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuNhaCungCap);

        jMenuKhachHang.setText("Khách Hàng");
        jMenuKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuKhachHangMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuKhachHang);

        jMenuMayTinh.setText("Máy Tính");
        jMenuMayTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMayTinhMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuMayTinh);

        jMenuHoaDonNhap.setText("Hóa Đơn");
        jMenuHoaDonNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHoaDonNhapMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuHoaDonNhap);

        kiemsoat.setText("Kiểm Soát");
        kiemsoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kiemsoatMouseClicked(evt);
            }
        });

        ThongSo.setText("Thông Số");
        ThongSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongSoMouseClicked(evt);
            }
        });
        kiemsoat.add(ThongSo);

        HanSuDung.setText("Thuốc sắp hết hạn sử dụng");
        HanSuDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HanSuDungMouseClicked(evt);
            }
        });
        kiemsoat.add(HanSuDung);

        jMenuBarMain.add(kiemsoat);

        BaoCao.setText("Báo Cáo");

        TheoNgay.setText("Báo Cáo Doanh Thu");
        TheoNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TheoNgayMouseClicked(evt);
            }
        });
        BaoCao.add(TheoNgay);

        theoKhachHang.setText("Khách Hàng Tiềm Năng");
        theoKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theoKhachHangMouseClicked(evt);
            }
        });
        BaoCao.add(theoKhachHang);

        BanChayNhat.setText("Ước tính thuốc bán chạy nhất");
        BanChayNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanChayNhatMouseClicked(evt);
            }
        });
        BaoCao.add(BanChayNhat);

        jMenuBarMain.add(BaoCao);

        HoiDap.setText("Hỏi Đáp");
        HoiDap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoiDapMouseClicked(evt);
            }
        });
        jMenuBarMain.add(HoiDap);

        jMenuDangXuat.setText("Đăng Xuất");
        jMenuDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDangXuatMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuDangXuat);

        setJMenuBar(jMenuBarMain);
        jMenuBarMain.getAccessibleContext().setAccessibleName("rêf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jDestopTable)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jDestopTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuKhachHangMouseClicked
        //TODO add your handling code here:
        // closeWindown();
        if (khachHang == null) {
            khachHang = new KhachHang();
            khachHang.setVisible(true);
            jDestopTable.add(khachHang);

        } else {
            khachHang.setVisible(true);
            hoaDon.setVisible(false);
            maytinh.setVisible(false);
            nhacungcap.setVisible(false);
        }
    }//GEN-LAST:event_jMenuKhachHangMouseClicked

    private void jMenuHoaDonNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHoaDonNhapMouseClicked
        if (hoaDon == null) {
            hoaDon = new HoaDon();

            hoaDon.setVisible(true);
            jDestopTable.add(hoaDon);

        } else {
            hoaDon.setVisible(true);
            khachHang.setVisible(false);
            maytinh.setVisible(false);
            nhacungcap.setVisible(false);
        }
        hoaDon.fillComboMaMayTinh();
        hoaDon.fillComboMaNhaCungCapNhap();
        hoaDon.fillComboMaKhachHangXuat();
    }//GEN-LAST:event_jMenuHoaDonNhapMouseClicked

    private void jMenuMayTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMayTinhMouseClicked
        // TODO add your handling code here:
        if (maytinh == null) {
            maytinh = new MayTinh();
            maytinh.setVisible(true);
            jDestopTable.add(maytinh);
        } else {
            maytinh.setVisible(true);
            khachHang.setVisible(false);
            hoaDon.setVisible(false);
            nhacungcap.setVisible(false);
        }
        maytinh.updateTableMayTinh();
        maytinh.fillComboMaNhaCungCapNhap();
    }//GEN-LAST:event_jMenuMayTinhMouseClicked

    private void jMenuNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNhaCungCapMouseClicked
        // TODO add your handling code here:
        if (nhacungcap == null) {
            nhacungcap = new NhaCungCap();
            nhacungcap.setVisible(true);
            jDestopTable.add(nhacungcap);
        } else {
            nhacungcap.setVisible(true);
            khachHang.setVisible(false);
            hoaDon.setVisible(false);
            maytinh.setVisible(false);
        }
    }//GEN-LAST:event_jMenuNhaCungCapMouseClicked

    private void jMenuDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDangXuatMouseClicked
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuDangXuatMouseClicked

    private void ThongSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongSoMouseClicked
        // TODO add your handling code here:
        thongso = new KiemSoat.ThietLapThongSo();
        thongso.setVisible(true);

    }//GEN-LAST:event_ThongSoMouseClicked

    private void kiemsoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kiemsoatMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_kiemsoatMouseClicked

    private void TheoNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TheoNgayMouseClicked
        // TODO add your handling code here:
        theongay = new BaoCao.BaoCaoDoanhThuTheoNgay();
        theongay.setVisible(true);

    }//GEN-LAST:event_TheoNgayMouseClicked

    private void HanSuDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HanSuDungMouseClicked
        // TODO add your handling code here:
        saphethansd = new KiemSoat.MayTinhSapHetHanSd();
        saphethansd.setVisible(true);

    }//GEN-LAST:event_HanSuDungMouseClicked

    private void theoKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theoKhachHangMouseClicked
        // TODO add your handling code here:
        nhanvien = new BaoCao.KhachHangUuTu();
        nhanvien.setVisible(true);

    }//GEN-LAST:event_theoKhachHangMouseClicked

    private void BanChayNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanChayNhatMouseClicked
        // TODO add your handling code here:
        chaynhat = new BaoCao.MayTinhBanChayNhat();
        chaynhat.setVisible(true);

    }//GEN-LAST:event_BanChayNhatMouseClicked

    private void HoiDapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoiDapMouseClicked
        // TODO add your handling code here:
        hoidap = new HoiDap();
        hoidap.setVisible(true);

    }//GEN-LAST:event_HoiDapMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BanChayNhat;
    private javax.swing.JMenu BaoCao;
    private javax.swing.JMenu HanSuDung;
    private javax.swing.JMenu HoiDap;
    private javax.swing.JMenu TheoNgay;
    private javax.swing.JMenu ThongSo;
    private javax.swing.JDesktopPane jDestopTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBarMain;
    private javax.swing.JMenu jMenuDangXuat;
    private javax.swing.JMenu jMenuHoaDonNhap;
    private javax.swing.JMenu jMenuKhachHang;
    private javax.swing.JMenu jMenuMayTinh;
    private javax.swing.JMenu jMenuNhaCungCap;
    private javax.swing.JMenu kiemsoat;
    private javax.swing.JMenu theoKhachHang;
    // End of variables declaration//GEN-END:variables
}
