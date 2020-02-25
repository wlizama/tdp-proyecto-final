/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.proyecto.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author wilder
 */
public class Principal {
    static Scanner sc = new Scanner(System.in);
    
    static void ingresarProducto() {
        System.out.println("## INGRESAR NUEVO PRODUCTO ##");
        
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        
        System.out.print("Tipo: ");
        char tipo = sc.next().charAt(0);
        
        System.out.print("Nombre: ");
        String nombre = sc.next();
        
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        
        System.out.print("Porcentade de escuento: ");
        double porcDesc = sc.nextDouble();
        
        System.out.print("Cantidad en stock: ");
        double cantidadStock = sc.nextDouble();
        
        Producto prod = new Producto(codigo, tipo, nombre, precio, porcDesc, cantidadStock);
        
        ProductoLista prodLista = new ProductoLista();
        prodLista.agregarProducto(prod);
    }
    
    static void registrarVenta() {
        System.out.println("## REGISTRAR VENTA ##");
    }
    
    static void mostrarReporte() {
        System.out.println("## MOSTRAR REPORTE ##");
    }
    
    static void menu() {
        

        char operacion = 'X';

        do {
            System.out.println("Que operación desea realizar?:");
            System.out.println("[I]ngresar nuevo Producto");
            System.out.println("[R]egistrar Venta");
            System.out.println("[M]ostrar reporte");
            System.out.println("[F]inalizar programa");
            System.out.print(": ");

            operacion = sc.next().toUpperCase().charAt(0);
            
            if (operacion == 'I')
                ingresarProducto();
            else if (operacion == 'R')
                registrarVenta();
            else if (operacion == 'M')
                mostrarReporte();
            else if (operacion != 'F')
                System.out.println("No se pudo encontar opción elegida");
            
            
        } while(operacion != 'F');
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
}
