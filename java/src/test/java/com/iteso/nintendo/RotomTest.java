package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by alex_rios on 10/03/2019.
 */
public class RotomTest {
    Rotom rotom;

    @Before
    public void setUp() {
        rotom = new Rotom();
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Surf causing a damage of 80", rotom.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Thunderbolt causing a damage of 90", rotom.secondAttack());
    }
}