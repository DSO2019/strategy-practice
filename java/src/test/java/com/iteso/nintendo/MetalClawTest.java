package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MetalClawTest {
    MetalClaw metalclaw;
    @Before
    public void setUp() {
        metalclaw = new MetalClaw();
    }

    @Test
    public void testAttack() {
        assertEquals(metalclaw.pokeAttack(), "MetalClaw");
    }

    @Test
    public void testAttackDamage() {
        assertEquals(metalclaw.Power(), 12);
    }

}