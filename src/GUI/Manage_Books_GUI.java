package GUI;

import DB.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Extreme
 */
public class Manage_Books_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Books_GUI
     */
    public Manage_Books_GUI() {
        initComponents();
        disabling();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        isbntxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        availabilitytxt = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        edit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        bookidtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        DOR = new com.toedter.calendar.JDateChooser();
        noofpagestxt = new javax.swing.JTextField();
        shelfnotxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        categoryselect = new javax.swing.JComboBox();
        booktypeselect = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Books");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/title ori.jpg"))); // NOI18N

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Library Management System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Book ID");
        jLabel2.setBounds(20, 40, 60, 14);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        jLabel3.setBounds(20, 80, 40, 14);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Author");
        jLabel4.setBounds(20, 120, 50, 14);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Category");
        jLabel5.setBounds(20, 200, 60, 14);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Added Date");
        jLabel6.setBounds(20, 240, 60, 14);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Price");
        jLabel7.setBounds(20, 280, 27, 20);
        jLayeredPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Availability");
        jLabel8.setBounds(20, 440, 70, 14);
        jLayeredPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        isbntxt.setBounds(110, 160, 250, 20);
        jLayeredPane2.add(isbntxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pricetxt.setBounds(110, 280, 250, 20);
        jLayeredPane2.add(pricetxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        availabilitytxt.setBounds(110, 440, 250, 20);
        jLayeredPane2.add(availabilitytxt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/view.png"))); // NOI18N
        jButton1.setText("View All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(150, 40, 89, 25);
        jLayeredPane3.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Search-Search-icon1`.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(20, 40, 90, 25);
        jLayeredPane3.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(460, 50, 260, 90);
        jLayeredPane2.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/309px-Books-aj.svg_aj_ashton_01f.svg.png"))); // NOI18N
        jButton3.setText("Add Books");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(473, 190, 240, 27);
        jLayeredPane2.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        edit.setBounds(13, 20, 240, 25);
        jLayeredPane4.add(edit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/edit.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        update.setBounds(30, 90, 90, 25);
        jLayeredPane4.add(update, javax.swing.JLayeredPane.DEFAULT_LAYER);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        delete.setBounds(140, 90, 83, 25);
        jLayeredPane4.add(delete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(460, 250, 260, 140);
        jLayeredPane2.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.gif"))); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.setBounds(460, 420, 90, 30);
        jLayeredPane2.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back1.png"))); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(630, 420, 90, 30);
        jLayeredPane2.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bookidtxt.setBounds(110, 40, 250, 20);
        jLayeredPane2.add(bookidtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nametxt.setBounds(110, 80, 250, 20);
        jLayeredPane2.add(nametxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authortxt.setBounds(110, 120, 250, 20);
        jLayeredPane2.add(authortxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DOR.setBounds(110, 240, 250, 20);
        jLayeredPane2.add(DOR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        noofpagestxt.setBounds(110, 360, 250, 20);
        jLayeredPane2.add(noofpagestxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        shelfnotxt.setBounds(110, 400, 250, 20);
        jLayeredPane2.add(shelfnotxt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Book Type");
        jLabel9.setBounds(20, 330, 70, 14);
        jLayeredPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Shelf Number");
        jLabel10.setBounds(20, 400, 80, 14);
        jLayeredPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("ISBN");
        jLabel11.setBounds(20, 160, 60, 14);
        jLayeredPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("No of Pages");
        jLabel12.setBounds(20, 360, 70, 14);
        jLayeredPane2.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        categoryselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Fiction", "Novels", "Short Stories", "Educational" }));
        categoryselect.setBounds(110, 200, 250, 20);
        jLayeredPane2.add(categoryselect, javax.swing.JLayeredPane.DEFAULT_LAYER);

        booktypeselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Normal", "Reference" }));
        booktypeselect.setBounds(110, 320, 250, 20);
        jLayeredPane2.add(booktypeselect, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(20, 40, 750, 480);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu2.setText("Navigate");

        jMenuItem8.setText("Home");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem2.setText("Manage Members");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Manage Books");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Manage Book Lending");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Manage Inventory");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Manage Newspaper Reocords");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Manage User Accounts");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-663)/2, 816, 663);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
        
        if (bookidtxt.getText().equals("")) 
         {
            JOptionPane.showMessageDialog(this, "Please enter the Book ID you wish to Search ","",JOptionPane.WARNING_MESSAGE);
         }
         else if(bookidtxt.getText().charAt(0)=='B')
         {
    
           
            String bookid=bookidtxt.getText();
            Connection con = DB.myCon();
            Statement S = con.createStatement();
            ResultSet rs=null;
            
            
                    
                rs = S.executeQuery("SELECT * FROM book1 WHERE bookid='" +bookid+ "'");
                    if (rs.next()) 
                        {
                      enabling();
                        
         nametxt.setText(rs.getString("name"));
         authortxt.setText(rs.getString("author"));
               isbntxt.setText(rs.getString("isbn"));
         categoryselect.setSelectedItem(rs.getString("category"));
         DOR.setDate(rs.getDate("addeddate"));
         pricetxt.setText(rs.getString("price"));
          booktypeselect.setSelectedItem(rs.getString("booktype"));
         noofpagestxt.setText(rs.getString("noofpages"));
         shelfnotxt.setText(rs.getString("shelfno"));
         availabilitytxt.setText(rs.getString("statues"));


                        }
         
                        else
                        {
                            JOptionPane.showMessageDialog(this, " No such Book  !","",JOptionPane.ERROR_MESSAGE);
                            bookidtxt.setText("");
                         }
             }
            else
             {
                 JOptionPane.showMessageDialog(this, "Please enter a correct ID ","",JOptionPane.ERROR_MESSAGE);
             }
        }
        catch (Exception e) {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error, !","",JOptionPane.ERROR_MESSAGE);
                }
           
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       new Home_GUI().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         new Add_Book_GUI().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
          try
        {
            update.setEnabled(true);
            delete.setEnabled(true);
             if (bookidtxt.getText().equals("")) 
         {
            JOptionPane.showMessageDialog(this, "Please enter the Member ID you wish to Edit ","",JOptionPane.WARNING_MESSAGE);
         }
         else if(bookidtxt.getText().charAt(0)=='B')
         {
    
           
            String bookid=bookidtxt.getText();
            Connection con = DB.myCon();
            Statement S = con.createStatement();
            ResultSet rs=null;
            
            
                  
                rs = S.executeQuery("SELECT * FROM book1 WHERE bookid='" +bookid+ "'");
                    if (rs.next()) 
                        {
                        enabling();
                        
         nametxt.setText(rs.getString("name"));
         authortxt.setText(rs.getString("author"));
               isbntxt.setText(rs.getString("isbn"));
         categoryselect.setSelectedItem(rs.getString("category"));
         DOR.setDate(rs.getDate("addeddate"));
         pricetxt.setText(rs.getString("price"));
          booktypeselect.setSelectedItem(rs.getString("booktype"));
         noofpagestxt.setText(rs.getString("noofpages"));
         shelfnotxt.setText(rs.getString("shelfno"));
         availabilitytxt.setText(rs.getString("statues"));


                        }
         
                        else
                        {
                            JOptionPane.showMessageDialog(this, " No such Book  !","",JOptionPane.ERROR_MESSAGE);
                            bookidtxt.setText("");
                            reseting();
                             disabling();
                         }
             }
            else
             {
                 
                 JOptionPane.showMessageDialog(this, "Please enter a correct ID ","",JOptionPane.ERROR_MESSAGE);
             }
            
            
        }
          
        catch (Exception e) {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error, !","",JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_editActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        reseting();
        disabling();
        bookidtxt.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         int b = JOptionPane.showConfirmDialog(null, "Do you want to Update ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (b == 0) {
                try
        {
            
           
            
    

        
        String booktype=(String) booktypeselect.getSelectedItem();
        String category=(String) categoryselect.getSelectedItem();
            
        if (nametxt.getText().equals("") || authortxt.getText().equals("")||isbntxt.getText().equals("")||category.equals("Select")||noofpagestxt.getText().equals("")||booktype.equals("Select")||pricetxt.getText().equals("")||shelfnotxt.getText().equals("")||DOR.getDate()==null) 
        {
              JOptionPane.showMessageDialog(this, "Please fill in all fields ", "",JOptionPane.WARNING_MESSAGE);
        }
          else if((Integer.parseInt(noofpagestxt.getText())<0))
        {
            JOptionPane.showMessageDialog(this, "Please fill the No of pages field correctly ", "",JOptionPane.WARNING_MESSAGE);
        }
        else if((Integer.parseInt(pricetxt.getText())<0))
        {
            JOptionPane.showMessageDialog(this, "Please fill the price field correctly ", "",JOptionPane.WARNING_MESSAGE);
        }
        else if((Integer.parseInt(shelfnotxt.getText())<0))
        {
            JOptionPane.showMessageDialog(this, "Please fill the Shelf No field correctly ", "",JOptionPane.WARNING_MESSAGE);
        }
         else if(!((availabilitytxt.getText().equals("Available"))||(availabilitytxt.getText().equals("Borrowed"))))
        {
            JOptionPane.showMessageDialog(this, "Please fill the Availability field correctly ", "",JOptionPane.WARNING_MESSAGE);
        }
        else if(bookidtxt.getText().charAt(0)=='B')
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date dateadded=DOR.getDate();
            
            String bookid=bookidtxt.getText();
               String name=nametxt.getText();
        String author=authortxt.getText();
        String isbn=isbntxt.getText();
        
        int no_of_pages=Integer.parseInt(noofpagestxt.getText());
        int shelf_no=Integer.parseInt((shelfnotxt.getText()));
        double price=Double.parseDouble(pricetxt.getText());
        String statues=availabilitytxt.getText();
        String addeddate=(String) dateFormat.format(dateadded);
        
         Connection con = DB.myCon();
            Statement stmt = con.createStatement();
         String query1=  "UPDATE book1 SET name = '"+name+"', author ='"+author+"', isbn ='"+isbn+"' , category='"+category+"',addeddate='"+addeddate+"', noofpages ="+no_of_pages+", booktype ='"+booktype+"', price="+price+", shelfno ="+shelf_no+", statues ='"+statues+"' WHERE bookid = '"+bookid+"'";
        
              stmt.executeUpdate(query1);
            
           
            
         
           
           JOptionPane.showMessageDialog(this,"Updated book Details Successfully");
           
           
           reseting();
           disabling();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter a correct ID ","",JOptionPane.WARNING_MESSAGE);
        }
              
        
        
        }
        catch (NumberFormatException n) 
        {
            JOptionPane.showMessageDialog(this, " Only Enter Numbers to Price and No of pages and shelf  fields!","",JOptionPane.WARNING_MESSAGE);
        }
         catch (Exception e) {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error, !","",JOptionPane.ERROR_MESSAGE);
                }
        }
        
        
        
        
        
    
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 int b = JOptionPane.showConfirmDialog(null, "Do you want to Delete ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (b == 0) { 
        
        try
        {
            String bookidv=bookidtxt.getText();
            String status="";
        Connection con = DB.myCon();
                         Statement s = con.createStatement();
                         
                            ResultSet res = s.executeQuery("SELECT statues FROM book1 WHERE bookid='"+bookidv+"'");
                            while (res.next()) 
                            {
                                status=res.getString("statues");
                            }
                         
                                if(status.equals("Available"))
                                {

            
                                    String q1  = ("DELETE FROM book1 WHERE bookid='"+bookidv+"'");
                                        
                                        s.executeUpdate(q1);

                                    JOptionPane.showMessageDialog(null, " book successfully Deleted");

                                        reseting();
                                        disabling();
                                        bookidtxt.setText("");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this, "Cannot be deleted, book is borrowed ", "",JOptionPane.WARNING_MESSAGE);
                                }
        }
         catch (Exception e) {
                    JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error, !","",JOptionPane.ERROR_MESSAGE);
                }
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Book_ViewAll_GUI().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new Home_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Manage_Members_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Manage_Books_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Manage_Book_Lending().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Manage_Inventory_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Manage_Newspaper_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new Manage_User_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manage_Books_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Books_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Books_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Books_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Manage_Books_GUI().setVisible(true);
            }
        });
    }
    
    private void disabling() {
        nametxt.setEnabled(false);
        authortxt.setEnabled(false);
        
        isbntxt.setEnabled(false);
         availabilitytxt.setEnabled(false);
         categoryselect.setEnabled(false);
         booktypeselect.setEnabled(false);
         pricetxt.setEnabled(false);
         noofpagestxt.setEnabled(false);
         shelfnotxt.setEnabled(false);
         DOR.setEnabled(false);
         
         update.setEnabled(false);
            delete.setEnabled(false);
  
    }
private void reseting() {
        bookidtxt.setText("");
    nametxt.setText("");
        authortxt.setText("");
               isbntxt.setText("");
         categoryselect.setSelectedItem(null);
         DOR.setCalendar(null);
         pricetxt.setText("");
          booktypeselect.setSelectedItem(null);
         noofpagestxt.setText("");
         shelfnotxt.setText("");
         availabilitytxt.setText("");
         
        
         
         
         
  
    }
private void enabling() {
        nametxt.setEnabled(true);
        authortxt.setEnabled(true);
        
        isbntxt.setEnabled(true);
         availabilitytxt.setEnabled(true);
         categoryselect.setEnabled(true);
         booktypeselect.setEnabled(true);
         pricetxt.setEnabled(true);
         noofpagestxt.setEnabled(true);
         shelfnotxt.setEnabled(true);
         DOR.setEnabled(true);
         
         
  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOR;
    private javax.swing.JTextField authortxt;
    private javax.swing.JTextField availabilitytxt;
    private javax.swing.JTextField bookidtxt;
    private javax.swing.JComboBox booktypeselect;
    private javax.swing.JComboBox categoryselect;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField isbntxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField noofpagestxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField shelfnotxt;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
