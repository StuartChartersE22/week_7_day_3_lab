package Items.Instances;

import Items.ITreasure;

import java.util.HashMap;

public class MoneyBag implements ITreasure {

    private int value;

    public MoneyBag(int value){
        this.value = value;
    }

    @Override
    public HashMap<String, Integer> inspect() {
        HashMap<String, Integer> properties = new HashMap<>();
        properties.put("Value" , this.value);
        return properties;
    }

    public int getValue() {
        return this.value;
    }
}
