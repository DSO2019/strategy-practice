package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class MetalClawTest{
    MetalClaw metalClaw;

    @Before
    public void setUp(){
        metalClaw = new MetalClaw();
    }

    @Test
    public void testPerformAttack(){
        assertEquals("Metal Claw", metalClaw.performAttack());
    }

    @Test
    public void testGetDamage(){
        assertEquals(50, metalClaw.getDamage());
    }
}