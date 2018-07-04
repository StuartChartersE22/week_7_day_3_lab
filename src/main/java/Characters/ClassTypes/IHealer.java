package Characters.ClassTypes;
import Characters.ICharacter;
import Items.ItemType.HealingItem;

import java.util.ArrayList;

public interface IHealer extends ICharacter {

    void heal(HealingItem item, ICharacter character);
    void pickUpHealingItem(HealingItem item);
    ArrayList<HealingItem> getItems();
}
