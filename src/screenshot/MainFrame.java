package screenshot;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Toolkit;

public class MainFrame extends javax.swing.JFrame {

    public Point StartingPoint, EndingPoint, MoveStartingPoint, MoveEndingPoint;

    public void FramePos() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);
        setLocation(0, 0);
    }

    public MainFrame() {
        initComponents();
        FramePos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        CaptureArea = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setOpacity(0.5F);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });

        CaptureArea.setBackground(new java.awt.Color(255, 204, 255));
        CaptureArea.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        CaptureArea.setPreferredSize(new java.awt.Dimension(0, 0));
        CaptureArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CaptureAreaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CaptureAreaMouseMoved(evt);
            }
        });
        CaptureArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CaptureAreaMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 255));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Pos: X=0 Y=0");
        jLabel2.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Coords: X=0 Y=0");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout CaptureAreaLayout = new javax.swing.GroupLayout(CaptureArea);
        CaptureArea.setLayout(CaptureAreaLayout);
        CaptureAreaLayout.setHorizontalGroup(
            CaptureAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(CaptureAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CaptureAreaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(CaptureAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        CaptureAreaLayout.setVerticalGroup(
            CaptureAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(CaptureAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CaptureAreaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(CaptureArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(CaptureArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        String e = evt.toString();
        if (e.contains("keyChar=Escape")) {
            System.exit(0);
        }
    }//GEN-LAST:event_formKeyTyped

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        CaptureArea.setSize(0, 0);
        PointerInfo mouse = MouseInfo.getPointerInfo();
        Point mouseLocation = mouse.getLocation();
        StartingPoint = mouseLocation;
    }//GEN-LAST:event_backgroundMousePressed

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        PointerInfo mouse = MouseInfo.getPointerInfo();
        EndingPoint = mouse.getLocation();
        int x = StartingPoint.x - EndingPoint.x;
        int y = StartingPoint.y - EndingPoint.y;
        if (y < 0 && x < 0) {
            CaptureArea.setLocation(StartingPoint);
            CaptureArea.setSize(x * -1, y * -1);
        } else if (y > 0 && x > 0) {
            CaptureArea.setLocation(EndingPoint.x, EndingPoint.y);
            CaptureArea.setSize(x, y);
        } else if (y < 0 && x > 0) {
            CaptureArea.setLocation(EndingPoint.x, StartingPoint.y);
            CaptureArea.setSize(x, y * -1);
        } else if (y > 0 && x < 0) {
            CaptureArea.setLocation(StartingPoint.x, EndingPoint.y);
            CaptureArea.setSize(x * -1, y);
        }    }//GEN-LAST:event_backgroundMouseDragged

    private void CaptureAreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaptureAreaMouseDragged
        if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)) {
            PointerInfo mouse = MouseInfo.getPointerInfo();
            Point mouseLocation = mouse.getLocation();
            CaptureArea.setLocation(mouseLocation.x - MoveStartingPoint.x, mouseLocation.y - MoveStartingPoint.y);
            StartingPoint = new Point(evt.getXOnScreen() - evt.getX(), evt.getYOnScreen() - evt.getY());
            EndingPoint = new Point(StartingPoint.x + CaptureArea.getWidth(), StartingPoint.y + CaptureArea.getHeight());
        } else {
            PointerInfo mouse = MouseInfo.getPointerInfo();
            Point mouseLocation = mouse.getLocation();

            if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR)) {
                //Top-Left
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR)) {
                //Top-Right
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR)) {
                //Bottom-Left
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR)) {
                //Bottom Right
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR)) {
                //Top
                CaptureArea.setLocation(evt.getXOnScreen() - evt.getX(), mouseLocation.y);
                CaptureArea.setSize(CaptureArea.getSize().width, CaptureArea.getSize().height - evt.getY());
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR)) {
                //Left
                CaptureArea.setLocation(mouseLocation.x, evt.getYOnScreen() - evt.getY());
                CaptureArea.setSize((int) (CaptureArea.getSize().width+(StartingPoint.getX()-evt.getXOnScreen())), CaptureArea.getSize().height);
               System.out.println(CaptureArea.getSize().width+(StartingPoint.getX()-CaptureArea.getLocation().x));
             /////////////////////////////////
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR)) {
                //Right
                CaptureArea.setSize(mouseLocation.x - CaptureArea.getLocation().x, CaptureArea.getSize().height);
            } else if (CaptureArea.getCursor() == Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR)) {
                //Bottom
                CaptureArea.setSize(CaptureArea.getSize().width, mouseLocation.y - CaptureArea.getLocation().y);
            }
        }
    }//GEN-LAST:event_CaptureAreaMouseDragged

    private void CaptureAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaptureAreaMousePressed
        MoveStartingPoint = new Point(evt.getX(), evt.getY());
        StartingPoint=new Point(evt.getXOnScreen(),evt.getYOnScreen());
        System.out.println("Pressed: " + MoveStartingPoint.x + "," + MoveStartingPoint.y);

    }//GEN-LAST:event_CaptureAreaMousePressed

    private void CaptureAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaptureAreaMouseMoved
        int x = evt.getPoint().x;
        int y = evt.getPoint().y;
        int h = CaptureArea.getSize().height - 5;
        int w = CaptureArea.getSize().width - 5;
        if (x <= 5 && y <= 5) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
        } else if (x > w && y > h) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
        } else if (x > w && y <= 5) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR));
        } else if (x <= 5 && y > h) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
        } else if (x > w && y < h) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
        } else if (x < w && y > h) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
        } else if (x <= 5) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
        } else if (y <= 5) {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
        } else {
            CaptureArea.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_CaptureAreaMouseMoved

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CaptureArea;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
