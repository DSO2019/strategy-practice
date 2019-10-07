package com.iteso.nintendo;

import com.iteso.nintendo.pokemon.Kadabra;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KadabraTest {
    Kadabra kadabra;

    @Before
    public void setUp(){
        kadabra = new Kadabra();
    }
    /**
     * Evolve
     */
    @Test
    public void test_evolve(){
        assertEquals(null, kadabra.evolve());
    }

    /**
     * Defend
     */
    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96"
                , kadabra.defend(10));
    }

    /**
     * secondAttack
     */
    @Test
    public void test_secondAttack(){
        assertEquals("Attacking opponent with Tackle causing a damage of 6"
                , kadabra.secondAttack());
    }

    /**
     * mainAttack
     */
    @Test
    public void test_mainAttack(){
        assertEquals("Attacking opponent with Firepunch causing a damage of 8"
                , kadabra.mainAttack());
    }

    /**
     * Name
     */
    @Test
    public void test_name(){
        assertEquals("Kadabra"
                , kadabra.getName());
    }

    /**
     * Type
     */
    @Test
    public void test_type(){
        assertEquals("psytic"
                , kadabra.getType());
    }

    /**
     * HasEcolution
     */
    @Test
    public void test_hasEvolution(){
        assertEquals(true
                , kadabra.isHasEvolution());
    }

    /**
     * Name MainAttack
     */
    @Test
    public void test_name_mainAttack(){
        assertEquals("Firepunch"
                , kadabra.getMainAttack());
    }

    /**
     * Name SecondAttack
     */
    @Test
    public void test_name_secondAttack(){
        assertEquals("Tackle"
                , kadabra.getSecondAttack());
    }

    /**
     * Hit Points
     */
    @Test
    public void test_hitPoitns(){
        assertEquals(100
                , kadabra.getHitPoints());
    }
}
