package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScratchTest {
    Scratch scratch;

    @Before
    public void setUp() {
        scratch = new Scratch();
    }

    @Test
    public void testAttack() {
        assertEquals(scratch.getAttackName(), "Ataque Scratch");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(scratch.getAttackDamage(), 18);
    }
}