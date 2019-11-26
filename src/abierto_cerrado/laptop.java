/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abierto_cerrado;

/**
 *
 * @author JonathanC
 */
public class laptop implements device {

    @Override
    public void surfInternet() {
    System.out.println("surfing from a desktop aplication");
    }

    @Override
    public void watchVideo() {
    System.out.println("watching from a web plataform or desktop aplication");
    }
    
}
