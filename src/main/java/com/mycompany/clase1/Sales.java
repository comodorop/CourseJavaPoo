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
public class Sales {
    private int ticke;
    private String nameClient;
    private ArrayList<Productos>lst = new ArrayList<>();

    public int getTicke() {
        return ticke;
    }

    public void setTicke(int ticke) {
        this.ticke = ticke;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public ArrayList<Productos> getLst() {
        return lst;
    }

    public void setLst(ArrayList<Productos> lst) {
        this.lst = lst;
    }
    
    
    
}
