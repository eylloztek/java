/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2_final;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.UIManager;

/**
 *
 * @author Lenovo
 */
public class CustomerCompList extends javax.swing.JFrame {

    String selected; //variable for selected(copied) text
    /**
     * Creates new form CustomerCompList
     */
    DefaultListModel listModel = new DefaultListModel();

    public CustomerCompList() {
        initComponents();
        list_info.setModel(listModel);

    }

    //creating connection
    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/BPProjectDB", "username", "123");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_info = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_check = new javax.swing.JButton();
        spn_size = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_save = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_back = new javax.swing.JMenuItem();
        menu_exit = new javax.swing.JMenuItem();

        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Copy);

        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Paste);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        list_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list_infoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                list_infoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(list_info);

        jLabel1.setText("Enter your complaint ID:");

        txt_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_idMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_idMouseReleased(evt);
            }
        });

        btn_check.setText("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });

        spn_size.setModel(new javax.swing.SpinnerNumberModel(12, 12, 20, 1));
        spn_size.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_sizeStateChanged(evt);
            }
        });

        jLabel2.setText("Set Font Size:");

        jMenu1.setText("File");

        menu_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document.png"))); // NOI18N
        menu_save.setText("Save to .txt");
        menu_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_saveActionPerformed(evt);
            }
        });
        jMenu1.add(menu_save);
        jMenu1.add(jSeparator1);

        menu_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/angle-double-small-left.png"))); // NOI18N
        menu_back.setText("Back");
        menu_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_backActionPerformed(evt);
            }
        });
        jMenu1.add(menu_back);

        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id)
                        .addComponent(jLabel2)
                        .addComponent(btn_check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(spn_size, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_check)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spn_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_backActionPerformed
        CustomerMain cm = new CustomerMain(); //go backs to CustomerMain
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_backActionPerformed

    private void menu_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_saveActionPerformed
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list_info.getModel().getSize(); i++) {
            sb.append(list_info.getModel().getElementAt(i)).append("\n"); //getting text from JList
        }

        try (FileWriter fw = new FileWriter("complaintInfo.txt")) { //creating file
            fw.write(sb.toString()); //writing to file
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menu_saveActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        dispose(); //closes the program
    }//GEN-LAST:event_menu_exitActionPerformed

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        listModel.removeAllElements(); //refreshes the table in every click.
        if (txt_id.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter your complaint ID.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection con = getConnection();
                Statement stmt = con.createStatement();
                String query = "SELECT * FROM TBL_COMPLAINTS WHERE ID='" + txt_id.getText() + "'";
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    String compType = rs.getString("COMPLAINTTYPE");
                    listModel.addElement("Complaint Type: " + compType);
                    String complaint = rs.getString("COMPLAINT");
                    listModel.addElement("Complaint : " + complaint);
                    boolean status = rs.getBoolean("STATUS");
                    listModel.addElement("Status: " + status);
                    String solution = rs.getString("SOLUTION");
                    listModel.addElement("Solution: " + solution);
                    list_info.setModel(listModel);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_checkActionPerformed

    private void showPopup(MouseEvent evt) {
        jPopupMenu1.show(this, evt.getX(), evt.getY());
    }

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        selected = list_info.getSelectedValue();
        StringSelection selection = new StringSelection(selected);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }//GEN-LAST:event_CopyActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        txt_id.setText(selected);
    }//GEN-LAST:event_PasteActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_formMouseReleased

    private void spn_sizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_sizeStateChanged
        Font font = list_info.getFont();
        list_info.setFont(new Font(font.getName(), font.getStyle(), (Integer.parseInt(spn_size.getValue().toString()))));
    }//GEN-LAST:event_spn_sizeStateChanged

    private void list_infoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_infoMousePressed
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_list_infoMousePressed

    private void list_infoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_infoMouseReleased
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_list_infoMouseReleased

    private void txt_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMousePressed
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_txt_idMousePressed

    private void txt_idMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMouseReleased
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_txt_idMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCompList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JButton btn_check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> list_info;
    private javax.swing.JMenuItem menu_back;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JMenuItem menu_save;
    private javax.swing.JSpinner spn_size;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}