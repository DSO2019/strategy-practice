package com.iteso.nintendo.behaviors.attack;

import com.iteso.nintendo.behaviors.attack.AquaJetAttack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AquaJetAttackTest {

    private AquaJetAttack aquaJet;

    @Before
    public void setUp() {
        aquaJet =  new AquaJetAttack();
    }

    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Aqua Jet causing a damage of 18",
                     aquaJet.attack());
    }

        @Test
    public void getAttackNameTest() {
        assertEquals("Aqua Jet", aquaJet.getAttackName());
    }

        @Test
    public void getAttackDamageTest() {
        assertEquals(18, aquaJet.getAttackDamage());
    }
}
