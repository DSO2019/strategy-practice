package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class ThunderTest{
    Thunder thunder;
    

    @Before
    public void setUp(){
        thunder = new Thunder();
    }

    @Test
    public void testPerformAttack(){
        assertEquals("Thunder", thunder.performAttack());
    }

    @Test
    public void testGetDamage(){
        assertEquals(110, thunder.getDamage());
    }
}