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
public class Contabilidad {
    
    public float calcularIva(float total){
        float totalIva = 0.0f;
        final float IVA = 0.16f;
        totalIva  = IVA * total;
        return totalIva;
    }

    public int obtenerTotal(Productos [] lstProductos){
        int total = 0;
        for(int x = 0; x < lstProductos.length ; x++){
           total += lstProductos[x].getCosto();
        }
        return total;
    }
    
    public int obtenerTotalArrayList(ArrayList<Productos> lstProductos){
        int total = 0;
        
        for (Productos p : lstProductos){
            total += p.getCosto();
        }
//        for(int x = 0; x < lstProductos.size() ; x++){
//           Productos p = (Productos) lstProductos.get(x);
//           total += p.getCosto();
//        }
        return total;
    }
    

    public float descontar(int total, int porcentaje){
        float descuento = (porcentaje * total) / 100f;
        return descuento;
    }
    
    public void obtenerUtilidad(float total, float descuentos){
        System.out.println("Utilidad: " + (total - descuentos));
    }
}
