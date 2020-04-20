/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase1;

/**
 *
 * @author torres
 */
public class Persona {

    private String name;
    private int age;
    private String curp;
    private boolean isMale;
    private float height;
    private String lastName;
    
    public Persona(){
        
    }

    public Persona(String name, int age, String curp, boolean isMale, float height, String lastName) {
        this.name = name;
        this.age = age;
        this.curp = curp;
        this.isMale = isMale;
        this.height = height;
        this.lastName = lastName;
    }
    
    public void sumar(){
        System.out.println("esto es una suma");
    }
    
    
    public void sumar(int num1, int num2){
        System.out.println("esto es una suma");
    }
    

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCurp() {
        return this.curp;
    }

    public void generateCurp() {
        curp = "pjgt";
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.name + " Apellido: " + this.lastName;
    }
    
}
