package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenkidamaTest {
    Genkidama genkidama;

    @Before
    public void setUp() {
        genkidama = new Genkidama();
    }

    @Test
    public void testAttack() {
        assertEquals(genkidama.attack(), "Genkidama");
    }

    @Test
    public void testAttackDamage() {
        genkidama.setAttackDamage(66);
        assertEquals(genkidama.getAttackDamage(), 66);
    }
}
