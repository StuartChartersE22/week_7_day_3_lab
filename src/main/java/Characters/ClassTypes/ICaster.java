package Characters.ClassTypes;
import Characters.ICharacter;
import Items.ItemType.Spell;

public interface ICaster extends ICharacter {

    void cast(Spell spell, ICharacter targetCharacter);
    int remainingMagic();
    void replenishMagic(int amount);

}
