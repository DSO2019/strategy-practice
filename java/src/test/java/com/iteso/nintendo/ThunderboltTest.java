package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThunderboltTest {
    Thunderbolt thunderbolt;

    @Before
    public void setUp() {
        thunderbolt = new Thunderbolt();
    }

    @Test
    public void testAttack() {
        assertEquals(thunderbolt.attack(), "Thunderbolt");
    }

    @Test
    public void testAttackDamage() {
        thunderbolt.setAttackDamage(66);
        assertEquals(thunderbolt.getAttackDamage(), 66);
    }
}
