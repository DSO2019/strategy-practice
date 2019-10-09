package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class ImpactruenoBehaviorTest {
    ImpactruenoBehavior impactruenoBehavior;

    @Before
    public void setUp(){
        impactruenoBehavior = new ImpactruenoBehavior();
    }

    /** attack damage test. */
    @Test
    public void getAttackDamageTest() {
        assertEquals(15, impactruenoBehavior.getAttackDamage());
    }

    /** attack name test. */
    @Test
    public void getAttackTest() {
        assertEquals("Impactrueno", impactruenoBehavior.getAttack());
    }

    /** attack test. */
    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Impactrueno causing a damage of 15", impactruenoBehavior.attack());
    }
}
