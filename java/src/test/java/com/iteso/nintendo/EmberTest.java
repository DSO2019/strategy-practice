package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmberTest {
    Ember ember;
    @Before
    public void setUp() {
        ember = new Ember();
    }

    @Test
    public void testAttack() {
        assertEquals(ember.pokeAttack(), "Ember");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(ember.Power(), 10);
    }

}