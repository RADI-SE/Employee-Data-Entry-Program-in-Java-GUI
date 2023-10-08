 package JA;
  import java.io.File;
  import javax.swing.ImageIcon;
  import javax.swing.JFileChooser;
  import javax.swing.filechooser.FileSystemView;
  import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 96653
 */
public class A5 extends javax.swing.JFrame {
    public A5() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        M = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        Age = new javax.swing.JTextField();
        Blood = new javax.swing.JTextField();
        No = new javax.swing.JTextField();
        Item = new javax.swing.JComboBox<>();
        DOJ = new com.toedter.calendar.JDateChooser();
        imagePath = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        _New_ = new javax.swing.JButton();
        _Save_ = new javax.swing.JButton();
        _Update_ = new javax.swing.JButton();
        _Delete_ = new javax.swing.JButton();
        _Clear_ = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        _Table_ = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextPane();
        Upload = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setText("Employee ID");

        jLabel2.setText("Name");

        jLabel5.setText("Gender");

        jLabel6.setText("Age");

        jLabel7.setText("Blood Group");

        jLabel8.setText("Contact No");

        jLabel9.setText("Qualification");

        jLabel10.setText("DOJ");

        jLabel11.setForeground(new java.awt.Color(240, 0, 0));
        jLabel11.setText("Image Path");

        ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        buttonGroup1.add(M);
        M.setForeground(new java.awt.Color(255, 153, 51));
        M.setText("Male");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        buttonGroup1.add(F);
        F.setForeground(new java.awt.Color(255, 153, 51));
        F.setText("Famle");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        Age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        Blood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        No.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        Item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Engineering", "Phd", "Doctrate", "Civil Enginner", "B.Com" }));
        Item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));

        DOJ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        imagePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 250, 250)));

        jLabel12.setText("Address");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));

        _New_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JA/imgages/add-user (1).png"))); // NOI18N
        _New_.setText("New");
        _New_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _New_ActionPerformed(evt);
            }
        });

        _Save_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JA/imgages/diskette (1).png"))); // NOI18N
        _Save_.setText("Save");
        _Save_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Save_ActionPerformed(evt);
            }
        });

        _Update_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JA/imgages/refresh.png"))); // NOI18N
        _Update_.setText("Update");
        _Update_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Update_ActionPerformed(evt);
            }
        });

        _Delete_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JA/imgages/clear.png"))); // NOI18N
        _Delete_.setText("Delete");
        _Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Delete_ActionPerformed(evt);
            }
        });

        _Clear_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JA/imgages/cleaning (1).png"))); // NOI18N
        _Clear_.setText("Clear");
        _Clear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Clear_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(_New_, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_Save_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_Update_, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_Delete_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_Clear_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_New_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_Save_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_Update_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        image.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192))));

        _Table_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Blood Group", "Contact No", "Qualification", "DOJ", "Address", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        _Table_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _Table_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(_Table_);

        Address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 224, 224), 1, true));
        jScrollPane3.setViewportView(Address);

        Upload.setText("Upload Image");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 0, 0));
        jLabel3.setText("Personal Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DOJ, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Item, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(Upload, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(imagePath))
                        .addGap(18, 18, 18)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(M)
                                    .addComponent(F))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DOJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Upload)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 93, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
    
    }//GEN-LAST:event_FActionPerformed

    private void _Save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Save_ActionPerformed

      DefaultTableModel add= (DefaultTableModel)_Table_.getModel();
         if (M.isSelected() == true){
             String save[]={ID.getText(),Name.getText()
            ,M.getText(),
             Age.getText(),Blood.getText(),
             No.getText()
             ,Item.getSelectedItem().toString(),
              DOJ.getDate().toString(),Address.getText(),imagePath.getText().replace("", "") 
        };   
          add.addRow(save);    
         }
         else{
             String save[]={ID.getText(),Name.getText()
             ,F.getText(),  
             Age.getText(),Blood.getText(),
             No.getText()
             ,Item.getSelectedItem().toString(),
              DOJ.getDate().toString(),Address.getText(),imagePath.getText().replace("", "")
        };
          add.addRow(save);
         }
    }//GEN-LAST:event__Save_ActionPerformed

    private void _Update_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Update_ActionPerformed
         DefaultTableModel update= (DefaultTableModel)_Table_.getModel();
         String id  = ID.getText();
         String name  = Name.getText();
         String MM  = M.getText();
         String FF = F.getText();
         String age  = Age.getText();
         String blood  = Blood.getText();
         String Contact = No.getText();
         String Ite  = Item.getSelectedItem().toString();
         String D  = DOJ.getDate().toString();
         String addres  = Address.getText();
         String img  = imagePath.getText();
         ImageIcon imag = new ImageIcon(img);
          image.setIcon(imag);
            if (M.isSelected()){
                     update.setValueAt(id, _Table_.getSelectedRow(), 0);
                     update.setValueAt(name, _Table_.getSelectedRow(), 1);
                     update.setValueAt(MM, _Table_.getSelectedRow(), 2);
                     update.setValueAt(age, _Table_.getSelectedRow(), 3);
                     update.setValueAt(blood, _Table_.getSelectedRow(), 4);
                     update.setValueAt(Contact, _Table_.getSelectedRow(), 5);
                     update.setValueAt(Ite, _Table_.getSelectedRow(), 6);
                     update.setValueAt(D, _Table_.getSelectedRow(), 7);
                     update.setValueAt(addres, _Table_.getSelectedRow(), 8);
                     update.setValueAt(img, _Table_.getSelectedRow(), 9);
            }else
            {
                update.setValueAt(id, _Table_.getSelectedRow(), 0);
                     update.setValueAt(name, _Table_.getSelectedRow(), 1);
                     update.setValueAt(FF, _Table_.getSelectedRow(), 2);
                     update.setValueAt(age, _Table_.getSelectedRow(), 3);
                     update.setValueAt(blood, _Table_.getSelectedRow(), 4);
                     update.setValueAt(Contact, _Table_.getSelectedRow(), 5);
                     update.setValueAt(Ite, _Table_.getSelectedRow(), 6);
                     update.setValueAt(D, _Table_.getSelectedRow(), 7);
                     update.setValueAt(addres, _Table_.getSelectedRow(), 8);
                     update.setValueAt(imag, _Table_.getSelectedRow(), 9);
            }
    }//GEN-LAST:event__Update_ActionPerformed

    private void _Table_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__Table_MouseClicked
         
            DefaultTableModel select= (DefaultTableModel)_Table_.getModel();
             String id  = select.getValueAt(_Table_.getSelectedRow(),0).toString();
             String name  = select.getValueAt(_Table_.getSelectedRow(),1).toString();
             String MM  = select.getValueAt(_Table_.getSelectedRow(),2).toString();
             String age  = select.getValueAt(_Table_.getSelectedRow(),3).toString();
             String blood  = select.getValueAt(_Table_.getSelectedRow(),4).toString();
             String Contact = select.getValueAt(_Table_.getSelectedRow(),5).toString();
             String It  = select.getValueAt(_Table_.getSelectedRow(),6).toString();
             String D  =  select.getValueAt(_Table_.getSelectedRow(),7).toString();
             String Addres  = select.getValueAt(_Table_.getSelectedRow(),8).toString();
             String img  = select.getValueAt(_Table_.getSelectedRow(),9).toString();
             ImageIcon imag = new ImageIcon(img);
            // Date de = new Date(D);
            if (MM.equals( F.isSelected())){
                image.setIcon(null);
                ID.setText(id);
                Name.setText(name);
                F.setText(MM);
                Age.setText(age);
                Blood.setText(blood);
                No.setText(Contact);
                Item.setSelectedItem(It);
              //  DOJ.setDate(D);
                Address.setText(Addres);
                image.setIcon(imag);
                
            } else{
                image.setIcon(null);
                ID.setText(id);
                Name.setText(name);
                M.setText(MM);
                Age.setText(age);
                Blood.setText(blood);
                No.setText(Contact);
                Item.setSelectedItem(It);
             //   DOJ.setDate(B);
                Address.setText(Addres);
                image.setIcon(imag);
            }
         
        
    }//GEN-LAST:event__Table_MouseClicked

    private void _Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Delete_ActionPerformed
         DefaultTableModel Delete= (DefaultTableModel)_Table_.getModel(); 
         Delete.removeRow(_Table_.getSelectedRow());
    }//GEN-LAST:event__Delete_ActionPerformed

    private void _Clear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Clear_ActionPerformed
    
       DefaultTableModel Clear = new DefaultTableModel() ; 
         ID.setText("");
         Name.setText("");
         Age.setText("");
         Blood.setText("");
         No.setText("");
         Item.setSelectedItem("");
         DOJ.setDate(null);
         Address.setText("");
         imagePath.setText(null);
         image.setIcon(null);
         _Table_.setModel(Clear);
    }//GEN-LAST:event__Clear_ActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
         JFileChooser sel = new JFileChooser(FileSystemView.getFileSystemView());
         sel.showOpenDialog(null);
         File Ima = sel.getSelectedFile();
         String path = Ima.getAbsolutePath();
         imagePath.setText(path);
         ImageIcon imag = new ImageIcon(path);
         image.setIcon(imag);
    }//GEN-LAST:event_UploadActionPerformed

    private void _New_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__New_ActionPerformed
         ID.setText("");
         Name.setText("");
         Age.setText("");
         Blood.setText("");
         No.setText("");
         Item.setSelectedItem("");
         DOJ.setDate(null);
         Address.setText("");
         image.setIcon(null);
         imagePath.setText(null);
    }//GEN-LAST:event__New_ActionPerformed

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
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Address;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Blood;
    private com.toedter.calendar.JDateChooser DOJ;
    private javax.swing.JRadioButton F;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> Item;
    private javax.swing.JRadioButton M;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField No;
    private javax.swing.JButton Upload;
    private javax.swing.JButton _Clear_;
    private javax.swing.JButton _Delete_;
    private javax.swing.JButton _New_;
    private javax.swing.JButton _Save_;
    private javax.swing.JTable _Table_;
    private javax.swing.JButton _Update_;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JTextField imagePath;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
