package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SleepTest {
    Sleep sleep;
    @Before
    public void setUp() {
        sleep = new Sleep();
    }

    @Test
    public void testAttack() {
        assertEquals(sleep.getAttackName(), "Sleep");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(sleep.getAttackDamage(), 0);
    }

}
