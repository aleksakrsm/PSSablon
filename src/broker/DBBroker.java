/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleks
 */
public class DBBroker {

    private Connection connection;

    public void otvoriKonekciju() {
        String username = "root";//username vidis u SQLyog
        String password = "";
        String url = "jdbc:mysql://localhost:3306/imebaze";
        try {
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void zatvoriKonekciju() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void commitTransaction() {
        try {
//            if (connection != null && !connection.isClosed()) {
//                connection.commit();
//            }
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void rollbackTransaction() {
        try {
//            if (connection != null && !connection.isClosed()) {
//                connection.rollback();
//            }
            connection.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public List<NekaKlasa> tvojaMetoda1() throws Exception{
//      String upit = "SELECT * FROM nekatabela"  
//    ...
//    
//    }
    
    

}
