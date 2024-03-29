/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class UserControllers {
    
    private DatabaseConnection dbConnection2;

    public UserControllers(DatabaseConnection dbConnection2) {
        this.dbConnection2 = dbConnection2;
    }

    
    
    public DefaultTableModel getTableModelForUser() {
    MongoCollection<Document> collection = dbConnection2.getCollection();
    MongoCursor<Document> cursor = collection.find().iterator();
    DefaultTableModel tableModel1 = new DefaultTableModel();
    tableModel1.addColumn("Nombres");
    tableModel1.addColumn("Apellidos");
    tableModel1.addColumn("CI");
    tableModel1.addColumn("Direccion");
    tableModel1.addColumn("Email");
    
    while (cursor.hasNext()) {
        Document document = cursor.next();
        String nombres = document.getString("nombres");
        String apellidos = document.getString("apellidos");
        String ci = document.getString("ci");
        String direccion = document.getString("direccion");
        String email = document.getString("email");
        
        Object[] row = {nombres, apellidos, ci, direccion, email};
        tableModel1.addRow(row);
    }
    
    return tableModel1;
}
    
}
