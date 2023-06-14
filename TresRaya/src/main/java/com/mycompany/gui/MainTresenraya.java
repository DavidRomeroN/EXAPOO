/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.dao.ResultadosDao;
import com.mycompany.dao.ResultadosDaoI;
import com.mycompany.modelo.ResultadosTo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romer
 */
public class MainTresenraya extends javax.swing.JFrame {

    private String starGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;

    public MainTresenraya() {
        initComponents();
        NJugador1.setLayout(new BorderLayout());
        listarREsultados();
    }
    
    public void btnInicio(){
        NJugador1.removeAll();
        for (int i = 0; i < 20; i++) {
            boton[i]=new JButton(contenidoCal[i]);
            boton[i].setFont(new Font("Ink Free",Font.BOLD,15));
            NJugador1.add(boton[i]);
            boton[i].addActionListener(this);
        }
    }

    private void gameScore() {
        txtPJugador1.setText(String.valueOf(xCount));
        txtPJugador1.setText(String.valueOf(oCount));
    }

    private void elegir_a_jugador() {
        if (starGame.equalsIgnoreCase("X")) {
            starGame = "O";
        } else {
            starGame = "X";
        }
    }
    
   
    
    
    //GANADOR

    private void winnigGame() {
        String b1 = a00.getText();
        String b2 = a01.getText();
        String b3 = a02.getText();
        String b4 = a10.getText();
        String b5 = a11.getText();
        String b6 = a12.getText();
        String b7 = a20.getText();
        String b8 = a21.getText();
        String b9 = a22.getText();
        
        //ganador de x

        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a00.setBackground(Color.ORANGE);
            a01.setBackground(Color.ORANGE);
            a02.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }

        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a10.setBackground(Color.CYAN);
            a11.setBackground(Color.CYAN);
            a12.setBackground(Color.CYAN);
            xCount++;
            gameScore();

        }

        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a20.setBackground(Color.BLUE);
            a21.setBackground(Color.BLUE);
            a22.setBackground(Color.BLUE);
            xCount++;
            gameScore();

        }
        
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a00.setBackground(Color.ORANGE);
            a11.setBackground(Color.ORANGE);
            a22.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a02.setBackground(Color.ORANGE);
            a11.setBackground(Color.ORANGE);
            a20.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a00.setBackground(Color.ORANGE);
            a10.setBackground(Color.ORANGE);
            a20.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a01.setBackground(Color.ORANGE);
            a11.setBackground(Color.ORANGE);
            a21.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a02.setBackground(Color.ORANGE);
            a12.setBackground(Color.ORANGE);
            a22.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        //ganador de o

        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador O gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a00.setBackground(Color.PINK);
            a01.setBackground(Color.PINK);
            a02.setBackground(Color.PINK);
            xCount++;
            gameScore();

        }

        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador O gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a10.setBackground(Color.CYAN);
            a11.setBackground(Color.CYAN);
            a12.setBackground(Color.CYAN);
            xCount++;
            gameScore();

        }

        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador O gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a20.setBackground(Color.BLUE);
            a21.setBackground(Color.BLUE);
            a22.setBackground(Color.BLUE);
            xCount++;
            gameScore();

        }
        
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a00.setBackground(Color.ORANGE);
            a11.setBackground(Color.ORANGE);
            a22.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a02.setBackground(Color.ORANGE);
            a11.setBackground(Color.ORANGE);
            a20.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a00.setBackground(Color.ORANGE);
            a10.setBackground(Color.ORANGE);
            a20.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a01.setBackground(Color.ORANGE);
            a11.setBackground(Color.ORANGE);
            a21.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }
        
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Jugador X gano", "tictactoe", JOptionPane.INFORMATION_MESSAGE);
            a02.setBackground(Color.ORANGE);
            a12.setBackground(Color.ORANGE);
            a22.setBackground(Color.ORANGE);
            xCount++;
            gameScore();

        }

    }
    
     public void resetForm() {
        txtNJugador1.setText("");
        txtNJugador2.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        a20 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a00 = new javax.swing.JButton();
        a01 = new javax.swing.JButton();
        a02 = new javax.swing.JButton();
        txtPJugador2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JLabel();
        txtPJugador1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNJugador1 = new javax.swing.JLabel();
        txtNJugador2 = new javax.swing.JLabel();
        NJugador1 = new javax.swing.JTextField();
        NJugador2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        a20.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a20ActionPerformed(evt);
            }
        });

        a21.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a22.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });

        a10.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a11.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a00.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a00ActionPerformed(evt);
            }
        });

        a01.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a01ActionPerformed(evt);
            }
        });

        a02.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        a02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a02ActionPerformed(evt);
            }
        });

        txtPJugador2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPJugador2.setForeground(new java.awt.Color(255, 255, 255));
        txtPJugador2.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno:");

        txtJugador2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(255, 255, 255));
        txtJugador2.setText("Jugador 2:");

        txtJugador1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(255, 255, 255));
        txtJugador1.setText("Jugador 1:");

        txtPJugador1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPJugador1.setForeground(new java.awt.Color(255, 255, 255));
        txtPJugador1.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(a00, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJugador2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJugador1)
                    .addComponent(txtPJugador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPJugador2)
                    .addComponent(txtJugador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a00, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnReiniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnAnular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAnular.setText("SALIR");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Partida", "Nombre Jugador 1", "Nombre Jugador 2", "Nombre Ganador", "Puntuacion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tabla de Puntajes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNJugador1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNJugador1.setForeground(new java.awt.Color(255, 255, 255));
        txtNJugador1.setText("Nombre Jugador 1:");

        txtNJugador2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNJugador2.setForeground(new java.awt.Color(255, 255, 255));
        txtNJugador2.setText("Nombre Jugador 2:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnReiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNJugador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNJugador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNJugador1)
                    .addComponent(NJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNJugador2)
                    .addComponent(NJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirmar si quieres salir", "tictactoe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        a00.setEnabled(true);
        a01.setEnabled(true);
        a02.setEnabled(true);
        a10.setEnabled(true);
        a11.setEnabled(true);
        a12.setEnabled(true);
        a20.setEnabled(true);
        a21.setEnabled(true);
        a22.setEnabled(true);

        a00.setText("");
        a01.setText("");
        a02.setText("");
        a10.setText("");
        a11.setText("");
        a12.setText("");
        a20.setText("");
        a21.setText("");
        a22.setText("");

        a00.setBackground(Color.LIGHT_GRAY);
        a01.setBackground(Color.LIGHT_GRAY);
        a02.setBackground(Color.LIGHT_GRAY);
        a10.setBackground(Color.LIGHT_GRAY);
        a11.setBackground(Color.LIGHT_GRAY);
        a12.setBackground(Color.LIGHT_GRAY);
        a20.setBackground(Color.LIGHT_GRAY);
        a21.setBackground(Color.LIGHT_GRAY);
        a22.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        a00.setEnabled(true);
        a01.setEnabled(true);
        a02.setEnabled(true);
        a10.setEnabled(true);
        a11.setEnabled(true);
        a12.setEnabled(true);
        a20.setEnabled(true);
        a21.setEnabled(true);
        a22.setEnabled(true);

        txtPJugador1.setText("0");
        txtPJugador2.setText("0");

        a00.setText("");
        a01.setText("");
        a02.setText("");
        a10.setText("");
        a11.setText("");
        a12.setText("");
        a20.setText("");
        a21.setText("");
        a22.setText("");

        a00.setBackground(Color.LIGHT_GRAY);
        a01.setBackground(Color.LIGHT_GRAY);
        a02.setBackground(Color.LIGHT_GRAY);
        a10.setBackground(Color.LIGHT_GRAY);
        a11.setBackground(Color.LIGHT_GRAY);
        a12.setBackground(Color.LIGHT_GRAY);
        a20.setBackground(Color.LIGHT_GRAY);
        a21.setBackground(Color.LIGHT_GRAY);
        a22.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void a00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a00ActionPerformed
        a00.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a00ActionPerformed

    private void a01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a01ActionPerformed
        a01.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a01ActionPerformed

    private void a02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a02ActionPerformed
        a02.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a02ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        a10.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a10ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        a11.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a11ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        a12.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a12ActionPerformed

    private void a20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a20ActionPerformed
        a20.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a20ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
        a21.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a21ActionPerformed

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        a22.setText(starGame);

        if (starGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        elegir_a_jugador();
        winnigGame();
    }//GEN-LAST:event_a22ActionPerformed

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
            java.util.logging.Logger.getLogger(MainTresenraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTresenraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTresenraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTresenraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTresenraya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NJugador1;
    private javax.swing.JTextField NJugador2;
    private javax.swing.JButton a00;
    private javax.swing.JButton a01;
    private javax.swing.JButton a02;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a20;
    private javax.swing.JButton a21;
    private javax.swing.JButton a22;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtJugador1;
    private javax.swing.JLabel txtJugador2;
    private javax.swing.JLabel txtNJugador1;
    private javax.swing.JLabel txtNJugador2;
    private javax.swing.JLabel txtPJugador1;
    private javax.swing.JLabel txtPJugador2;
    // End of variables declaration//GEN-END:variables

int punt=0;
char nompar=' ', nomjur1=' ', nomjur2=' ', gan=' ',esta=' ' ;     

    public void  registrarJugador(){
        ResultadosTo to=new ResultadosTo();
        
        to.setNombrePartida(String.valueOf(nompar));
        to.setNombreJugador1(String.valueOf(nomjur1));
        to.setNombreJugador2(String.valueOf(nomjur2));
        to.setEstado(String.valueOf(esta));
        to.setGanador(String.valueOf(gan));
        to.setPunto(punt);
        ResultadosDaoI dao=new ResultadosDao();
        dao.crearResultado(to);
        listarREsultados();
    }
    
    DefaultTableModel model;
    
    public void listarREsultados(){
        ResultadosDaoI dao=new ResultadosDao();
        List<ResultadosTo> lista=dao.listarResultados();
        model=(DefaultTableModel)jTable1.getModel();
        model.setNumRows(0);
        Object[] ob=new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            int x=-1;
            ob[++x]=lista.get(i).getIdResultado();
            ob[++x]=lista.get(i).getNombrePartida();
            ob[++x]=lista.get(i).getNombreJugador1();
            ob[++x]=lista.get(i).getNombreJugador2();
            ob[++x]=lista.get(i).getGanador();
            ob[++x]=lista.get(i).getPunto();
            ob[++x]=lista.get(i).getEstado();
            model.addRow(ob);
        }                
    }
    
    
}
