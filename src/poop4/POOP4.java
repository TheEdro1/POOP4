/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author Ethan
 */
public class POOP4 {

    public static void main(String[] args) {
        Punto punto = new Punto();
        punto.imprimePunto();
        Punto punto2 = new Punto(1,2,"Punto2");
        punto2.imprimePunto();
        punto.x=20;
        punto.y=100;
        punto.nombre="punto 1";
        punto.imprimePunto();
        System.out.println(punto);
       
        Perro perro = new Perro();
        perro.imprimirPerro();
        Perro perro2 = new Perro("cafe", "largo", 30, "chihuahua", 10); //se pone el color y demas
        perro2.imprimirPerro();
    }
}
