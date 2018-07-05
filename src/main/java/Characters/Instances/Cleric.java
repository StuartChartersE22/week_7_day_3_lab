package Characters.Instances;

import Characters.ClassTypes.IHealer;
import Characters.ICharacter;
import Items.ItemType.HealingItem;

import java.util.ArrayList;

public class Cleric extends Characters.Character implements IHealer {

    private ArrayList<HealingItem> items;

    public Cleric(String name, int health, boolean enemy, int wallet){
        super(name, health, enemy, wallet);
        this.items = new ArrayList<>();
    }

    @Override
    public void heal(HealingItem item, ICharacter character) {
        character.increaseHealth(item.getHealingPower());
        items.remove(item);
    }

    @Override
    public void pickUpHealingItem(HealingItem item) {
        this.items.add(item);
    }

    @Override
    public ArrayList<HealingItem> getItems(){
        return this.items;
    }
}
