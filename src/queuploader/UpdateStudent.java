/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuploader;

import java.awt.Color;

/**
 *
 * @author Phavour
 */
public class UpdateStudent extends javax.swing.JFrame {

	/**
	 * Creates new form UpdateTeacher
	 */
	public UpdateStudent() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        emailText3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fstNameText3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        lstNameText3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        phoneNumText3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fillFlash = new javax.swing.JLabel();
        courseCodeText3 = new javax.swing.JTextField();
        editBtn = new keeptoo.KButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        studIDNum = new javax.swing.JTextField();
        fillFlash1 = new javax.swing.JLabel();
        addBtn = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 241, 243));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        emailText3.setBackground(new java.awt.Color(243, 243, 243));
        emailText3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        emailText3.setForeground(new java.awt.Color(51, 51, 51));
        emailText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailText3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Email");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("First Name");

        fstNameText3.setBackground(new java.awt.Color(243, 243, 243));
        fstNameText3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fstNameText3.setForeground(new java.awt.Color(51, 51, 51));
        fstNameText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fstNameText3ActionPerformed(evt);
            }
        });
        fstNameText3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fstNameText3KeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Last Name");

        lstNameText3.setBackground(new java.awt.Color(243, 243, 243));
        lstNameText3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lstNameText3.setForeground(new java.awt.Color(51, 51, 51));
        lstNameText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstNameText3ActionPerformed(evt);
            }
        });
        lstNameText3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstNameText3KeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Phone");

        phoneNumText3.setBackground(new java.awt.Color(243, 243, 243));
        phoneNumText3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        phoneNumText3.setForeground(new java.awt.Color(51, 51, 51));
        phoneNumText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumText3ActionPerformed(evt);
            }
        });
        phoneNumText3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneNumText3KeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Course Code");

        fillFlash.setForeground(new java.awt.Color(255, 0, 0));
        fillFlash.setText("* Please ensure you fill properly.");

        courseCodeText3.setBackground(new java.awt.Color(243, 243, 243));
        courseCodeText3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        courseCodeText3.setForeground(new java.awt.Color(51, 51, 51));
        courseCodeText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodeText3ActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(104, 183, 253));
        editBtn.setBorder(null);
        editBtn.setText("Update");
        editBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        editBtn.setkBackGroundColor(new java.awt.Color(104, 183, 253));
        editBtn.setkEndColor(new java.awt.Color(3, 127, 236));
        editBtn.setkHoverEndColor(new java.awt.Color(160, 210, 253));
        editBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        editBtn.setkHoverStartColor(new java.awt.Color(35, 150, 250));
        editBtn.setkPressedColor(new java.awt.Color(160, 210, 253));
        editBtn.setkSelectedColor(new java.awt.Color(104, 183, 253));
        editBtn.setkStartColor(new java.awt.Color(104, 183, 253));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneNumText3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lstNameText3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fstNameText3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailText3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fillFlash, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)))
                    .addComponent(courseCodeText3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fstNameText3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstNameText3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumText3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(4, 4, 4)
                .addComponent(courseCodeText3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fillFlash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("UPDATE STUDENTS");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Student's ID");

        studIDNum.setBackground(new java.awt.Color(243, 243, 243));
        studIDNum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        studIDNum.setForeground(new java.awt.Color(51, 51, 51));
        studIDNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studIDNumActionPerformed(evt);
            }
        });
        studIDNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studIDNumKeyReleased(evt);
            }
        });

        fillFlash1.setForeground(new java.awt.Color(255, 0, 0));
        fillFlash1.setText("* Please enter a number.");

        addBtn.setBackground(new java.awt.Color(96, 92, 167));
        addBtn.setBorder(null);
        addBtn.setText("Verify");
        addBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addBtn.setkBackGroundColor(new java.awt.Color(96, 92, 167));
        addBtn.setkEndColor(new java.awt.Color(84, 80, 149));
        addBtn.setkHoverEndColor(new java.awt.Color(148, 145, 195));
        addBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addBtn.setkHoverStartColor(new java.awt.Color(116, 113, 177));
        addBtn.setkPressedColor(new java.awt.Color(148, 145, 195));
        addBtn.setkSelectedColor(new java.awt.Color(96, 92, 167));
        addBtn.setkStartColor(new java.awt.Color(96, 92, 167));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studIDNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(fillFlash1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fillFlash1)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailText3ActionPerformed

    private void fstNameText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fstNameText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fstNameText3ActionPerformed

    private void fstNameText3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fstNameText3KeyReleased
        String typed = fstNameText3.getText().trim();
        //        option = "fstName";
        //
        //        if (!typed.equals("")){
            //
            //            DefaultListModel model = new DefaultListModel();
            //
            //            try {
                //                String query = "SELECT first_name FROM customer"
                //                + " WHERE first_name LIKE '"+typed+"%'"
                //                + " OR first_name LIKE '% "+typed+"%'";
                //                PreparedStatement pst = connect.prepareStatement(query);
                //                ResultSet rs = pst.executeQuery();
                //
                //                while (rs.next()){
                    //                    String fstName = rs.getString("first_name");
                    //                    model.addElement(fstName);
                    //                }
                //
                //                listMain.setModel(model);
                //                rs.close();
                //            } catch (SQLException ex) {
                //                Logger.getLogger(addProPaneMain.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //
            //            menu.show(fstNameText, 0, fstNameText.getHeight());
            //        }else{
            //            menu.setVisible(false);
            //        }
    }//GEN-LAST:event_fstNameText3KeyReleased

    private void lstNameText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstNameText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstNameText3ActionPerformed

    private void lstNameText3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstNameText3KeyReleased
        String typed = lstNameText3.getText().trim();
        //        option = "lstName";
        //
        //        if (!typed.equals("")){
            //
            //            DefaultListModel model = new DefaultListModel();
            //
            //            try {
                //                String query = "SELECT last_name FROM customer"
                //                + " WHERE last_name LIKE '"+typed+"%'"
                //                + " OR last_name LIKE '% "+typed+"%'";
                //                PreparedStatement pst = connect.prepareStatement(query);
                //                ResultSet rs = pst.executeQuery();
                //
                //                while (rs.next()){
                    //                    String lstName = rs.getString("last_name");
                    //                    model.addElement(lstName);
                    //                }
                //
                //                listMain.setModel(model);
                //                rs.close();
                //            } catch (SQLException ex) {
                //                Logger.getLogger(addProPaneMain.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //
            //            menu.show(lstNameText, 0, lstNameText.getHeight());
            //        }else{
            //            menu.setVisible(false);
            //        }
    }//GEN-LAST:event_lstNameText3KeyReleased

    private void phoneNumText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumText3ActionPerformed

    private void phoneNumText3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumText3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumText3KeyReleased

    private void courseCodeText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodeText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCodeText3ActionPerformed

    private void studIDNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studIDNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studIDNumActionPerformed

    private void studIDNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studIDNumKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_studIDNumKeyReleased

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (!fstNameText3.getText().equals("") && !lstNameText3.getText().equals("")
            && !emailText3.getText().equals("") && !courseCodeText3.getText().equals("")) {

            fillFlash.setForeground(Color.WHITE);

        }else{
            fillFlash.setForeground(Color.red);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

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
			java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UpdateStudent().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton addBtn;
    private javax.swing.JTextField courseCodeText3;
    private keeptoo.KButton editBtn;
    private javax.swing.JTextField emailText3;
    private javax.swing.JLabel fillFlash;
    private javax.swing.JLabel fillFlash1;
    private javax.swing.JTextField fstNameText3;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField lstNameText3;
    private javax.swing.JTextField phoneNumText3;
    private javax.swing.JTextField studIDNum;
    // End of variables declaration//GEN-END:variables
}
