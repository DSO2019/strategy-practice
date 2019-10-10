package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FutureSightTest {
    FutureSight futureSight;

    @Before
    public void setUp() {
        futureSight = new FutureSight();
    }

    @Test
    public void testAttack() {
        assertEquals(futureSight.getAttackName(), "Ataque Future Sight");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(futureSight.getAttackDamage(), 22);
    }
}