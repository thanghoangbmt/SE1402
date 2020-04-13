/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class MyToys {
    //Bộ thư viện các hàm xài chung, cho nên chúng là static
    //cf: compute factorial, tính giai thừa n! = 1.2.3...n
    //0! = 1
    
    public static long cF(int n) {
        if (n < 0 || n > 15)
            throw new IllegalArgumentException("Sorry, n must be >= 0");
        if (n == 0) 
            return 1;
        
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
