import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aet00
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null); //center form on the screen.
        jText_feet.setVisible(false);
        jLabel_feet.setVisible(false);
        jText_inch.setVisible(false);
        jLabel_inch.setVisible(false);
        jText_cm.setVisible(false);
        jLabel_cm.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeightUnits = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCreateProfile = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFirstName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jLabelRegister = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jText_cm = new javax.swing.JTextField();
        jRadioButtonMetric = new javax.swing.JRadioButton();
        jRadioButtonCustomary = new javax.swing.JRadioButton();
        jLabel_cm = new javax.swing.JLabel();
        jTextWeight = new javax.swing.JTextField();
        jText_feet = new javax.swing.JTextField();
        jText_inch = new javax.swing.JTextField();
        jLabel_feet = new javax.swing.JLabel();
        jLabel_inch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelCreateProfile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelCreateProfile.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreateProfile.setText("Create Profile");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMinimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCreateProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimize)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCreateProfile)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMinimize))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Weight:");

        jTextFirstName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFirstName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFirstName.setForeground(new java.awt.Color(228, 241, 254));
        jTextFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFirstNameActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(228, 241, 254));

        jButtonCancel.setBackground(new java.awt.Color(192, 57, 43));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonCreate.setBackground(new java.awt.Color(34, 167, 240));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCreate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreate.setText("Create");
        jButtonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateMouseClicked(evt);
            }
        });
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Username:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Last Name:");

        jTextLastName.setBackground(new java.awt.Color(108, 122, 137));
        jTextLastName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextLastName.setForeground(new java.awt.Color(228, 241, 254));
        jTextLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLastNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Height:");

        jTextUsername.setBackground(new java.awt.Color(108, 122, 137));
        jTextUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextUsername.setForeground(new java.awt.Color(228, 241, 254));
        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });

        jLabelRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("CLICK HERE TO LOGIN");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "lbs" }));

        jText_cm.setBackground(new java.awt.Color(108, 122, 137));
        jText_cm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jText_cm.setForeground(new java.awt.Color(228, 241, 254));
        jText_cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cmActionPerformed(evt);
            }
        });

        HeightUnits.add(jRadioButtonMetric);
        jRadioButtonMetric.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMetric.setText("Metric");
        jRadioButtonMetric.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMetricMouseClicked(evt);
            }
        });

        HeightUnits.add(jRadioButtonCustomary);
        jRadioButtonCustomary.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonCustomary.setText("Customary");
        jRadioButtonCustomary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonCustomaryMouseClicked(evt);
            }
        });

        jLabel_cm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cm.setText("cm");

        jTextWeight.setBackground(new java.awt.Color(108, 122, 137));
        jTextWeight.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextWeight.setForeground(new java.awt.Color(228, 241, 254));
        jTextWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHeight2ActionPerformed(evt);
            }
        });

        jText_feet.setBackground(new java.awt.Color(108, 122, 137));
        jText_feet.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jText_feet.setForeground(new java.awt.Color(228, 241, 254));
        jText_feet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_feetActionPerformed(evt);
            }
        });

        jText_inch.setBackground(new java.awt.Color(108, 122, 137));
        jText_inch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jText_inch.setForeground(new java.awt.Color(228, 241, 254));
        jText_inch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_inchActionPerformed(evt);
            }
        });

        jLabel_feet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_feet.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_feet.setText("ft");

        jLabel_inch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_inch.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_inch.setText("in");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonCustomary, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButtonMetric, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jText_feet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_feet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel_inch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addComponent(jText_cm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_cm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(jTextUsername)
                                    .addComponent(jTextLastName)
                                    .addComponent(jTextFirstName))
                                .addGap(0, 51, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jText_inch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jTextWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelRegister)
                        .addGap(151, 151, 151))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButtonMetric)
                    .addComponent(jRadioButtonCustomary))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cm)
                    .addComponent(jText_cm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_feet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_inch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_feet)
                    .addComponent(jLabel_inch))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabelRegister)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    private void jTextLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLastNameActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
    	
    	profileConnector c = new profileConnector();
    	
    	if(jTextFirstName.getText().contentEquals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid first name!", "Enter Name", 0);
    		return;
    	}else {
        	c.profile.setFirstName(jTextFirstName.getText());

    	}
    	if(jTextLastName.getText().contentEquals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid last name!", "Enter Name", 0);
    		return;
    	}else {   		
    		c.profile.setLastName(jTextLastName.getText());
    	}
    	
    	if(jPasswordField1.getPassword().equals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid password!", "Enter Password", 0);
    		return;
    	}else {   
    		c.profile.setPassword(jPasswordField1.getPassword().toString());
    	}
    	
    	if(jTextUsername.getText().contentEquals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid ussername!", "Username", 0);
    		return;
    	}else {   		
    		c.profile.setUsername(jTextUsername.getText());
    	}	
		

    	if(jTextWeight.getText().contentEquals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid weight!", "Weight", 0);
    		return;
    	}else {
    		try {
    			c.profile.setWeight(Double.valueOf(jTextWeight.getText()));
    		}catch(NumberFormatException e) {
    			JOptionPane.showMessageDialog(rootPane,  "Enter valid weight!", "Weight", 0);
    		}
    	}	
    	
    	if(jText_feet.getText().contentEquals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid height!", "Feet", 0);
    		return;
    	}else {
    		try {
    			c.profile.setFeet(Double.valueOf(jText_feet.getText()));
    		}catch(NumberFormatException e) {
    			JOptionPane.showMessageDialog(rootPane,  "Enter valid feet!", "Feet", 0);
    		}
    	}	
    	
    	
    	if(jText_inch.getText().contentEquals("")) {
    		JOptionPane.showMessageDialog(rootPane,  "Enter valid height!", "Inch", 0);
    		return;
    	}else {
    		try {
    			c.profile.setInches(Double.valueOf(jText_inch.getText()));
    		}catch(NumberFormatException e) {
    			JOptionPane.showMessageDialog(rootPane,  "Enter valid height!", "Inch", 0);
    		}
    	}
    	
    	
    	if(jRadioButtonMetric.isSelected()) {
    		c.profile.setUnits("metric");
    	}else {
    		c.profile.setUnits("customary");
    	}
    	System.out.println(c.profile.getFirstName());
    	
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFirstNameActionPerformed

    private void jText_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cmActionPerformed

    private void jTextHeight2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHeight2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHeight2ActionPerformed

    private void jRadioButtonMetricMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMetricMouseClicked
        jLabel_cm.setVisible(true);
        jText_cm.setVisible(true);
        jText_feet.setVisible(false);
        jText_inch.setVisible(false);
        jLabel_feet.setVisible(false);
        jLabel_inch.setVisible(false);
    }//GEN-LAST:event_jRadioButtonMetricMouseClicked

    private void jText_feetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_feetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_feetActionPerformed

    private void jText_inchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_inchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_inchActionPerformed

    private void jRadioButtonCustomaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonCustomaryMouseClicked
       jLabel_cm.setVisible(false);
        jText_cm.setVisible(false);
        jText_feet.setVisible(true);
        jText_inch.setVisible(true);
        jLabel_feet.setVisible(true);
        jLabel_inch.setVisible(true);
    }//GEN-LAST:event_jRadioButtonCustomaryMouseClicked

    private void jButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateMouseClicked
        DashBoard dashboard = new  DashBoard();
        dashboard.setVisible(true);
        dashboard.pack();
        dashboard.setLocationRelativeTo(null);
        dashboard.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCreateMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup HeightUnits;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCreateProfile;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabel_cm;
    private javax.swing.JLabel jLabel_feet;
    private javax.swing.JLabel jLabel_inch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButtonCustomary;
    private javax.swing.JRadioButton jRadioButtonMetric;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextWeight;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextUsername;
    private javax.swing.JTextField jText_cm;
    private javax.swing.JTextField jText_feet;
    private javax.swing.JTextField jText_inch;
    // End of variables declaration//GEN-END:variables
}
