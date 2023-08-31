
package Modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Conexion {
    DB baseDatos;

    DBCollection coleccionMedicamento;

    
    //Constructor
    public Conexion(){
        MongoClient mongo=new MongoClient("localhost",27017);
        baseDatos= mongo.getDB("Farmacia");
        coleccionMedicamento=baseDatos.getCollection("Medicina");

        System.out.println("Conexion aBD ok");
    }
}