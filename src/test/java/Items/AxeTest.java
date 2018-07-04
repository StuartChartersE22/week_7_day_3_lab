package Items;

import Items.Instances.Axe;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class AxeTest {

    private Axe axe;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void setUp() {
        axe = new Axe("Choppy", 20, 10);
        properties.put("Weight" , 20);
        properties.put("Damage" , 10);
        properties.put("Number of hands used" , 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Choppy", axe.getName());
    }

    @Test
    public void canGetWeight() {
        assertEquals(20, axe.getWeight());
    }

    @Test
    public void canGetDamage() {
        assertEquals(10, axe.getDamage());
    }

    @Test
    public void canGetNumberOfHandsWieldedWith() {
        assertEquals(2, axe.getHandWield());
    }

    @Test
    public void canInspect() {
        assertEquals(properties, axe.inspect());
    }


}