/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import model.ModelUserAccount;


public class ChatTitle extends javax.swing.JPanel {


    private ModelUserAccount user;
    
    public ChatTitle() {
        initComponents();
    }

    public ModelUserAccount getUser() {
        return user;
    }
    
    public void setUserName(ModelUserAccount user) {
        this.user = user;
        lbName.setText(user.getUserName());
        if(user.isStatus()) {//Nếu user đó đang hoạt động thì chạy statusActive()
            statusActive();
        } else {
            setStatusText("Offline");
        }
    }
    
    public void updateUser(ModelUserAccount user) {
        if(this.user == user) {
            lbName.setText(user.getUserName());
            if(user.isStatus()) {
                statusActive();
            } else {
                setStatusText("Offline");
            }
        }
    }
    
    private void statusActive() {
        lbStatus.setText("Active now");
        lbStatus.setForeground(new java.awt.Color(51, 255, 0));
    }
    
    private void setStatusText(String text) {
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbName.setForeground(new java.awt.Color(67, 67, 67));
        lbName.setText("Name");
        layer.add(lbName);

        lbStatus.setForeground(new java.awt.Color(51, 255, 0));
        lbStatus.setText("Active now");
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
