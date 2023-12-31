/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;


public class MessageLeftWithProfile extends javax.swing.JLayeredPane {

    /**
     * Creates new form MessageLeft
     */
    public MessageLeftWithProfile() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }
    
    public void  setMessageUserProfile(String user) {
        txt.setUserProfile(user);
    }
    
    public void setImageProfile(Icon image) {
        img.setImage(image);
    }
    
    
    public void setMessageLeftText(String text) {
        if(text.equals("")) {
            txt.hideText();
        }else {
            txt.setMessageText(text);
        }
    }

    public void setMessageLeftImage(Icon... image) {
        txt.setMessageImage(false, image);
    }
    
    public void setMessageLeftImage(String... image) {
        txt.setMessageImage(false, image);
    }
    
    public void setMessageLeftFile(String fileName, String fileSize) {
        txt.setMessageFile(fileName, fileSize);  
    }
    
    public void setMessageLeftTime() {
        txt.setMessageTime("5:10 PM");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        img = new swing.ImageAvatar();
        txt = new component.ChatItem();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        img.setBorderSize(1);
        img.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/testing/chon.jpg"))); // NOI18N
        img.setMaximumSize(new java.awt.Dimension(31, 31));
        img.setMinimumSize(new java.awt.Dimension(31, 31));
        img.setPreferredSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);

        txt.setMinimumSize(new java.awt.Dimension(21, 15));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar img;
    private javax.swing.JLayeredPane jLayeredPane1;
    private component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
