package Characters.Instances;

import Characters.ClassTypes.ICaster;
import Items.ItemType.Spell;
import Characters.ICharacter;

import java.util.ArrayList;

public class Wizard extends Characters.Character implements ICaster {

    private int magic;
    private ArrayList<Spell> spells;

    public Wizard(String name, int health, int magic, int wallet){
        super(name, health, wallet);
        this.magic = magic;
        this.spells = new ArrayList<>();
    }

    @Override
    public void cast(Spell spell, ICharacter targetCharacter) {
        targetCharacter.reduceHealth(spell.getDamage());
    }

    @Override
    public int remainingMagic() {
        return this.magic;
    }

    @Override
    public void replenishMagic(int amount) {
        this.magic += amount;
    }

    @Override
    public void learnSpell(Spell spell) {
        this.spells.add(spell);
    }

    @Override
    public ArrayList<Spell> getSpells() {
        return this.spells;
    }
}
