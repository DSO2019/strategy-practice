package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CosmicPowerBehaviorTest {
    CosmicPowerBehavior cosmicPowerBehavior;

    @Before
    public void setUp(){
        cosmicPowerBehavior = new CosmicPowerBehavior();
    }

    /** attack damage test. */
    @Test
    public void getAttackDamageTest() {
        assertEquals(25, cosmicPowerBehavior.getAttackDamage());
    }

    /** attack name test. */
    @Test
    public void getAttackTest() {
        assertEquals("Cosmic Power", cosmicPowerBehavior.getAttack());
    }

    /** attack test. */
    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Cosmic Power causing a damage of 25", cosmicPowerBehavior.attack());
    }
}
