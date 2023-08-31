/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Medicamento;
import Modelo.MedicamentoDAO;
import Vista.MedicamentoV;
import Vista.Principal;
import Vista.RegistroMedicamentoV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author HP
 */
public class Control implements ActionListener, KeyListener {
    
    MedicamentoV vistaMedicamento = new MedicamentoV();
    Principal menu = new Principal();
    MedicamentoDAO medicamentoDAO = new MedicamentoDAO();
    RegistroMedicamentoV registro = new RegistroMedicamentoV();

    public Control(
            MedicamentoV medicamentoV,
            Principal principal,
            RegistroMedicamentoV registrov,
            MedicamentoDAO medicamentodao
            
       ) {
        this.vistaMedicamento = medicamentoV;
        vistaMedicamento.botonAtras.addActionListener(this);
        vistaMedicamento.botonAgregar.addActionListener(this);
        vistaMedicamento.botonBuscar.addActionListener(this);
        vistaMedicamento.botonEliminar.addActionListener(this);
        vistaMedicamento.botonModificar.addActionListener(this);
        
        this.menu = principal;
        this.menu.botonMedicamento.addActionListener(this);
        
        this.registro = registrov;
        this.registro.botonAtras.addActionListener(this);
        this.registro.botonGuardar.addActionListener(this);
        this.registro.codigoMedicamento.addKeyListener(this);
        this.registro.nombreMedicamento.addKeyListener(this);
        this.registro.stockMedicamento.addKeyListener(this);
        
        this.medicamentoDAO = medicamentodao;
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==menu.botonMedicamento){
            menu.setVisible(false);
            vistaMedicamento.setVisible(true);
        }
       if(e.getSource()==vistaMedicamento.botonAtras){
           vistaMedicamento.setVisible(false); 
           menu.setVisible(true);
        }
       if(e.getSource()==vistaMedicamento.botonAgregar){
           vistaMedicamento.setVisible(false); 
           registro.setVisible(true);
        }
       if(e.getSource()==registro.botonGuardar){
           String nombre = registro.nombreMedicamento.getText();
           String codigo = registro.codigoMedicamento.getText();
           String precio = registro.precioMedicamento.getText();
           String stock = registro.stockMedicamento.getText();
           float preciof = Float.parseFloat(precio);
           int stockf = Integer.parseInt(stock);
           Medicamento docMedicamento = new Medicamento(nombre,codigo,preciof,stockf);
           System.out.println(docMedicamento.toString());
           
           medicamentoDAO.insertarCliente(docMedicamento);
           registro.codigoMedicamento.setText(" ");
           registro.nombreMedicamento.setText(" ");
           registro.precioMedicamento.setText(" ");
           registro.stockMedicamento.setText(" ");
          
        }
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
  
    }

    @Override
    public void keyReleased(KeyEvent e) {
  
    }
    
    
}
