/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihantutorial;

/**
 *
 * @author ASUS
 */
public class TestSenjata {
    public static void main(String[] args){
        
        Senjata AK47 = new Senjata("TAR");
        Senjata M16 = new Senjata("DOR");
        
        ControlSenjata controlAK47 = new ControlSenjata(AK47);
        ControlSenjata controlM16 = new ControlSenjata(M16);
        
        
        controlAK47.menembak(3);
        controlAK47.isiPeluru(2);
        controlAK47.menembak(5);
        
        System.out.println("====================================================");
        
        controlM16.menembak(1);
        controlM16.isiPeluru(5);
        controlM16.menembak(2);
        
    }
}
