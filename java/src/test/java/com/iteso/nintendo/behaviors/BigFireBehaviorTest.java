package com.iteso.nintendo.behaviors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class BigFireBehaviorTest {
    BigFireBehavior bigFireBehavior;

    @Before
    public void setUp(){
        bigFireBehavior = new BigFireBehavior();
    }

    /** attack damage test. */
    @Test
    public void getAttackDamageTest() {
        assertEquals(17, bigFireBehavior.getAttackDamage());
    }

    /** attack name test. */
    @Test
    public void getAttackTest() {
        assertEquals("Big Fire", bigFireBehavior.getAttack());
    }

    /** attack test. */
    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 17", bigFireBehavior.attack());
    }
}
