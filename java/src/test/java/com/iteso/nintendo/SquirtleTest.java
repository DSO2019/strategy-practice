package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class SquirtleTest {
    Squirtle squirtle;

    @Before
    public void setUp() {
        squirtle = new Squirtle();
    }

    @Test
    public void testEvolve() {
        assertEquals(squirtle.evolve(), null);
    }

    @Test
    public void testDefend() {
        squirtle.setDefenseMultiplier(.5);
        squirtle.setHitPoints(20);
        squirtle.defend(5);
        assertEquals(squirtle.getHitPoints(), 18, 0);
    }

    @Test
    public void testMainAttack() {
        squirtle.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Water Gun causing a damage of 25";
        assertEquals(attack, squirtle.mainAttack());
    }

    @Test
    public void testSecondAttack() {
        squirtle.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Surf causing a damage of 10";
        assertEquals(attack, squirtle.secondAttack());
    }
}