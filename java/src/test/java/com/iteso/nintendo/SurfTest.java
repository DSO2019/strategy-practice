package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SurfTest {
    Surf surf;

    @Before
    public void setUp() {
        surf = new Surf();
    }

    @Test
    public void testAttack() {
        assertEquals(surf.getAttackName(), "Ataque Surf");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(surf.getAttackDamage(), 10);
    }
}