package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class QuickAttackBehaviorTest {
    QuickAttackBehavior quickAttackBehavior;

    @Before
    public void setUp(){
        quickAttackBehavior = new QuickAttackBehavior();
    }

    /** attack damage test. */
    @Test
    public void getAttackDamageTest() {
        assertEquals(5, quickAttackBehavior.getAttackDamage());
    }

    /** attack name test. */
    @Test
    public void getAttackTest() {
        assertEquals("Quick Attack", quickAttackBehavior.getAttack());
    }

    /** attack test. */
    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 5", quickAttackBehavior.attack());
    }
}
