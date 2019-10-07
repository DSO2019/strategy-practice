package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by satanas on 2/24/18.
 */
public class CharizardTest {
    Charizard charizard;

    @Before
    public void setUp() {
        charizard = new Charizard();
    }

    @Test
    public void testEvolve() {
        assertEquals(charizard.evolve(), null);
    }

    @Test
    public void testDefend() {
        charizard.setDefenseMultiplier(.5);
        charizard.setHitPoints(20);
        charizard.defend(5);
        assertEquals(charizard.getHitPoints(), 18, 0);
    }

    @Test
    public void testSecondAttack() {
        charizard.setHitPoints(20);
        String attack = "Attacking opponent with Hadouken causing a damage of 22";
        assertEquals(attack, charizard.secondAttack());
    }

    @Test
    public void testMainAttack() {
        charizard.setHitPoints(20);
        String attack = "Attacking opponent with Tackle causing a damage of 6";
        assertEquals(attack, charizard.mainAttack());
    }

}
