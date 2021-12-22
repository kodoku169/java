/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import com.edusys.utils.XJdbc;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author phuho
 */
public class EduVNJFrame extends javax.swing.JFrame {

    public EduVNJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        pnlTrump = new javax.swing.JPanel();
        lblTrump = new javax.swing.JLabel();
        pnlStatusBar = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniHocVien = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniBangDiem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniLuongNguoiHoc = new javax.swing.JMenuItem();
        mniDiemChuyenDe = new javax.swing.JMenuItem();
        mniDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        setPreferredSize(new java.awt.Dimension(918, 612));

        toolBar.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(51, 51, 51));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        toolBar.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKetThuc.setForeground(new java.awt.Color(51, 51, 51));
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Stop.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        toolBar.add(btnKetThuc);
        toolBar.add(jSeparator6);

        btnChuyenDe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChuyenDe.setForeground(new java.awt.Color(51, 51, 51));
        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Lists.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        toolBar.add(btnChuyenDe);

        btnNguoiHoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNguoiHoc.setForeground(new java.awt.Color(51, 51, 51));
        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Conference.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        toolBar.add(btnNguoiHoc);

        btnKhoaHoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKhoaHoc.setForeground(new java.awt.Color(51, 51, 51));
        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Certificate.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        toolBar.add(btnKhoaHoc);

        btnHocVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHocVien.setForeground(new java.awt.Color(51, 51, 51));
        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/User.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        toolBar.add(btnHocVien);
        toolBar.add(jSeparator7);

        btnHuongDan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuongDan.setForeground(new java.awt.Color(51, 51, 51));
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        toolBar.add(btnHuongDan);

        getContentPane().add(toolBar, java.awt.BorderLayout.NORTH);

        lblTrump.setBackground(new java.awt.Color(255, 255, 255));
        lblTrump.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrump.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/trump-logo.png"))); // NOI18N
        lblTrump.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTrump.setOpaque(true);

        javax.swing.GroupLayout pnlTrumpLayout = new javax.swing.GroupLayout(pnlTrump);
        pnlTrump.setLayout(pnlTrumpLayout);
        pnlTrumpLayout.setHorizontalGroup(
            pnlTrumpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrump, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        pnlTrumpLayout.setVerticalGroup(
            pnlTrumpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlTrump, java.awt.BorderLayout.CENTER);

        pnlStatusBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlStatusBar.setLayout(new java.awt.BorderLayout());

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Info.png"))); // NOI18N
        lblTrangThai.setText("Hệ thống quản lý đào tạo");
        lblTrangThai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnlStatusBar.add(lblTrangThai, java.awt.BorderLayout.CENTER);

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("00:00 PM");
        lblDongHo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        pnlStatusBar.add(lblDongHo, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlStatusBar, java.awt.BorderLayout.SOUTH);

        menuBar.setPreferredSize(new java.awt.Dimension(248, 27));

        mnuHeThong.setForeground(new java.awt.Color(255, 255, 255));
        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/fpt.png"))); // NOI18N
        mnuHeThong.setText("Hệ thống");
        mnuHeThong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuHeThong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuHeThong.setPreferredSize(new java.awt.Dimension(103, 22));

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator2);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Log out.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator1);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        mnuQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Hierarchy.png"))); // NOI18N
        mnuQuanLy.setText("Quản lý");
        mnuQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuQuanLy.setPreferredSize(new java.awt.Dimension(103, 22));

        mniChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Lists.png"))); // NOI18N
        mniChuyenDe.setText("Chuyên đề");
        mniChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniChuyenDe);

        mniKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Certificate.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa học");
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhoaHoc);

        mniNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Conference.png"))); // NOI18N
        mniNguoiHoc.setText("Người học");
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/User.png"))); // NOI18N
        mniHocVien.setText("Học viên");
        mniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHocVien);
        mnuQuanLy.add(jSeparator4);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/User group.png"))); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        menuBar.add(mnuQuanLy);

        mnuThongKe.setForeground(new java.awt.Color(255, 255, 255));
        mnuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Statistics.png"))); // NOI18N
        mnuThongKe.setText("Thống kê");
        mnuThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuThongKe.setPreferredSize(new java.awt.Dimension(103, 22));

        mniBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Card file.png"))); // NOI18N
        mniBangDiem.setText("Bảng điểm");
        mniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniBangDiem);
        mnuThongKe.add(jSeparator3);

        mniLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Clien list.png"))); // NOI18N
        mniLuongNguoiHoc.setText("Lượng người học");
        mniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLuongNguoiHoc);

        mniDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Bar chart.png"))); // NOI18N
        mniDiemChuyenDe.setText("Điểm chuyên đề");
        mniDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDiemChuyenDe);

        mniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Dollar.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        menuBar.add(mnuThongKe);

        mnuTroGiup.setForeground(new java.awt.Color(255, 255, 255));
        mnuTroGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Favourites.png"))); // NOI18N
        mnuTroGiup.setText("Trợ giúp");
        mnuTroGiup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuTroGiup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuTroGiup.setPreferredSize(new java.awt.Dimension(103, 22));

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Globe.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng");
        mnuTroGiup.add(mniHuongDan);
        mnuTroGiup.add(jSeparator5);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Brick house.png"))); // NOI18N
        mniGioiThieu.setText("Giới thiệu sản phẩm");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        menuBar.add(mnuTroGiup);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        moNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        moNguoiHoc();
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        moNhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenDeActionPerformed
        moChuyenDe();
    }//GEN-LAST:event_mniChuyenDeActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        moChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        moGioiThieu();
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        moDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        moHocVien();
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void mniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocVienActionPerformed
        moHocVien();
    }//GEN-LAST:event_mniHocVienActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        moKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        moKhoaHoc();
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemActionPerformed
        moThongKe(0);
    }//GEN-LAST:event_mniBangDiemActionPerformed

    private void mniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNguoiHocActionPerformed
        moThongKe(1);
    }//GEN-LAST:event_mniLuongNguoiHocActionPerformed

    private void mniDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemChuyenDeActionPerformed
        moThongKe(2);
    }//GEN-LAST:event_mniDiemChuyenDeActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        moThongKe(3);
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        moHuongDan();
    }//GEN-LAST:event_btnHuongDanActionPerformed

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
            java.util.logging.Logger.getLogger(EduVNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduVNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduVNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduVNJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduVNJFrame().setVisible(true);
            }
        });
    }

    public void setStyle() {
        this.getContentPane().setBackground(new Color(255, 255, 153));
        pnlStatusBar.setBackground(new Color(255, 255, 153));
        menuBar.setBackground(new Color(0, 51, 102));
        menuBar.setUI(new BasicMenuBarUI());
    }

    public void init() {
        if (XJdbc.checkConnectSQL() != "OK") {
            MsgBox.alert(this, XJdbc.checkConnectSQL());
            System.exit(0);
        }
        startDongHo();
        setIconImage(XImage.getAppIcon());
        new ChaoJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        lblTrangThai.setText("Hệ thống quản lý đào tạo - Online: " + Auth.user.getHoTen());
        setStyle();
    }

    public void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblDongHo.setText(formater.format(new Date()));
        }).start();
    }

    public void dangXuat() {
        Auth.clear();
        lblTrangThai.setText("Hệ thống quản lý đào tạo - Offline");
        new DangNhapJDialog(this, true).setVisible(true);
        lblTrangThai.setText("Hệ thống quản lý đào tạo - Online: " + Auth.user.getHoTen());
    }

    public void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }

    public void moNhanVien() {
        if (Auth.isLogin()) {
            new NhanVienJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moNguoiHoc() {
        if (Auth.isLogin()) {
            new NguoiHocJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moChuyenDe() {
        if (Auth.isLogin()) {
            new ChuyenDeJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moGioiThieu() {
        if (Auth.isLogin()) {
            new GioiThieuJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhauJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moHocVien() {
        if (Auth.isLogin()) {
            new HocVienJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moKhoaHoc() {
        if (Auth.isLogin()) {
            new KhoaHocJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 3 && !Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu");
                return;
            }
            ThongKeJDialog thongKeJDialog = new ThongKeJDialog(this, true);
            thongKeJDialog.selectTab(index);
            thongKeJDialog.setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    public void moHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/Document.pdf").toURI());
        } catch (IOException ex) {
            MsgBox.alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTrump;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemChuyenDe;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongNguoiHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlStatusBar;
    private javax.swing.JPanel pnlTrump;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

}
