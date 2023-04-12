package View.UI;

import java.awt.Color;
import javax.swing.JPanel;

public class QuanLyView extends javax.swing.JFrame {

    private JPanel childPanel;

    public QuanLyView() {
        initComponents();
        setMauMenu();
    }

    private void setMauMenu() {
        pnlTenPhanMem.setBackground(Color.decode("#302b63"));
        pnlThanhCongCu.setBackground(Color.decode("#24243e"));
        btnTrangChu.setBackground(Color.decode("#24243e"));
        btnBanHang.setBackground(Color.decode("#24243e"));
        btnHoaDon.setBackground(Color.decode("#24243e"));
        btnKhachHang.setBackground(Color.decode("#24243e"));
        btnSanPham.setBackground(Color.decode("#24243e"));
        btnNhanVien.setBackground(Color.decode("#24243e"));
        btnDangXuat.setBackground(Color.decode("#24243e"));
    }

    private void showPanel(JPanel panel) {
        childPanel = panel;
        pnlTong.removeAll();
        pnlTong.add(childPanel);
        pnlTong.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThanhMenu = new javax.swing.JPanel();
        pnlTenPhanMem = new javax.swing.JPanel();
        lblTenPhanMem = new javax.swing.JLabel();
        pnlThanhCongCu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        pnlTong = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlThanhMenu.setOpaque(false);
        pnlThanhMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenPhanMem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenPhanMem.setForeground(new java.awt.Color(255, 255, 255));
        lblTenPhanMem.setText("m0NESY Sport");

        javax.swing.GroupLayout pnlTenPhanMemLayout = new javax.swing.GroupLayout(pnlTenPhanMem);
        pnlTenPhanMem.setLayout(pnlTenPhanMemLayout);
        pnlTenPhanMemLayout.setHorizontalGroup(
            pnlTenPhanMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTenPhanMemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenPhanMem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTenPhanMemLayout.setVerticalGroup(
            pnlTenPhanMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTenPhanMemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTenPhanMem)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlThanhMenu.add(pnlTenPhanMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 157, -1));

        pnlThanhCongCu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\Home.png")); // NOI18N
        btnTrangChu.setText("Trang chủ");
        pnlThanhCongCu.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 145, 47));

        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\Cash register.png")); // NOI18N
        btnBanHang.setText("Bán hàng");
        pnlThanhCongCu.add(btnBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, 145, 47));

        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnSanPham.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\Box.png")); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        pnlThanhCongCu.add(btnSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 219, 145, 47));

        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\User group.png")); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        pnlThanhCongCu.add(btnKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 284, 145, 47));

        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\Clien list.png")); // NOI18N
        btnNhanVien.setText("Nhân viên");
        pnlThanhCongCu.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 349, 145, 47));

        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnHoaDon.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\Card file.png")); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        pnlThanhCongCu.add(btnHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, 145, 47));

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon("G:\\DuAn1\\POS_BMS\\src\\main\\java\\View\\UI\\icon\\Log out.png")); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        pnlThanhCongCu.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 414, 145, 47));

        pnlThanhMenu.add(pnlThanhCongCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, -1, 589));

        pnlTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTong.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlThanhMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTong, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThanhMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTong, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        showPanel(new ViewKhachHang());
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        showPanel(new ViewQuanLySP());
    }//GEN-LAST:event_btnSanPhamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel lblTenPhanMem;
    private javax.swing.JPanel pnlTenPhanMem;
    private javax.swing.JPanel pnlThanhCongCu;
    private javax.swing.JPanel pnlThanhMenu;
    private javax.swing.JPanel pnlTong;
    // End of variables declaration//GEN-END:variables
}
