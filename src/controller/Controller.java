/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import broker.DBBroker;
import java.util.List;

/**
 *
 * @author aleks
 */
public class Controller {

    private static Controller instance;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

//    public List<NekaKlasa> tvojaMetoda() throws Exception{
//        List<NekaKlasa> lista = null;
//        DBBroker broker = new DBBroker();
//        broker.otvoriKonekciju();
//        try {
//            lista = broker.tvojaMetoda1();
//            broker.commitTransaction();
//            return lista;
//        } catch (Exception e) {
//            broker.rollbackTransaction();
//            throw e;
//        } finally {
//            broker.zatvoriKonekciju();
//        }
//    }

}
