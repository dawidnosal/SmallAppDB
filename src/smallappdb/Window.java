package smallappdb;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Window extends javax.swing.JFrame {

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public Window() {
        initComponents();
        conn = Connect.ConnectDB();
        FillCombo();
        ShowMeTable((String)combobox_tablename.getSelectedItem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        combobox_tablename = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("okno główne - POŁĄCZONO Z BAZĄ DANYCH");
        setResizable(false);

        tabela.setFillsViewportHeight(true);
        tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabela);

        combobox_tablename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wybierz tabelę do wyświetlenia" }));
        combobox_tablename.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combobox_tablenamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setText("Wybierz tabelę do wyświetlenia:");

        jButton1.setText("odśwież");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("połącz z inną bazą");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("exit");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("dodaj nową tabelę");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("usuń zaznaczoną tabelę");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem10.setText("zmień nazwę zaznaczonej tabeli");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator2);

        jMenuItem6.setText("dodaj nowy wiersz");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("usuń zaznaczony wiersz");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setText("zaktualizuj zaznaczony wiersz");
        jMenuItem7.setEnabled(false);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Sort");
        jMenu6.setEnabled(false);

        jMenuItem8.setText("sortuj rosnąco wybraną kolumnę");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("sortuj malejąco wybraną kolumnę");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(combobox_tablename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox_tablename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    public void ShowMeTable(String tableName){
        try{
            DefaultTableModel model = new DefaultTableModel();
            this.tabela.setModel(model);
            st = conn.createStatement();    //uruchamiamy kwerendę
            rs = st.executeQuery("select * FROM " + tableName);    //wykonujemy zapytanie i przechowujemy go w ResultSet
            ResultSetMetaData rsMD = rs.getMetaData();
            int col = rsMD.getColumnCount();    //liczba kolumn, które posiada zapytanie
            
            for(int i = 1; i <= col; i++){          //ustawia nazwę kolumny
                model.addColumn(rsMD.getColumnLabel(i));
            }
            
            while(rs.next()){       //tworzenie wierszy do jTable
                Object[] fila = new Object[col];
                for (int i = 0; i < col; i++){
                    fila[i] = rs.getObject(i+1);
                }
                model.addRow(fila);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();            
        }
    }
    
    
    private void combobox_tablenamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combobox_tablenamePopupMenuWillBecomeInvisible
        try{
            String temp = (String)combobox_tablename.getSelectedItem();     //pobiera zaznaczony element
            ShowMeTable(temp);                                              //wyświetla zaznaczoną tabelę
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_combobox_tablenamePopupMenuWillBecomeInvisible

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        LoginFrame lf = new LoginFrame();
        lf.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Frame_dodajNowaTabele nowa = new Frame_dodajNowaTabele();
        nowa.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      int n = JOptionPane.showConfirmDialog(null, "Na pewno chcesz usunąć tabelę? \ntabela: "+(String)combobox_tablename.getSelectedItem(), "", JOptionPane.YES_NO_OPTION);

      if(n == JOptionPane.YES_OPTION)
      {
        try{
            String temp = (String)combobox_tablename.getSelectedItem(); 
            String sql = "drop table "+temp;
            st = conn.createStatement();
            st.executeUpdate(sql);
            FillCombo();
            ShowMeTable((String)combobox_tablename.getSelectedItem());
        }
        catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
      }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
    }//GEN-LAST:event_tabelaAncestorAdded

    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            String s = (String)combobox_tablename.getSelectedItem();           
            int column = 0;
            int row = tabela.getSelectedRow();
            try{            

                String sql = "DELETE FROM "+ s +" WHERE "+tabela.getColumnName(0)+" = '" +tabela.getModel().getValueAt(row, column).toString()+"'" ;
                st = conn.createStatement();
                st.executeUpdate(sql);
                ShowMeTable((String)combobox_tablename.getSelectedItem());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String[] ss = new String[tabela.getColumnCount()];
            for(int i = 0; i< tabela.getColumnCount(); i++){
            ss[i] = JOptionPane.showInputDialog("Podaj wartość dla kolumny: "+ tabela.getColumnName(i));
        }
            
        String sql = null;
        switch (tabela.getColumnCount()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Dana tabela jest pusta", "Niestety!", HEIGHT);
                break;
            case 1:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"')";
                break;
            case 2:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"')";
                break;
            case 3:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"')";
                break;
            case 4:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"')";
                break;
            case 5:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"','"+ ss[4] +"')";
                break;
            case 6:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"','"+ ss[4] +"','"+ ss[5] +"')";
                break;
            case 7:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"','"+ ss[4] +"','"+ ss[5] +"','"+ ss[6] +"')";  //nie sprawdzone
                break;
            case 8:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"','"+ ss[4] +"','"+ ss[5] +"','"+ ss[6] +"','"+ ss[7] +"')";
                break;
            case 9:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"','"+ ss[4] +"','"+ ss[5] +"','"+ ss[6] +"','"+ ss[7] +"','"+ ss[8] +"')";
                break;
            case 10:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES('" +ss[0]+"', '"+ ss[1] +"', '"+ss[2] +"', '"+ ss[3]+"','"+ ss[4] +"','"+ ss[5] +"','"+ ss[6] +"','"+ ss[7] +"','"+ ss[8] +"','"+ ss[9] +"')";
                break;
            case 11:
                sql = "INSERT INTO " + (String)combobox_tablename.getSelectedItem()+ " VALUES ('"+ ss[0] +"', '"+ ss[1] +"', '"+ ss[2] +"', '"+ ss[3] +"', '"+ ss[4] +"', '"+ ss[5] +"', '"+ ss[6] +"', '"+ ss[7] +"', null, '"+ ss[9] +"', '"+ ss[10] +"')";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Bierząca wersja programu nie wspiera bazy z większą liczbą kolumn w tabeli", "Niestety!", HEIGHT);
                break;
        }
        
        try{
                st = conn.createStatement();
                st.executeUpdate(sql);
                ShowMeTable((String)combobox_tablename.getSelectedItem());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
         
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
//            int column = 0;
//            int row = tabela.getSelectedRow();
//  
//        
//        String[] ss = new String[tabela.getColumnCount()];
//        for(int i = 0; i< tabela.getColumnCount(); i++){
//            ss[i] = JOptionPane.showInputDialog("Podaj wartość dla kolumny: "+ tabela.getColumnName(i), tabela.getModel().getValueAt(row, i).toString());
//        }
//        try{
//            String sql = null;
//            for(int i = 0; i<=tabela.getColumnCount();i++){
//                sql = "UPDATE "+ (String)combobox_tablename.getSelectedItem() +" SET "+ tabela.getColumnName(1) +" = '"+ ss[1] +"' WHERE "+ tabela.getColumnName(0) +" = '"+ tabela.getModel().getValueAt(row, column).toString() +"'";
//            }
////                if(tabela.getColumnCount()==2){
////                    sql = "UPDATE "+ (String)combobox_tablename.getSelectedItem() +" SET "+ tabela.getColumnName(1) +" = '"+ ss[1] +"' WHERE "+ tabela.getColumnName(0) +" = '"+ tabela.getModel().getValueAt(row, column).toString() +"'";
////                }
////                else if(tabela.getColumnCount()==3){
////                    sql = "UPDATE "+ (String)combobox_tablename.getSelectedItem() +" SET "+ tabela.getColumnName(1) +" = '"+ ss[1] +"', "+ tabela.getColumnName(2) +"='"+ ss[2] +"' WHERE "+ tabela.getColumnName(0) +" = '"+ tabela.getModel().getValueAt(row, column).toString() +"'";
////                }
////                else if(tabela.getColumnCount()==4){
////                    sql = "UPDATE "+ (String)combobox_tablename.getSelectedItem() +" SET "+ tabela.getColumnName(1) +" = '"+ ss[1] +"', "+ tabela.getColumnName(2) +"='"+ ss[2] +"',"+ tabela.getColumnName(3) +"='"+ ss[3] +"' WHERE "+ tabela.getColumnName(0) +" = '"+ tabela.getModel().getValueAt(row, column).toString() +"'";
////                }
////                else if(tabela.getColumnCount()==11){
////                    JOptionPane.showMessageDialog(null, "11");
////
////                    sql = "UPDATE "+ (String)combobox_tablename.getSelectedItem() +" SET "+ tabela.getColumnName(1) +" = '"+ ss[1] +"', "+ tabela.getColumnName(2) +"='"+ ss[2] +"',"+ tabela.getColumnName(3) +"='"+ ss[3] +"', "+ tabela.getColumnName(4) +"='"+ ss[4] +"', "+ tabela.getColumnName(5) +"='"+ ss[5] +"', "+ tabela.getColumnName(6) +"='"+ ss[6] +"', "+ tabela.getColumnName(7) +"='"+ ss[7] +"', "+ tabela.getColumnName(8) +"='"+ ss[8] +"', "+ tabela.getColumnName(9) +"='"+ ss[9] +"', "+ tabela.getColumnName(10) +"='"+ ss[10] +"' WHERE "+ tabela.getColumnName(0) +" = '"+ tabela.getModel().getValueAt(row, column).toString() +"'";
////                }
//                if(sql != null){
//                    st = conn.prepareStatement(sql);
//                    rs = st.executeQuery(sql);
//                    ShowMeTable((String)combobox_tablename.getSelectedItem());
//                }
//        }
//        catch(Exception ex){
//            JOptionPane.showMessageDialog(null, ex);
//        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
      String s = JOptionPane.showInputDialog(null,"Podaj nazwę tabeli: ", (String)combobox_tablename.getSelectedItem());
      if(s != null)
      {
        try{
            String temp = (String)combobox_tablename.getSelectedItem(); 
            String sql = "ALTER TABLE "+ temp +" RENAME TO "+s;
            st = conn.createStatement();
            st.executeUpdate(sql);
            FillCombo();
            ShowMeTable((String)combobox_tablename.getSelectedItem());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
      }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FillCombo();
        ShowMeTable((String)combobox_tablename.getSelectedItem());
    }//GEN-LAST:event_jButton1ActionPerformed
      
    public void FillCombo(){
        try{
            String sql = "SELECT table_name FROM information_schema.tables where table_schema='"+LoginFrame.sid+"'";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery(sql);
            
            combobox_tablename.removeAllItems();                            //przed dodaniem elementów, zeruje
            
            while(rs.next()){                                               //wyświetlamy listę dostępnych tabel w bazie danych
                String table_name = rs.getString("table_name");
                combobox_tablename.addItem(table_name);                     //wypełniam combobox'a dostępnymi tabelami
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> combobox_tablename;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
