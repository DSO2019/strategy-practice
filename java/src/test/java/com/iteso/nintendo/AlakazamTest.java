package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class AlakazamTest {
    Alakazam alakazam;

    @Before
    public void setUp() {
        alakazam = new Alakazam();
    }

    @Test
    public void testEvolve() {
        assertEquals(alakazam.evolve(), null);
    }

    @Test
    public void testDefend() {
        alakazam.setDefenseMultiplier(.5);
        alakazam.setHitPoints(20);
        alakazam.defend(5);
        assertEquals(alakazam.getHitPoints(), 18, 0);
    }

    @Test
    public void testMainAttack() {
        alakazam.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Scratch causing a damage of 18";
        assertEquals(attack, alakazam.mainAttack());
    }

    @Test
    public void testSecondAttack() {
        alakazam.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Future Sight causing a damage of 22";
        assertEquals(attack, alakazam.secondAttack());
    }

}
