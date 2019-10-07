package com.iteso.nintendo;

import com.iteso.nintendo.pokemon.Diglett;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiglettTest {
    Diglett diglett;

    @Before
    public void setUp(){
        diglett = new Diglett();
    }
    /**
     * Evolve
     */
    @Test
    public void test_evolve(){
        assertEquals(null, diglett.evolve());
    }

    /**
     * Defend
     */
    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96"
                , diglett.defend(10));
    }

    /**
     * secondAttack
     */
    @Test
    public void test_secondAttack(){
        assertEquals("Attacking opponent with Tackle causing a damage of 6"
                , diglett.secondAttack());
    }

    /**
     * mainAttack
     */
    @Test
    public void test_mainAttack(){
        assertEquals("Attacking opponent with QuickAttack causing a damage of 7"
                , diglett.mainAttack());
    }

    /**
     * Name
     */
    @Test
    public void test_name(){
        assertEquals("Diglett"
                , diglett.getName());
    }

    /**
     * Type
     */
    @Test
    public void test_type(){
        assertEquals("rock"
                , diglett.getType());
    }

    /**
     * HasEcolution
     */
    @Test
    public void test_hasEvolution(){
        assertEquals(true
                , diglett.isHasEvolution());
    }

    /**
     * Name MainAttack
     */
    @Test
    public void test_name_mainAttack(){
        assertEquals("QuickAttack"
                , diglett.getMainAttack());
    }

    /**
     * Name SecondAttack
     */
    @Test
    public void test_name_secondAttack(){
        assertEquals("Tackle"
                , diglett.getSecondAttack());
    }

    /**
     * Hit Points
     */
    @Test
    public void test_hitPoitns(){
        assertEquals(100
                , diglett.getHitPoints());
    }
}
