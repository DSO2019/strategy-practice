package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceBeamTest {
    IceBeam icebeam;
    @Before
    public void setUp() {
        icebeam = new IceBeam();
    }

    @Test
    public void testAttack() {
        assertEquals(icebeam.getAttackName(), "Ice Beam");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(icebeam.getAttackDamage(), 18);
    }

}
