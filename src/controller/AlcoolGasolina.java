/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Interface;

/**
 *
 * @author Windows 7
 */
public class AlcoolGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    mostrarInterface();
}

 public static void mostrarInterface(){
        Interface inter = new Interface();
        inter.setTitle("Interface");
        inter.setLocationRelativeTo(null);
        inter.setVisible(true);
}
}
