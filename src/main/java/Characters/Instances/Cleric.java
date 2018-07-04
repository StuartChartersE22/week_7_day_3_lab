package Characters.Instances;

import Characters.ClassTypes.IHealer;
import Characters.ICharacter;
import Items.ItemType.HealingItem;

import java.util.ArrayList;

public class Cleric implements IHealer {

    private int health;
    int magic;
    boolean enemy;
    ArrayList<HealingItem> items;
    int wallet;
    String name;

    public Cleric(String name, int health, boolean enemy, int wallet){
        this.wallet = wallet;
        this.enemy = enemy;
        this.health = health;
        this.items = new ArrayList<>();
        this.name = name;
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
        return false;
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

    public ArrayList<HealingItem> getItems(){
        return this.items;
    }
}
