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
public class Abierto_cerrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        smartPhone iphoneXS = new smartPhone();
        laptop macbookPro = new laptop();
        new user().watchVideo(iphoneXS);
    }
    
}
