/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import java.io.IOException;

/**
 *
 * @author sironi.tiziano(grafica) negri.gioele (logica)
 */
public class Game extends javax.swing.JFrame {
    public Game() {
        initComponents();       
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Othello");
        setBackground(new java.awt.Color(110, 110, 110));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 101, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 94), 4));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(8, 8, 8, 8));

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()-250f));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton1.setText("<1>, <1>"); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setAlignmentY(0.0F);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getSize()-250f));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton2.setText("<1>, <2>");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton2);

        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getSize()-250f));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton3.setText("<1>, <3>");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton3);

        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getSize()-250f));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton4.setText("<1>, <4>");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton4);

        jButton5.setFont(jButton5.getFont().deriveFont(jButton5.getFont().getSize()-250f));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton5.setText("<1>, <5>");
        jButton5.setToolTipText("");
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton5);

        jButton6.setFont(jButton6.getFont().deriveFont(jButton6.getFont().getSize()-250f));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton6.setText("<1>, <6>");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton6);

        jButton7.setFont(jButton7.getFont().deriveFont(jButton7.getFont().getSize()-250f));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton7.setText("<1>, <7>");
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton7);

        jButton8.setFont(jButton8.getFont().deriveFont(jButton8.getFont().getSize()-250f));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton8.setText("<1>, <8>");
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton8);

        jButton9.setFont(jButton9.getFont().deriveFont(jButton9.getFont().getSize()-250f));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton9.setText("<2>, <1>");
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton9);

        jButton10.setFont(jButton10.getFont().deriveFont(jButton10.getFont().getSize()-250f));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton10.setText("<2>, <2>");
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton10);

        jButton11.setFont(jButton11.getFont().deriveFont(jButton11.getFont().getSize()-250f));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton11.setText("<2>, <3>");
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton11);

        jButton12.setFont(jButton12.getFont().deriveFont(jButton12.getFont().getSize()-250f));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton12.setText("<2>, <4>");
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton12);

        jButton13.setFont(jButton13.getFont().deriveFont(jButton13.getFont().getSize()-250f));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton13.setText("<2>, <5>");
        jButton13.setContentAreaFilled(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton13);

        jButton14.setFont(jButton14.getFont().deriveFont(jButton14.getFont().getSize()-250f));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton14.setText("<2>, <6>");
        jButton14.setContentAreaFilled(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton14);

        jButton15.setFont(jButton15.getFont().deriveFont(jButton15.getFont().getSize()-250f));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton15.setText("<2>, <7>");
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton15);

        jButton16.setFont(jButton16.getFont().deriveFont(jButton16.getFont().getSize()-250f));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton16.setText("<2>, <8>");
        jButton16.setContentAreaFilled(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton16);

        jButton17.setFont(jButton17.getFont().deriveFont(jButton17.getFont().getSize()-250f));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton17.setText("<3>, <1>");
        jButton17.setContentAreaFilled(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton17);

        jButton18.setFont(jButton18.getFont().deriveFont(jButton18.getFont().getSize()-250f));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton18.setText("<3>, <2>");
        jButton18.setContentAreaFilled(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton18);

        jButton19.setFont(jButton19.getFont().deriveFont(jButton19.getFont().getSize()-250f));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton19.setText("<3>, <3>");
        jButton19.setContentAreaFilled(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton19);

        jButton20.setFont(jButton20.getFont().deriveFont(jButton20.getFont().getSize()-250f));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton20.setText("<3>, <4>");
        jButton20.setContentAreaFilled(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton20);

        jButton21.setFont(jButton21.getFont().deriveFont(jButton21.getFont().getSize()-250f));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton21.setText("<3>, <5>");
        jButton21.setContentAreaFilled(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton21);

        jButton22.setFont(jButton22.getFont().deriveFont(jButton22.getFont().getSize()-250f));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton22.setText("<3>, <6>");
        jButton22.setContentAreaFilled(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton22);

        jButton23.setFont(jButton23.getFont().deriveFont(jButton23.getFont().getSize()-250f));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton23.setText("<3>, <7>");
        jButton23.setContentAreaFilled(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);

        jButton24.setFont(jButton24.getFont().deriveFont(jButton24.getFont().getSize()-250f));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton24.setText("<3>, <8>");
        jButton24.setContentAreaFilled(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton24);

        jButton25.setFont(jButton25.getFont().deriveFont(jButton25.getFont().getSize()-250f));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton25.setText("<4>, <1>");
        jButton25.setToolTipText("");
        jButton25.setContentAreaFilled(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton25);

        jButton26.setFont(jButton26.getFont().deriveFont(jButton26.getFont().getSize()-250f));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton26.setText("<4>, <2>");
        jButton26.setContentAreaFilled(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton26);

        jButton27.setFont(jButton27.getFont().deriveFont(jButton27.getFont().getSize()-250f));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton27.setText("<4>, <3>");
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton27);

        jButton28.setFont(jButton28.getFont().deriveFont(jButton28.getFont().getSize()-250f));
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/white.png"))); // NOI18N
        jButton28.setText("<4>, <4>");
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton28);

        jButton29.setFont(jButton29.getFont().deriveFont(jButton29.getFont().getSize()-250f));
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/black.png"))); // NOI18N
        jButton29.setText("<4>, <5>");
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton29);

        jButton30.setFont(jButton30.getFont().deriveFont(jButton30.getFont().getSize()-250f));
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton30.setText("<4>, <6>");
        jButton30.setContentAreaFilled(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton30);

        jButton31.setFont(jButton31.getFont().deriveFont(jButton31.getFont().getSize()-250f));
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton31.setText("<4>, <7>");
        jButton31.setContentAreaFilled(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton31);

        jButton32.setFont(jButton32.getFont().deriveFont(jButton32.getFont().getSize()-250f));
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton32.setText("<4>, <8>");
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton32);

        jButton33.setFont(jButton33.getFont().deriveFont(jButton33.getFont().getSize()-250f));
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton33.setText("<5>, <1>");
        jButton33.setContentAreaFilled(false);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton33);

        jButton34.setFont(jButton34.getFont().deriveFont(jButton34.getFont().getSize()-250f));
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton34.setText("<5>, <2>");
        jButton34.setContentAreaFilled(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton34);

        jButton35.setFont(jButton35.getFont().deriveFont(jButton35.getFont().getSize()-250f));
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton35.setText("<5>, <3>");
        jButton35.setContentAreaFilled(false);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton35);

        jButton36.setFont(jButton36.getFont().deriveFont(jButton36.getFont().getSize()-250f));
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/black.png"))); // NOI18N
        jButton36.setText("<5>, <4>");
        jButton36.setContentAreaFilled(false);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton36);

        jButton37.setFont(jButton37.getFont().deriveFont(jButton37.getFont().getSize()-250f));
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/white.png"))); // NOI18N
        jButton37.setText("<5>, <5>");
        jButton37.setContentAreaFilled(false);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton37);

        jButton38.setFont(jButton38.getFont().deriveFont(jButton38.getFont().getSize()-250f));
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton38.setText("<5>, <6>");
        jButton38.setContentAreaFilled(false);
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton38);

        jButton39.setFont(jButton39.getFont().deriveFont(jButton39.getFont().getSize()-250f));
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton39.setText("<5>, <7>");
        jButton39.setContentAreaFilled(false);
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton39);

        jButton40.setFont(jButton40.getFont().deriveFont(jButton40.getFont().getSize()-250f));
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton40.setText("<5>, <8>");
        jButton40.setContentAreaFilled(false);
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton40);

        jButton41.setFont(jButton41.getFont().deriveFont(jButton41.getFont().getSize()-250f));
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton41.setText("<6>, <1>");
        jButton41.setContentAreaFilled(false);
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton41);

        jButton42.setFont(jButton42.getFont().deriveFont(jButton42.getFont().getSize()-250f));
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton42.setText("<6>, <2>");
        jButton42.setContentAreaFilled(false);
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton42);

        jButton43.setFont(jButton43.getFont().deriveFont(jButton43.getFont().getSize()-250f));
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton43.setText("<6>, <3>");
        jButton43.setContentAreaFilled(false);
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton43);

        jButton44.setFont(jButton44.getFont().deriveFont(jButton44.getFont().getSize()-250f));
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton44.setText("<6>, <4>");
        jButton44.setContentAreaFilled(false);
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton44);

        jButton45.setFont(jButton45.getFont().deriveFont(jButton45.getFont().getSize()-250f));
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton45.setText("<6>, <5>");
        jButton45.setContentAreaFilled(false);
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton45);

        jButton46.setFont(jButton46.getFont().deriveFont(jButton46.getFont().getSize()-250f));
        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton46.setText("<6>, <6>");
        jButton46.setContentAreaFilled(false);
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton46);

        jButton47.setFont(jButton47.getFont().deriveFont(jButton47.getFont().getSize()-250f));
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton47.setText("<6>, <7>");
        jButton47.setContentAreaFilled(false);
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton47);

        jButton48.setFont(jButton48.getFont().deriveFont(jButton48.getFont().getSize()-250f));
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton48.setText("<6>, <8>");
        jButton48.setContentAreaFilled(false);
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton48);

        jButton49.setFont(jButton49.getFont().deriveFont(jButton49.getFont().getSize()-250f));
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton49.setToolTipText("<7>, <1>");
        jButton49.setContentAreaFilled(false);
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton49);

        jButton50.setFont(jButton50.getFont().deriveFont(jButton50.getFont().getSize()-250f));
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton50.setText("<7>, <2>");
        jButton50.setContentAreaFilled(false);
        jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton50);

        jButton51.setFont(jButton51.getFont().deriveFont(jButton51.getFont().getSize()-250f));
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton51.setText("<7>, <3>");
        jButton51.setContentAreaFilled(false);
        jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton51);

        jButton52.setFont(jButton52.getFont().deriveFont(jButton52.getFont().getSize()-250f));
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton52.setText("<7>, <4>");
        jButton52.setContentAreaFilled(false);
        jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton52);

        jButton53.setFont(jButton53.getFont().deriveFont(jButton53.getFont().getSize()-250f));
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton53.setText("<7>, <5>");
        jButton53.setContentAreaFilled(false);
        jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton53);

        jButton54.setFont(jButton54.getFont().deriveFont(jButton54.getFont().getSize()-250f));
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton54.setText("<7>, <6>");
        jButton54.setContentAreaFilled(false);
        jButton54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton54);

        jButton55.setFont(jButton55.getFont().deriveFont(jButton55.getFont().getSize()-250f));
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton55.setText("<7>, <7>");
        jButton55.setContentAreaFilled(false);
        jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton55);

        jButton56.setFont(jButton56.getFont().deriveFont(jButton56.getFont().getSize()-250f));
        jButton56.setForeground(new java.awt.Color(255, 255, 255));
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton56.setText("<7>, <8>");
        jButton56.setContentAreaFilled(false);
        jButton56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton56);

        jButton57.setFont(jButton57.getFont().deriveFont(jButton57.getFont().getSize()-250f));
        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton57.setText("<8>, <1>");
        jButton57.setContentAreaFilled(false);
        jButton57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton57);

        jButton58.setFont(jButton58.getFont().deriveFont(jButton58.getFont().getSize()-250f));
        jButton58.setForeground(new java.awt.Color(255, 255, 255));
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton58.setText("<8>, <2>");
        jButton58.setContentAreaFilled(false);
        jButton58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton58);

        jButton59.setFont(jButton59.getFont().deriveFont(jButton59.getFont().getSize()-250f));
        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton59.setText("<8>, <3>");
        jButton59.setToolTipText("");
        jButton59.setContentAreaFilled(false);
        jButton59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton59);

        jButton60.setFont(jButton60.getFont().deriveFont(jButton60.getFont().getSize()-250f));
        jButton60.setForeground(new java.awt.Color(255, 255, 255));
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton60.setText("<8>, <4>");
        jButton60.setContentAreaFilled(false);
        jButton60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton60);

        jButton61.setFont(jButton61.getFont().deriveFont(jButton61.getFont().getSize()-250f));
        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton61.setText("<8>, <5>");
        jButton61.setContentAreaFilled(false);
        jButton61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton61);

        jButton62.setFont(jButton62.getFont().deriveFont(jButton62.getFont().getSize()-250f));
        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton62.setText("<8>, <6>");
        jButton62.setContentAreaFilled(false);
        jButton62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton62);

        jButton63.setFont(jButton63.getFont().deriveFont(jButton63.getFont().getSize()-250f));
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton63.setText("<8>, <7>");
        jButton63.setContentAreaFilled(false);
        jButton63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton63);

        jButton64.setFont(jButton64.getFont().deriveFont(jButton64.getFont().getSize()-250f));
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton64.setText("<8>, <8>");
        jButton64.setContentAreaFilled(false);
        jButton64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton64);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("     a            b          c           d          e            f           g          h");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");
        jLabel9.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("3");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("4");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("5");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("6");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("7");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("8");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cambiaColoreW(){
        
    }
    
    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String posizione = "<1><1>";
        System.out.println("pos" + posizione);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Server server = new Server();
        //Client client = new Client();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String posizione;
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("othello.png")));
    }
}
