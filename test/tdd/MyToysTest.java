/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;

/**
 *
 * @author Admin
 */
public class MyToysTest {

    @Test
    public void testSuccessfullCases() {
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExeptionCases() {
        //ko có value để assert do hàm cF() ném ra ngoại lệ
        cF(-5);
        cF(100);
    }
}
