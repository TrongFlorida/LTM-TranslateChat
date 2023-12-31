/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import javax.swing.Icon;


public class MessageLeft extends javax.swing.JLayeredPane {

    /**
     * Creates new form MessageLeft
     */
    public MessageLeft() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
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

        txt = new component.ChatItem();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
