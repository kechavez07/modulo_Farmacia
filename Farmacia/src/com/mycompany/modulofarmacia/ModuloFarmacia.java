/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.modulofarmacia;

import Controlador.Control;
import Vista.MedicamentoV;
import Vista.Principal;

/**
 *
 * @author HP
 */
public class ModuloFarmacia {

    public static void main(String[] args) {
       
       Principal principal= new Principal();
       MedicamentoV medicamentoV = new MedicamentoV();
       principal.setVisible(true);
       
       Control c = new Control (medicamentoV,principal);
       
       
    }
}
