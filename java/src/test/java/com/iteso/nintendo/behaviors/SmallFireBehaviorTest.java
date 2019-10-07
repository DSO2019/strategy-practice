package com.iteso.nintendo.behaviors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class SmallFireBehaviorTest {
    SmallFireBehavior smallFireBehavior;

    @Before
    public void setUp(){
        smallFireBehavior = new SmallFireBehavior();
    }

    /** attack damage test. */
    @Test
    public void getAttackDamageTest() {
        assertEquals(3, smallFireBehavior.getAttackDamage());
    }

    /** attack name test. */
    @Test
    public void getAttackTest() {
        assertEquals("Small Fire", smallFireBehavior.getAttack());
    }

    /** attack test. */
    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 3", smallFireBehavior.attack());
    }
}
