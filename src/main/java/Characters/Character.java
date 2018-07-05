package Characters;

public abstract class Character implements ICharacter {

    private int health;
    private boolean enemy;
    private int wallet;
    private String name;

    public Character(String name, int health, boolean enemy, int wallet){
        this.wallet = wallet;
        this.enemy = enemy;
        this.health = health;
        this.name = name;

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
}
