package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TackleTest {
    Tackle tackle;

    @Before
    public void setUp() {
        tackle = new Tackle();
    }

    @Test
    public void testAttack() {
        assertEquals(tackle.attack(), "Tackle");
    }

    @Test
    public void testAttackDamage() {
        tackle.setAttackDamage(66);
        assertEquals(tackle.getAttackDamage(), 66);
    }
}
