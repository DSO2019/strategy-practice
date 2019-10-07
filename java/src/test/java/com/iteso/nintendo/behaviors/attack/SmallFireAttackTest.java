package com.iteso.nintendo.behaviors.attack;

import com.iteso.nintendo.behaviors.attack.SmallFireAttack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallFireAttackTest {

    private SmallFireAttack smallFire;

    @Before
    public void setUp() {
        smallFire =  new SmallFireAttack();
    }

    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 7",
                     smallFire.attack());
    }

        @Test
    public void getAttackNameTest() {
        assertEquals("Small Fire", smallFire.getAttackName());
    }

        @Test
    public void getAttackDamageTest() {
        assertEquals(7, smallFire.getAttackDamage());
    }
}