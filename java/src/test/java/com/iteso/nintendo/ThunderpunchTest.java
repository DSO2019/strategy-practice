package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ThunderpunchTest {
    Thunderpunch thunderpunch;
    @Before
    public void setUp() {
        thunderpunch = new Thunderpunch();
    }

    @Test
    public void testAttack() {
        assertEquals(thunderpunch.pokeAttack(), "Thunderpunch");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(thunderpunch.Power(), 18);
    }

}