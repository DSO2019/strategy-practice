package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlamethrowerTest {
    Flamethrower flamethrower;
    @Before
    public void setUp() {
        flamethrower = new Flamethrower();
    }

    @Test
    public void testAttack() {
        assertEquals(flamethrower.pokeAttack(), "Flamethrower");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(flamethrower.Power(), 15);
    }

}