package com.iteso.nintendo;

import com.iteso.nintendo.pokemon.Squirtle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquirtleTest {
    Squirtle squirtle;

    @Before
    public void setUp(){
        squirtle = new Squirtle();
    }
    /**
     * Evolve
     */
    @Test
    public void test_evolve(){
        assertEquals(null, squirtle.evolve());
    }

    /**
     * Defend
     */
    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96"
                , squirtle.defend(10));
    }

    /**
     * secondAttack
     */
    @Test
    public void test_secondAttack(){
        assertEquals("Attacking opponent with Tackle causing a damage of 6"
                , squirtle.secondAttack());
    }

    /**
     * mainAttack
     */
    @Test
    public void test_mainAttack(){
        assertEquals("Attacking opponent with Splash causing a damage of 6"
                , squirtle.mainAttack());
    }

    /**
     * Name
     */
    @Test
    public void test_name(){
        assertEquals("Squirtle"
                , squirtle.getName());
    }

    /**
     * Type
     */
    @Test
    public void test_type(){
        assertEquals("water"
                , squirtle.getType());
    }

    /**
     * HasEcolution
     */
    @Test
    public void test_hasEvolution(){
        assertEquals(true
                , squirtle.isHasEvolution());
    }

    /**
     * Name MainAttack
     */
    @Test
    public void test_name_mainAttack(){
        assertEquals("Splash"
                , squirtle.getMainAttack());
    }

    /**
     * Name SecondAttack
     */
    @Test
    public void test_name_secondAttack(){
        assertEquals("Tackle"
                , squirtle.getSecondAttack());
    }

    /**
     * Hit Points
     */
    @Test
    public void test_hitPoitns(){
        assertEquals(100
                , squirtle.getHitPoints());
    }
}
