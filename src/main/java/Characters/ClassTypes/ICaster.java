package Characters.ClassTypes;
import Characters.ICharacter;
import Items.ItemType.Spell;

import java.util.ArrayList;

public interface ICaster extends ICharacter {

    void cast(Spell spell, ICharacter targetCharacter);
    int remainingMagic();
    void replenishMagic(int amount);
    ArrayList<Spell> getSpells();
    void learnSpell(Spell spell);
}
