package Items;

import Items.Instances.SmallSword;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SmallSwordTest {

    private SmallSword sword;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void setUp() {
        sword = new SmallSword("Choppy", 20, 10);
        properties.put("Weight" , 20);
        properties.put("Damage" , 10);
        properties.put("Number of hands used" , 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Choppy", sword.getName());
    }

    @Test
    public void canGetWeight() {
        assertEquals(20, sword.getWeight());
    }

    @Test
    public void canGetDamage() {
        assertEquals(10, sword.getDamage());
    }

    @Test
    public void canGetNumberOfHandsWieldedWith() {
        assertEquals(1, sword.getHandWield());
    }

    @Test
    public void canInspect() {
        assertEquals(properties, sword.inspect());
    }


}
