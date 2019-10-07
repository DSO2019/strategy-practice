package com.iteso.nintendo;

import com.iteso.nintendo.pokemon.Charmander;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharmanderTest
{
    Charmander charmander;

    @Before
    public void setUp(){
        charmander = new Charmander();
    }
    /**
     * Evolve
     */
    @Test
    public void test_evolve(){
        assertEquals(null, charmander.evolve());
    }

    /**
     * Defend
     */
    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96"
                , charmander.defend(10));
    }

    /**
     * secondAttack
     */
    @Test
    public void test_secondAttack(){
        assertEquals("Attacking opponent with Tackle causing a damage of 6"
                , charmander.secondAttack());
    }

    /**
     * mainAttack
     */
    @Test
    public void test_mainAttack(){
        assertEquals("Attacking opponent with Firepunch causing a damage of 8"
                , charmander.mainAttack());
    }

    /**
     * Name
     */
    @Test
    public void test_name(){
        assertEquals("Charmander"
                , charmander.getName());
    }

    /**
     * Type
     */
    @Test
    public void test_type(){
        assertEquals("fire"
                , charmander.getType());
    }

    /**
     * HasEcolution
     */
    @Test
    public void test_hasEvolution(){
        assertEquals(true
                , charmander.isHasEvolution());
    }

    /**
     * Name MainAttack
     */
    @Test
    public void test_name_mainAttack(){
        assertEquals("Firepunch"
                , charmander.getMainAttack());
    }

    /**
     * Name SecondAttack
     */
    @Test
    public void test_name_secondAttack(){
        assertEquals("Tackle"
                , charmander.getSecondAttack());
    }

    /**
     * Hit Points
     */
    @Test
    public void test_hitPoitns(){
        assertEquals(100
                , charmander.getHitPoints());
    }
}
