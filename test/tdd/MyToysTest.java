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
    public void testSuccessfulLower10Cases() {
        assertEquals(10, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    @Test
    public void testSuccessfulGreater10Cases() {
        assertEquals(3_628_800, cF(10));
        assertEquals(39_916_800, cF(11));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExeptionNegagtiveCases() {
        //ko có value để assert do hàm cF() ném ra ngoại lệ
        cF(-5);
        cF(-100);
        cF(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExeptionUpperBoundCases() {
        //ko có value để assert do hàm cF() ném ra ngoại lệ
        cF(16);
        cF(100);
    }
}
