/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

/**
 *
 * @author ENRIQUE
 */
public class MedicamentoDAO {
    public void insertarCliente(Medicamento medicamento){
        Conexion objCon= new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", medicamento.getNombre());
        documento.put("codigo", medicamento.getCodigo());
        documento.put("precio", medicamento.getPrecio());
        documento.put("stock", medicamento.getStock());
        
        objCon.coleccionMedicamento.insert(documento);
    }
    
}
