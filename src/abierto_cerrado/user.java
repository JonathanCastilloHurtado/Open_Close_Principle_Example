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
public class user implements interfaceUser {

    @Override
    public void watchVideo(device device) {
    device.watchVideo(); 
    }

    @Override
    public void surfInternet(device device) {
    device.surfInternet();
    }
    
}
