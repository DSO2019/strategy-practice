package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class EmberTest{
    Ember ember;

    @Before
    public void setUp(){
        ember = new Ember();
    }

    @Test
    public void testPerformAttack(){
        assertEquals("Ember", ember.performAttack());
    }

    @Test
    public void testGetDamage(){
        assertEquals(40, ember.getDamage());
    }
}