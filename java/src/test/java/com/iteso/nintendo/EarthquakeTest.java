package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EarthquakeTest {
    Earthquake earthquake;
    @Before
    public void setUp() {
        earthquake = new Earthquake();
    }

    @Test
    public void testAttack() {
        assertEquals(earthquake.getAttackName(), "Earthquake");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(earthquake.getAttackDamage(), 25);
    }

}
