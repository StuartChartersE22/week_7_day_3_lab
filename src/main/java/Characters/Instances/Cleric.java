package Characters.Instances;

import Characters.ClassTypes.IHealer;
import Characters.ICharacter;
import Items.ItemType.HealingItem;

import java.util.ArrayList;

public class Cleric extends Characters.Character implements IHealer {

    private ArrayList<HealingItem> items;

    public Cleric(String name, int health, int wallet){
        super(name, health, wallet);
        this.items = new ArrayList<>();
    }

    public void healCharacter(HealingItem item, ICharacter character) {
        character.heal(item.getHealingPower());
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
