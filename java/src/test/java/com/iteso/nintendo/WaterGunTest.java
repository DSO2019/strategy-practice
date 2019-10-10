package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterGunTest {
    WaterGun waterGun;

    @Before
    public void setUp() {
        waterGun = new WaterGun();
    }

    @Test
    public void testAttack() {
        assertEquals(waterGun.getAttackName(), "Ataque Water Gun");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(waterGun.getAttackDamage(), 25);
    }
}