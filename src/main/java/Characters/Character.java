package Characters;

public abstract class Character implements ICharacter {

    private int health;
    private int wallet;
    private String name;
    private int maxHealth;

    public Character(String name, int maxHealth, int wallet){
        this.wallet = wallet;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.name = name;

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void reduceHealth(int damage) {
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
    }

    @Override
    public void heal(int heal) {
        this.health += heal;
        if(this.health > maxHealth){
            this.health = maxHealth;
        }
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

}
