package com.iteso.nintendo;
import com.iteso.nintendo.Raichu;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class RaichuTest {
    Raichu raichu;

    @Before
    public void setUp(){
        raichu = new Raichu();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Impacthunder causing a damage of 25", raichu.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Slam causing a damage of 15", raichu.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 100",raichu.defend(0));
    }

}
