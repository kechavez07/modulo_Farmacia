/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Medicamento;
import Vista.MedicamentoV;
import Vista.Principal;
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

    public Control(MedicamentoV medicamentoV,Principal principal) {
        this.vistaMedicamento = medicamentoV;
        vistaMedicamento.botonAtras.addActionListener(this);
        
        
        this.menu = principal;
        this.menu.botonMedicamento.addActionListener(this);
        
        
        
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
