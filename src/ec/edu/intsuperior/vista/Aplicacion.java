/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;


import ec.edu.intsuperior.modelo.Personas;
import ec.edu.intsuperior.modelo.Vehiculos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);        
        Vehiculos ve=new Vehiculos();
        Personas pe=new Personas();
        ve.setModelo("Ferrari");
        System.out.println("Ingrese la marca del vehiculo");
        ve.setMarca(leer.next());
        System.out.println("Ingrese el color del vehiculo");
        ve.setColor(leer.next());
        System.out.println("Ingrese el tipo de vehiculo");
        ve.setTipo(leer.next());
        System.out.println("ingrese el año de fabricacion");
        ve.setAño_fabricacion(leer.nextInt());
        
        
        System.out.println("El modelo del vehiculo es: "+ve.getModelo()+"\n"+"La marca del vehiculo es: "+ve.getMarca()+"\n"+"El color del vehiculo es: "+ve.getColor()
        +"\n"+"El tipo de vehiculo es "+ve.getTipo()+"\n"+"El año de fabricacion es:"+ve.getAño_fabricacion()+"\n");
        
        System.out.println("Registro de personas \n");
        System.out.println("Ingrese el nombre: ");
        pe.setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        pe.setApellido(leer.next());
        System.out.println("Ingrese la edad: ");
        pe.setEdad(leer.next());
        System.out.println("Ingrese Genero: ");
        pe.setGenero(leer.next());
        System.out.println("Ingrese la cedula: ");
        pe.setCedula(leer.next());
        System.out.println("Nombre: "+pe.getNombre()+"\n"+"Apellido: "+pe.getApellido()+"\n"+"Edad: "+pe.getEdad()+"\n"+"Genero: "+pe.getGenero()+"\n"+"Cedula: "+pe.getCedula());
        
        
    }
}
