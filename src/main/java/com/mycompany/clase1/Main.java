/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase1;

import java.util.ArrayList;

/**
 *
 * @author torres
 */
public class Main {
    int total = 0;
    //POO
    public static void main(String[] args) {

//      nameclass identificador = new nameclass()
//      WRITE ONCE, RUN ANYWHERE
//        Persona obj = new Persona();
//        obj.setName("Pablo");
//        obj.setLastName("Torres");
//        obj.setAge(19);
//        obj.setHeight((float) 12.3);
//        obj.setIsMale(true);
//        Methods objMain = new Methods();
//        objMain.saludar();
////        com.mycompany.clase1.Persona@4aa298b7
////        Persona{name=Pablo, age=19, curp=null, isMale=true, height=12.3, lastName=null}
////        NombrePablo Apellidonull
////        Nombre: Pablo Apellido: Torres
//        System.out.println(obj);

        Contabilidad m = new Contabilidad();
//        0 ----> n-1
//        int preciosProductos [] = {1,4,23,23,1};
        
        Productos listProductos [] = new Productos[2];
        
        
        ArrayList<Productos>lst = new ArrayList();
        
        
        Productos objProducto = new Productos();
        objProducto.setArticulo("Coca cola");
        objProducto.setDescripcion("Refresco");
        objProducto.setCosto(10);
        
        
        Productos objProducto2 = new Productos();
        objProducto2.setArticulo("Coca cola");
        objProducto2.setDescripcion("Refresco 1 ltr");
        objProducto2.setCosto(14);
        
        Productos objProducto3 = new Productos();
        objProducto3.setArticulo("Coca cola");
        objProducto3.setDescripcion("Refresco 2 ltr");
        objProducto3.setCosto(24);
        
        
        lst.add(objProducto);
        lst.add(objProducto2);
        lst.add(objProducto3);
        
        listProductos[0] = objProducto;
        listProductos[1] = objProducto3;
        
        int total = m.obtenerTotalArrayList(lst);
        float descuento = m.descontar(total, 10);
        float iva = m.calcularIva((total- descuento));
       
        System.out.println(total);
        System.out.println(descuento);
        System.out.println(iva); 
        m.obtenerUtilidad(total, descuento);
        
        
//        int total = m.obtenerTotal(preciosProductos);
//        System.out.println("Total:" + total);
//        float descuento = m.descontar(total, 10);
//        System.out.println("Descuento "+ descuento);
//        float iva = m.calcularIva((total- descuento));
//        m.obtenerUtilidad(total, descuento);
    }
    
    
    
    
}
