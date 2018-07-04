package Characters;

public interface ICharacter {

    int getHealth();
    void reduceHealth(int damage);
    void increaseHealth(int heal);
    boolean isEnemy();
    int getWallet();
    void pay(int cost);
    void receiveMoney(int amount);
    String getName();


}
