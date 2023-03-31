/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import entidades.CuentaBancaria;
import servicios.CuentaBancariaServicio;

/**
 *
 * @author leandro
 */
public class Guia8ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CuentaBancariaServicio s1 = new CuentaBancariaServicio();
        CuentaBancaria nuevaCuenta = s1.crearCuenta();

        System.out.println(nuevaCuenta);
        System.out.println(" ");
        
        nuevaCuenta.setSaldoActual(s1.ingresar(nuevaCuenta.getSaldoActual()));
        
        System.out.println(nuevaCuenta);
        
        nuevaCuenta.setSaldoActual(s1.retirar(nuevaCuenta.getSaldoActual()));
        System.out.println(" ");
        System.out.println(nuevaCuenta);
        
        nuevaCuenta.setSaldoActual(s1.extraccionRapida(nuevaCuenta.getSaldoActual()));
        System.out.println(" ");
        System.out.println(nuevaCuenta);
    }

}
