package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class MoonblastTest{
    Moonblast moonblast;

    @Before
    public void setUp(){
        moonblast = new Moonblast();
    }

    @Test
    public void testPerformAttack(){
        assertEquals("Moon blast", moonblast.performAttack());
    }

    @Test
    public void testGetDamage(){
        assertEquals(95, moonblast.getDamage());
    }
}