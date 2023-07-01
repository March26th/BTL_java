package quanlykhomaytinh;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class MayTinh extends javax.swing.JInternalFrame {

    Connection connMayTinh = null;
    Connection conn = null;
    ResultSet rsMayTinh = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    DefaultTableModel dtMayTinh = null;
    PreparedStatement pstMayTinh = null;
    DefaultComboBoxModel dcb = null;

    public MayTinh() {
        initComponents();
        connMayTinh = JavaConnect.ConnectDB();
        conn = JavaConnect.ConnectDB();
        dtMayTinh = (DefaultTableModel) jTableMayTinh.getModel();
        dcb = new DefaultComboBoxModel();
        updateTableMayTinh();
        //fillComboMaNhaCungCapNhap();

    }

    //update table thuoc
    public void updateTableMayTinh() {
        while (dtMayTinh.getRowCount() > 0) {
            dtMayTinh.removeRow(0);
        }
        String sql = "select  MayTinh.MaMayTinh, MayTinh.TenMayTinh, NhaCungCap.TenNhaCC, MayTinh.SoLuong, MayTinh.DonGia, MayTinh.HanSD, MayTinh.NgaySX,MayTinh.CongDung from  NhaCungCap INNER JOIN MayTinh ON NhaCungCap.MaNCC = MayTinh.MaNCC";
        String row[] = new String[8];
        try {
            pstMayTinh = connMayTinh.prepareStatement(sql);
            rsMayTinh = pstMayTinh.executeQuery();
            while (rsMayTinh.next()) {
                row[0] = rsMayTinh.getString(1);
                row[1] = rsMayTinh.getString(2);
                row[2] = rsMayTinh.getString(3);
                row[3] = rsMayTinh.getString(4);
                row[4] = rsMayTinh.getString(5);
                row[5] = rsMayTinh.getString(6);
                row[6] = rsMayTinh.getString(7);
                row[7] = rsMayTinh.getString(8);
                dtMayTinh.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtMaMayTinh = new javax.swing.JTextField();
        txtTenMayTinh = new javax.swing.JTextField();
        jComboBoxNhaCungCap = new javax.swing.JComboBox<>();
        txtDonGia = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dateHSD = new javax.swing.JTextField();
        dateNSX = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMayTinh = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSuaMayTinh = new javax.swing.JButton();
        btnXoaMayTinh = new javax.swing.JButton();
        btnThemMayTinh = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTimKiemMaMayTinh = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setTitle("Quản lý máy tính");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel38.setText("Mã máy tính");

        jLabel37.setText("Tên máy tính");

        jLabel43.setText("Nhà cung cấp");

        jLabel39.setText("Số lượng");

        jLabel41.setText("Đơn giá");

        jLabel44.setText("Hạn sử dụng");

        jLabel45.setText("Công dụng");

        txtMaMayTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMayTinhActionPerformed(evt);
            }
        });

        jLabel42.setText("Ngày Sản xuất");

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel42)
                            .addComponent(jLabel45)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDonGia)
                        .addComponent(txtMaMayTinh, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTenMayTinh, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxNhaCungCap, javax.swing.GroupLayout.Alignment.LEADING, 0, 229, Short.MAX_VALUE)
                        .addComponent(txtSoLuong)
                        .addComponent(dateHSD, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateNSX, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtMaMayTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtTenMayTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jComboBoxNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(dateHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(dateNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTableMayTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã máy tính", "Tên máy tính", "Nhà cung cấp", "Số lượng", "Đơn giá", "Hạn sử dụng", "Ngày sản xuất", "Công dụng"
            }
        ));
        jTableMayTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMayTinhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMayTinh);
        if (jTableMayTinh.getColumnModel().getColumnCount() > 0) {
            jTableMayTinh.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 153))); // NOI18N

        btnSuaMayTinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSuaMayTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sửa1.png"))); // NOI18N
        btnSuaMayTinh.setText("Sửa");
        btnSuaMayTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaMayTinhActionPerformed(evt);
            }
        });

        btnXoaMayTinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaMayTinh.setForeground(new java.awt.Color(255, 0, 0));
        btnXoaMayTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thunggiac2.png"))); // NOI18N
        btnXoaMayTinh.setText("Xóa");
        btnXoaMayTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMayTinhActionPerformed(evt);
            }
        });

        btnThemMayTinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemMayTinh.setForeground(new java.awt.Color(0, 153, 0));
        btnThemMayTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them1.png"))); // NOI18N
        btnThemMayTinh.setText("Thêm");
        btnThemMayTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMayTinhActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset1.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThemMayTinh)
                .addGap(41, 41, 41)
                .addComponent(btnSuaMayTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(40, 40, 40)
                .addComponent(btnXoaMayTinh)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMayTinh)
                    .addComponent(btnSuaMayTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaMayTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jLabel8.setText("Mã máy tính");

        txtTimKiemMaMayTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemMaMayTinhActionPerformed(evt);
            }
        });
        txtTimKiemMaMayTinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemMaMayTinhKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtTimKiemMaMayTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtTimKiemMaMayTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMayTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMayTinhMouseClicked
        // TODO add your handling code here:

        int row = jTableMayTinh.rowAtPoint(evt.getPoint());
        txtMaMayTinh.setText(jTableMayTinh.getValueAt(row, 0).toString());
        jComboBoxNhaCungCap.setSelectedItem(jTableMayTinh.getValueAt(row, 2).toString());
        txtTenMayTinh.setText(jTableMayTinh.getValueAt(row, 1).toString());
        txtSoLuong.setText(jTableMayTinh.getValueAt(row, 3).toString());
        txtDonGia.setText(jTableMayTinh.getValueAt(row, 4).toString());
        dateHSD.setText(jTableMayTinh.getValueAt(row, 5).toString());
        dateNSX.setText(jTableMayTinh.getValueAt(row, 6).toString());
        jTextArea1.setText(jTableMayTinh.getValueAt(row, 7).toString());
        txtMaMayTinh.enable(false);
    }//GEN-LAST:event_jTableMayTinhMouseClicked

    private void btnThemMayTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMayTinhActionPerformed
        // TODO add your handling code here:
        DisplayValueModel dvm = (DisplayValueModel) jComboBoxNhaCungCap.getSelectedItem();
        if (txtMaMayTinh.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập mã máy tính");
        } else if (txtTenMayTinh.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập tên máy tính");
        } else if (txtSoLuong.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập số lượng");
        } else if (txtDonGia.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập đơn giá");
        } else if (jTextArea1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập công dụng");
        } else {
            try {
                if (ExceptionString.isUnicode(txtMaMayTinh.getText())) {
                    JOptionPane.showMessageDialog(null, "Mã máy tính không chứa kí tự đặc biệt");
                } else if (ExceptionString.isSpace(txtMaMayTinh.getText())) {
                    JOptionPane.showMessageDialog(null, "Mã máy tính không khoảng trắng");
                } else {
                    try {
                        String sql = "Insert into MayTinh(MaMayTinh,TenMayTinh,MaNCC,SoLuong,DonGia,HanSD,NgaySX,CongDung) values (?,?,?,?,?,CONVERT(DATETIME,?, 102),CONVERT(DATETIME,?, 102),?)";
                        pstMayTinh = connMayTinh.prepareStatement(sql);
                        pstMayTinh.setString(1, txtMaMayTinh.getText());
                        pstMayTinh.setString(2, txtTenMayTinh.getText());
                        pstMayTinh.setString(3, dvm.valueMember.toString());
                        pstMayTinh.setString(4, txtSoLuong.getText());
                        pstMayTinh.setString(5, txtDonGia.getText());
                        pstMayTinh.setString(6, dateHSD.getText());
                        pstMayTinh.setString(7, dateNSX.getText());
                        pstMayTinh.setString(8, jTextArea1.getText());
                        pstMayTinh.execute();
                        JOptionPane.showMessageDialog(null, "Lưu thành công");
                        clean();
                    } catch (SQLException | HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Mã bị trùng" + e);
                    }
                    updateTableMayTinh();
                }
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemMayTinhActionPerformed

    private void btnXoaMayTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMayTinhActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa", "Xóa", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            String sql = "delete from MayTinh where MaMayTinh =?";
            try {
                pstMayTinh = connMayTinh.prepareStatement(sql);
                pstMayTinh.setString(1, txtMaMayTinh.getText());
                pstMayTinh.execute();
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                clean();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại" + e);
            }
            updateTableMayTinh();
        }
    }//GEN-LAST:event_btnXoaMayTinhActionPerformed

    private void btnSuaMayTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaMayTinhActionPerformed

        if (txtTenMayTinh.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Cần Chọn dòng cần sửa");
        } else if (txtSoLuong.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập số lượng");
        } else if (txtDonGia.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập đơn giá");
        } else if (jTextArea1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa nhập công dụng");
        } else if (ExceptionString.isNumber(txtSoLuong.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Số lượng phải là 1 số");
        } else if (ExceptionString.isNumber(txtDonGia.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Đơn giá phải là 1 số");
        } else {
            try {

                String value1 = txtMaMayTinh.getText();
                String value2 = txtTenMayTinh.getText();
                DisplayValueModel Mt = (DisplayValueModel) jComboBoxNhaCungCap.getSelectedItem();
                String value4 = txtSoLuong.getText();
                String value5 = txtDonGia.getText();
                String value6 = dateNSX.getText();
                String value7 = dateHSD.getText();
                String value8 = jTextArea1.getText();

                String sql = "update MayTinh set TenMayTinh =?, MaNCC =?, SoLuong =?, DonGia =?, HanSD =?, NgaySX =?, CongDung =? where MaMayTinh=?";

                pst = connMayTinh.prepareStatement(sql);
                pst.setString(1, value2);
                pst.setString(2, Mt.valueMember.toString());
                pst.setString(3, value4);
                pst.setString(4, value5);
                pst.setString(5, value7);
                pst.setString(6, value6);
                pst.setString(7, value8);
                pst.setString(8, value1);

                pst.execute();
                JOptionPane.showMessageDialog(null, "Sửa thành công");
                clean();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Sửa thất bại" + e);
            }
            updateTableMayTinh();
        }


    }//GEN-LAST:event_btnSuaMayTinhActionPerformed

    private void clean() {
        txtMaMayTinh.setText("");
        txtTenMayTinh.setText("");
        txtSoLuong.setText("");
        txtDonGia.setText("");
        jTextArea1.setText("");
        txtMaMayTinh.enable(true);
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        clean();
        updateTableMayTinh();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtTimKiemMaMayTinhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemMaMayTinhKeyReleased
        while (dtMayTinh.getRowCount() > 0) {
            dtMayTinh.removeRow(0);
        }
        String sql = "select * from MayTinh where MaMayTinh=?";
        String row[] = new String[8];
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtTimKiemMaMayTinh.getText());
            rs = pst.executeQuery();
            while (rs.next()) {

                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                dtMayTinh.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tìm kiếm thất bại");
        }
    }//GEN-LAST:event_txtTimKiemMaMayTinhKeyReleased

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtMaMayTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMayTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMayTinhActionPerformed

    private void txtTimKiemMaMayTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemMaMayTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemMaMayTinhActionPerformed

    public void fillComboMaNhaCungCapNhap() {
        String sql = "Select * from NhaCungCap";
        try {
            pst = conn.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String tenNhaCungCap = rs.getString("TenNhaCC");
                String maNhaCungCap = rs.getString("MaNCC");
                DisplayValueModel dvn = new DisplayValueModel(tenNhaCungCap, maNhaCungCap);
                dcb.addElement(dvn);
            }
            jComboBoxNhaCungCap.setModel(dcb);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSuaMayTinh;
    private javax.swing.JButton btnThemMayTinh;
    private javax.swing.JButton btnXoaMayTinh;
    private javax.swing.JTextField dateHSD;
    private javax.swing.JTextField dateNSX;
    private javax.swing.JComboBox<String> jComboBoxNhaCungCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMayTinh;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaMayTinh;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMayTinh;
    private javax.swing.JTextField txtTimKiemMaMayTinh;
    // End of variables declaration//GEN-END:variables
}
