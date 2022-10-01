/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Scanner;
/**
 *
 * @author marco
 */
//Ejercicio 5
/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son:*/
public class CuentaBancaria {
    private int numeroCuenta;
    private int dniCliente;
    private int saldoActual;
    
    //a)Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.

    //Constructor por defecto -> obligatorio
    public CuentaBancaria() {
    }
    
    //Constructor con parametros

    public CuentaBancaria(int numeroCuenta, int dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
   // b) Agregar los métodos getters y setters correspondientes
    
    //Métodos Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }
    
    //Métodos Setters

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    
    public void crearObjetoCuenta(){
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese Numero de Cuenta : ");
        this.dniCliente=Leer.nextInt();
        System.out.println("Ingrese DNI :");
        this.numeroCuenta=Leer.nextInt();
        System.out.println("Ingrese Saldo Actual");
        this.saldoActual=Leer.nextInt();
    }
   //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
   //y se la sumara a saldo actual.
    
    public void ingresar(double ingreso){
        this.saldoActual+=ingreso;
    }
    
   /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
    restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
    saldo actual en 0. */
    public void retiro (double retiro){
        if(this.saldoActual<retiro){
            this.saldoActual=0;
            }else{ 
            this.saldoActual-=retiro;
        }
        
    }
    
    /*f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
            usuario no saque más del 20%    
    */
    public double extraccionRapida(){
        double extraccion;
        double porcentaje=0.2;
        extraccion = porcentaje*this.saldoActual;
        if(extraccion<0.21){
            return 0;
        }
        return extraccion;
        }
    
    /*
    Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    */
    
    public void consultarSaldo(){
        System.out.println("El saldo Actual es :" + this.saldoActual);
    }
    
    /*
    Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    */
    
    public void consultarDatos(){
        System.out.println("El DNI es : " + this.dniCliente);
        System.out.println("El numero de cuentas es : " + this.numeroCuenta);
    }
}
