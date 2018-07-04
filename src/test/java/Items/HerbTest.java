package Items;

import Items.Instances.HealingItems.Herb;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    private Herb herb;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void before(){
        herb = new Herb("Herb", 8, 6);
        properties.put("Healing power" , 8);
        properties.put("Cost" , 6);
    }

    @Test
    public void canGetName(){
        assertEquals("Herb", herb.getName());
    }

    @Test
    public void canGetHealingPower(){
        assertEquals(8, herb.getHealingPower());
    }

    @Test
    public void canGetCost(){
        assertEquals(6, herb.getCost());
    }

    @Test
    public void canInspect() {
        assertEquals(properties, herb.inspect());
    }

}

