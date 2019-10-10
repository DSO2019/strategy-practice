package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PsychicTest {
    Psychic psychic;
    @Before
    public void setUp() {
        psychic = new Psychic();
    }

    @Test
    public void testAttack() {
        assertEquals(psychic.pokeAttack(), "Psychic");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(psychic.Power(), 20);
    }

}