package Characters.ClassTypes;
import Characters.ICharacter;
import Items.ItemType.HealingItem;

public interface IHealer extends ICharacter {

    void heal(HealingItem item, ICharacter character);
}
