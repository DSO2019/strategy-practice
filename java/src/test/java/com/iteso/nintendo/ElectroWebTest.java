package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class ElectroWebTest{
    ElectroWeb electroweb;

    @Before
    public void setUp(){
        electroweb = new ElectroWeb();
    }

    @Test
    public void testPerformAttack(){
        assertEquals("Electroweb", electroweb.performAttack());
    }

    @Test
    public void testGetDamage(){
        assertEquals(55, electroweb.getDamage());
    }
}