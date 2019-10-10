package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VoltTackleTest {
    VoltTackle voltTackle;

    @Before
    public void setUp() {
        voltTackle = new VoltTackle();
    }

    @Test
    public void testAttack() {
        assertEquals(voltTackle.getAttackName(), "Ataque VoltTackle");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(voltTackle.getAttackDamage(), 23);
    }
}