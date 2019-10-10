package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirePunchTest {
    FirePunch firepunch;
    @Before
    public void setUp() {
        firepunch = new FirePunch();
    }

    @Test
    public void testAttack() {
        assertEquals(firepunch.getAttackName(), "Firepunch");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(firepunch.getAttackDamage(), 22);
    }

}
