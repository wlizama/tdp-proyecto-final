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
    
    static ProductoLista prodLista = new ProductoLista();
    
    static void ingresarProducto() {
        
        System.out.println("## INGRESAR NUEVO PRODUCTO ##");
        
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        
        System.out.print("Tipo: ");
        char tipo = sc.next().charAt(0);
        
        sc.nextLine(); // limpiar buffer
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
//        sc.nextLine(); // limpiar buffer
        
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        
        sc.nextLine(); // limpiar buffer
        
        System.out.print("Porcentaje de descuento: ");
        double porcDesc = sc.nextDouble();
        
        sc.nextLine(); // limpiar buffer
        
        System.out.print("Cantidad en stock: ");
        double cantidadStock = sc.nextDouble();
        
        Producto prod = new Producto(codigo, tipo, nombre, precio, porcDesc, cantidadStock);
        
        prodLista.agregarProducto(prod);
    }
    
    static void registrarVenta() {
        if (prodLista.cantidadProductos() > 0) {
            System.out.println("## REGISTRAR VENTA ##");
            System.out.print("### Ingrese código de producto a buscar: ");
            int codigo = sc.nextInt();
            Producto prd =  prodLista.buscarProductoXCodigo(codigo);
            if (prd != null) {
                System.out.println("### Producto seleccionado: ");
                prd.mostrarProducto();
                
                System.out.print("### Ingrese cantidad a vender: ");
                int cantidad = sc.nextInt();
                Venta ven = new Venta(cantidad, prd);
                double monto_final = ven.calcularMontoFinal();
                
                System.out.println("Producto: " + prd.nombre + ", vendido");
                System.out.println("Monto total a pagar: S/ " + monto_final);
                System.out.println("al producto le quedan " + prd.cantidadStock + ", unidades en stock");
            }
            else
                System.out.println("## ⚠ NO SE ENCONTRO PRODUCTO CON CODIGO: " + codigo + " ##");
        }
        else {
            System.out.println("## ⚠ NO EXISTEN PRODUCTOS REGISTRADOS ##");
        }
    }
    
    static void mostrarReporte() {
        System.out.println("## MOSTRAR REPORTE ##");
        System.out.println("### Lista de productos: ");
        if (prodLista.cantidadProductos() > 0) {
            prodLista.mostrarListaProductos();
        }
        else {
            System.out.println("## ⚠ NO EXISTEN PRODUCTOS REGISTRADOS ##");
        }
        
    }
    
    static void menu() {
        
        char operacion = 'X';

        do {
            System.out.println("################################");
            System.out.println("Que operación desea realizar?");
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
