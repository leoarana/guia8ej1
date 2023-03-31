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

    public CuentaBancaria crearCuenta() {

        System.out.println("ingrese el numero de cuenta");
        int numeroCuenta = leer.nextInt();

        System.out.println("ingrese su dni");
        long dniCliente = leer.nextLong();

        System.out.println("ingrese su saldo");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

    public double ingresar(double saldo) {
        double a;

        System.out.println("cuanto dinero desea ingresar dinero?");
        a = leer.nextDouble();

        a = saldo + a;
        return a;
    }

    public double retirar(double saldo) {
        double a;
        System.out.println("cuanto dinero desea retirar");
        a = leer.nextDouble();

        if (a < saldo) {
            a = saldo - a;
        } else if (a > saldo) {
            a = 0;
        }

        return a;
    }

    public double extraccionRapida(double saldo) {
        double a;
        int b;

        do {
            b = 0;
            System.out.println("cuanto desea extraer, recuerde que solo puede sacar hasta un 20% de su saldo");
            a = leer.nextDouble();

            if (a <= (saldo * 0.2)) {
                a = saldo - a;
            } else {
                System.out.println("el monto ingresado no puede ser retirado");
                b = 1;
            }

        } while (b > 0);

        return a;
    }

    public void consultarSaldo(double saldo) {

        System.out.println("su saldo es $" + saldo);

    }

    public void consultarDatos(int cuenta, long dni, double saldo) {

        System.out.println(" ");
        System.out.println("su numero de cuenta es " + cuenta);
        System.out.println("su dni es " + dni);
        System.out.println("su saldo es $" + saldo);
        System.out.println(" ");
    }

}
