package com.iteso.nintendo.characters;

import com.iteso.nintendo.characters.Ivysaur;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Isaac Cabrera on 2/24/18.
 */
public class IvysaurTest {

    Ivysaur ivysaur;
    
    @Before
    public void setUp() {
        ivysaur = new Ivysaur();
    }

    /** Main attack test. */
    @Test
    public void maintAttackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 7", ivysaur.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 13", ivysaur.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 77", ivysaur.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Ivysaur", ivysaur.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, ivysaur.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("veneno", ivysaur.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, ivysaur.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(7, ivysaur.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(13, ivysaur.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, ivysaur.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, ivysaur.getDefenseMultiplier(), 0.0);
    }
}
