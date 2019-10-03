package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class JolteonTest {
    Jolteon jolteon;

    @Before
    public void setUp() {
        jolteon = new Jolteon();
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Thunderbolt causing a damage of 90", jolteon.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Psychic causing a damage of 80", jolteon.secondAttack());
    }
}