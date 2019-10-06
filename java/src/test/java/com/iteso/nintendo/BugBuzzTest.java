package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class BugBuzzTest{
    BugBuzz bugBuzz;

    @Before
    public void setUp(){
        bugBuzz = new BugBuzz();
    }

    @Test
    public void testPerformAttack(){
        assertEquals("Bug Buzz", bugBuzz.performAttack());
    }

    @Test
    public void testGetDamage(){
        assertEquals(90, bugBuzz.getDamage());
    }
}