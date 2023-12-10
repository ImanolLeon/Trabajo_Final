package com.enciclopedia.juegouno.Frame;

import com.enciclopedia.juegouno.Methods.Match;
import com.enciclopedia.juegouno.Methods.Utilities;
import java.util.List;


public class Principal extends javax.swing.JFrame {


    
    int clic =0;
    
    Utilities u = new Utilities();
    
    List<Integer> next = u.rowsTableAll();
    
    public Principal() {
        initComponents();
        this.setTitle("Memory");
        this.setLocationRelativeTo(this);
        u.imgStart();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn01.setForeground(new java.awt.Color(240, 240, 240));
        btn01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn01.setMaximumSize(new java.awt.Dimension(64, 64));
        btn01.setMinimumSize(new java.awt.Dimension(64, 64));
        btn01.setPreferredSize(new java.awt.Dimension(64, 64));
        btn01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn01MouseClicked(evt);
            }
        });

        btn02.setForeground(new java.awt.Color(240, 240, 240));
        btn02.setMaximumSize(new java.awt.Dimension(64, 64));
        btn02.setMinimumSize(new java.awt.Dimension(64, 64));
        btn02.setPreferredSize(new java.awt.Dimension(64, 64));
        btn02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn02MouseClicked(evt);
            }
        });

        btn03.setForeground(new java.awt.Color(240, 240, 240));
        btn03.setMaximumSize(new java.awt.Dimension(64, 64));
        btn03.setMinimumSize(new java.awt.Dimension(64, 64));
        btn03.setPreferredSize(new java.awt.Dimension(64, 64));
        btn03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn03MouseClicked(evt);
            }
        });

        btn04.setForeground(new java.awt.Color(240, 240, 240));
        btn04.setMaximumSize(new java.awt.Dimension(64, 64));
        btn04.setMinimumSize(new java.awt.Dimension(64, 64));
        btn04.setPreferredSize(new java.awt.Dimension(64, 64));
        btn04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn04MouseClicked(evt);
            }
        });

        btn05.setForeground(new java.awt.Color(240, 240, 240));
        btn05.setMaximumSize(new java.awt.Dimension(64, 64));
        btn05.setMinimumSize(new java.awt.Dimension(64, 64));
        btn05.setPreferredSize(new java.awt.Dimension(64, 64));
        btn05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn05MouseClicked(evt);
            }
        });

        btn06.setForeground(new java.awt.Color(240, 240, 240));
        btn06.setMaximumSize(new java.awt.Dimension(64, 64));
        btn06.setMinimumSize(new java.awt.Dimension(64, 64));
        btn06.setPreferredSize(new java.awt.Dimension(64, 64));
        btn06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn06MouseClicked(evt);
            }
        });

        btn07.setForeground(new java.awt.Color(240, 240, 240));
        btn07.setMaximumSize(new java.awt.Dimension(64, 64));
        btn07.setMinimumSize(new java.awt.Dimension(64, 64));
        btn07.setPreferredSize(new java.awt.Dimension(64, 64));
        btn07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn07MouseClicked(evt);
            }
        });

        btn08.setForeground(new java.awt.Color(240, 240, 240));
        btn08.setMaximumSize(new java.awt.Dimension(64, 64));
        btn08.setMinimumSize(new java.awt.Dimension(64, 64));
        btn08.setPreferredSize(new java.awt.Dimension(64, 64));
        btn08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn08MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btn01MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn01);
        m.setNumberBtn(1);
        m.setValueMatch(next.get(0));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn02MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Match m = new Match();
        m.setBtn(btn02);
        m.setNumberBtn(2);
        m.setValueMatch(next.get(1));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn03MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Match m = new Match();
        m.setBtn(btn03);
        m.setNumberBtn(3);
        m.setValueMatch(next.get(2));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn04MouseClicked(java.awt.event.MouseEvent evt) {
       Match m = new Match();
        m.setBtn(btn04);
        m.setNumberBtn(4);
        m.setValueMatch(next.get(3));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn05MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn05);
        m.setNumberBtn(5);
        m.setValueMatch(next.get(4));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn06MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn06);
        m.setNumberBtn(6);
        m.setValueMatch(next.get(5));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }
    private void btn07MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn07);
        m.setNumberBtn(7);
        m.setValueMatch(next.get(6));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn08MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn08);
        m.setNumberBtn(8);
        m.setValueMatch(next.get(7));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public static javax.swing.JButton btn01;
    public static javax.swing.JButton btn02;
    public static javax.swing.JButton btn03;
    public static javax.swing.JButton btn04;
    public static javax.swing.JButton btn05;
    public static javax.swing.JButton btn06;
    public static javax.swing.JButton btn07;
    public static javax.swing.JButton btn08;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
}
