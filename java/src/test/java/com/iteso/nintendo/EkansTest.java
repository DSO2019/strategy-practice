package com.iteso.nintendo;

import com.iteso.nintendo.pokemon.Ekans;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EkansTest {
    Ekans ekans;

    @Before
    public void setUp(){
        ekans = new Ekans();
    }
    /**
     * Evolve
     */
    @Test
    public void test_evolve(){
        assertEquals(null, ekans.evolve());
    }

    /**
     * Defend
     */
    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96"
                , ekans.defend(10));
    }

    /**
     * secondAttack
     */
    @Test
    public void test_secondAttack(){
        assertEquals("Attacking opponent with Tackle causing a damage of 6"
                , ekans.secondAttack());
    }

    /**
     * mainAttack
     */
    @Test
    public void test_mainAttack(){
        assertEquals("Attacking opponent with QuickAttack causing a damage of 7"
                , ekans.mainAttack());
    }

    /**
     * Name
     */
    @Test
    public void test_name(){
        assertEquals("Ekans"
                , ekans.getName());
    }

    /**
     * Type
     */
    @Test
    public void test_type(){
        assertEquals("poison"
                , ekans.getType());
    }

    /**
     * HasEcolution
     */
    @Test
    public void test_hasEvolution(){
        assertEquals(true
                , ekans.isHasEvolution());
    }

    /**
     * Name MainAttack
     */
    @Test
    public void test_name_mainAttack(){
        assertEquals("QuickAttack"
                , ekans.getMainAttack());
    }

    /**
     * Name SecondAttack
     */
    @Test
    public void test_name_secondAttack(){
        assertEquals("Tackle"
                , ekans.getSecondAttack());
    }

    /**
     * Hit Points
     */
    @Test
    public void test_hitPoitns(){
        assertEquals(100
                , ekans.getHitPoints());
    }
}
