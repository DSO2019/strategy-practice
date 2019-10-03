package com.iteso.nintendo;

import com.iteso.nintendo.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;

    @Before
    public void setUp(){
        pikachu = new Pikachu();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Impacthunder causing a damage of 25", pikachu.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Slam causing a damage of 15", pikachu.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 90",pikachu.defend(0));
    }

}
