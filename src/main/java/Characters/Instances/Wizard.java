package Characters.Instances;

import Characters.ClassTypes.ICaster;
import Items.ItemType.Spell;
import Characters.ICharacter;

import java.util.ArrayList;

public class Wizard implements ICaster {

    private int health;
    private int magic;
    private boolean enemy;
    private ArrayList<Spell> spells;
    private int wallet;
    private String name;

    public Wizard(String name, int health, int magic, boolean enemy, int wallet){
        this.wallet = wallet;
        this.magic = magic;
        this.enemy = enemy;
        this.health = health;
        this.spells = new ArrayList<>();
        this.name = name;
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
    public int getHealth() {
        return this.health;
    }

    @Override
    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    @Override
    public void increaseHealth(int heal) {
        this.health += heal;
    }

    @Override
    public boolean isEnemy() {
        return this.enemy;
    }

    @Override
    public int getWallet() {
        return this.wallet;
    }

    @Override
    public void pay(int cost) {
        this.wallet -= cost;
    }

    @Override
    public void receiveMoney(int amount) {
        this.wallet += amount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Spell> getSpells() {
        return this.spells;
    }
}
