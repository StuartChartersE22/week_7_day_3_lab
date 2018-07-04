package Items;

import Items.Instances.LongSword;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LongSwordTest {

    private LongSword longSword;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void setUp() {
        longSword = new LongSword("Choppy", 20, 8);
        properties.put("Weight" , 20);
        properties.put("Damage" , 8);
        properties.put("Number of hands used" , 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Choppy", longSword.getName());
    }

    @Test
    public void canGetWeight() {
        assertEquals(20, longSword.getWeight());
    }

    @Test
    public void canGetDamage() {
        assertEquals(8, longSword.getDamage());
    }

    @Test
    public void canGetNumberOfHandsWieldedWith() {
        assertEquals(2, longSword.getHandWield());
    }

    @Test
    public void canInspect() {
        assertEquals(properties, longSword.inspect());
    }


}
