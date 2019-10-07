package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by satanas on 2/24/18.
 */
public class CharmeleonTest {
    Charmeleon charmeleon;

    @Before
    public void setUp() {
        charmeleon = new Charmeleon();
    }

    @Test
    public void testEvolve() {
        assertEquals(charmeleon.evolve(), null);
    }

    @Test
    public void testDefend() {
        charmeleon.setDefenseMultiplier(.5);
        charmeleon.setHitPoints(20);
        charmeleon.defend(5);
        assertEquals(charmeleon.getHitPoints(), 18, 0);
    }

    @Test
    public void testSecondAttack() {
        charmeleon.setHitPoints(20);
        String attack = "Attacking opponent with Hadouken causing a damage of 22";
        assertEquals(attack, charmeleon.secondAttack());
    }

    @Test
    public void testMainAttack() {
        charmeleon.setHitPoints(20);
        String attack = "Attacking opponent with Tackle causing a damage of 6";
        assertEquals(attack, charmeleon.mainAttack());
    }

}
