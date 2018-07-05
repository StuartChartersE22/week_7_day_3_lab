package Environment;

import Items.ITreasure;
import Items.Instances.MoneyBag;
import Items.Instances.Weapons.Axe;
import Items.ItemType.HealingItem;
import Items.ItemType.Spell;
import Items.ItemType.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class Chest {

    private ArrayList<Weapon> weapons;
    private ArrayList<Spell> spells;
    private ArrayList<HealingItem> healingItems;
    private ArrayList<MoneyBag> moneyBags;

    public Chest(){
        this.weapons = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.healingItems = new ArrayList<>();
        this.moneyBags = new ArrayList<>();
    }

    public void setHealingItems(ArrayList<HealingItem> items) {
        this.healingItems = items;
    }

    public ArrayList<HealingItem> removeHealingItems(){
        ArrayList<HealingItem> removedItems = new ArrayList<>();
        removedItems.addAll(this.healingItems);
        this.healingItems.clear();
        return removedItems;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public ArrayList<Spell> removeSpells(){
        ArrayList<Spell> removedItems = new ArrayList<>();
        removedItems.addAll(this.spells);
        this.spells.clear();
        return removedItems;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Weapon> removeWeapons(){
        ArrayList<Weapon> removedItems = new ArrayList<>();
        removedItems.addAll(this.weapons);
        this.weapons.clear();
        return removedItems;
    }

    public  ArrayList<ITreasure> showContents(){
        ArrayList<ITreasure> contents = new ArrayList<>();
        contents.addAll(weapons);
        contents.addAll(spells);
        contents.addAll(healingItems);
        contents.addAll(moneyBags);
        return contents;
    }

    public HashMap<String,Integer> inspectItem(ITreasure item) {
        return item.inspect();
    }

    public <I extends ITreasure> I removeItem(I item){
        if(!showContents().contains(item)){return null;}
        if(this.weapons.contains(item)){weapons.remove(item);}
        if(this.spells.contains(item)){spells.remove(item);}
        if(this.healingItems.contains(item)){healingItems.remove(item);}
        if(this.moneyBags.contains(item)){moneyBags.remove(item);}
        return item;
    }
}
