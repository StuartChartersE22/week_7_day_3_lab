package Environment;

import Items.ITreasure;
import Items.ItemType.HealingItem;
import Items.ItemType.Spell;
import Items.ItemType.Weapon;

import java.util.ArrayList;

public class Chest {

    private ArrayList<Weapon> weapons;
    private ArrayList<Spell> spells;
    private ArrayList<HealingItem> healingItems;

    public Chest(){
        this.weapons = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.healingItems = new ArrayList<>();
    }

    public void setHealingItems(ArrayList<HealingItem> items) {
        this.healingItems = items;
    }

    public ArrayList<HealingItem> removeHealingItems(){
        ArrayList<HealingItem> removedItems = this.healingItems;
        this.healingItems.clear();
        return removedItems;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public ArrayList<Spell> removeSpells(){
        ArrayList<Spell> removedItems = this.spells;
        this.spells.clear();
        return removedItems;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Weapon> removeWeapons(){
        ArrayList<Weapon> removedItems = this.weapons;
        this.weapons.clear();
        return removedItems;
    }

    public  ArrayList<ITreasure> showContents(){
        ArrayList<ITreasure> contents = new ArrayList<>();
        contents.addAll(weapons);
        contents.addAll(spells);
        contents.addAll(healingItems);
        return contents;
    }

}
