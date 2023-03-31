/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;


/**
 *
 * @author leandro
 */
public class CuentaBancariaServicio {
    
  private Scanner leer = new Scanner(System.in);
    
   public CuentaBancaria crearCuenta(){
   
       System.out.println("ingrese el numero de cuenta");
   int numeroCuenta = leer.nextInt();
   
       System.out.println("ingrese su dni");
       long dniCliente = leer.nextLong();
       
       System.out.println("ingrese su saldo");
       double saldoActual = leer.nextDouble();
       
       return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
       
   }
   
    
}
