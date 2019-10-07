package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RasenganTest {
    Rasengan rasengan;

    @Before
    public void setUp() {
        rasengan = new Rasengan();
    }

    @Test
    public void testAttack() {
        assertEquals(rasengan.attack(), "rasengan");
    }

    @Test
    public void testAttackDamage() {
        rasengan.setAttackDamage(66);
        assertEquals(rasengan.getAttackDamage(), 66);
    }
}
