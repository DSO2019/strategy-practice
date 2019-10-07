package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by satanas on 2/24/18.
 */
public class CharmanderTest {
    Charmander charmander;

    @Before
    public void setUp() {
        charmander = new Charmander();
    }

    @Test
    public void testEvolve() {
        assertEquals(charmander.evolve(), null);
    }

    @Test
    public void testDefend() {
        charmander.setDefenseMultiplier(.5);
        charmander.setHitPoints(20);
        charmander.defend(5);
        assertEquals(charmander.getHitPoints(), 18, 0);
    }

    @Test
    public void testSecondAttack() {
        charmander.setHitPoints(20);
        String attack = "Attacking opponent with Rasengan causing a damage of 17";
        assertEquals(attack, charmander.secondAttack());
    }

    @Test
    public void testMainAttack() {
        charmander.setHitPoints(20);
        String attack = "Attacking opponent with Tackle causing a damage of 3";
        assertEquals(attack, charmander.mainAttack());
    }

}
