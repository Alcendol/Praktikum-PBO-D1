/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajardatum;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        Datum<Anabul> d1 = new Datum<>(new Kucing());
        Datum<Anabul> d2 = new Datum<>(new Anjing());
        Datum<Anabul> d3 = new Datum<>(new Burung());

        d1.getIsi().bersuara();
        d1.getIsi().bergerak();

        d2.getIsi().bersuara();
        d2.getIsi().bergerak();

        d3.getIsi().bersuara();
        d3.getIsi().bergerak();
    }
}
