package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ThunderboltTest {
    Thunderbolt thunderbolt;
    @Before
    public void setUp() {
        thunderbolt = new Thunderbolt();
    }

    @Test
    public void testAttack() {
        assertEquals(thunderbolt.getAttackName(), "Thunderbolt");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(thunderbolt.getAttackDamage(), 24);
    }

}
