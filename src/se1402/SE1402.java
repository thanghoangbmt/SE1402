/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1402;

import util.MyToys;

/**
 *
 * @author Admin
 */
public class SE1402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + MyToys.cF(5));
        System.out.println("6! = " + MyToys.cF(6));
        System.out.println("0! = " + MyToys.cF(0));
        System.out.println("Exeption: " + MyToys.cF(-5));
    }

}
