package Entities;

public class Enemy extends Entity {
    Enemy(int x, int y, int health, int dmg)
    {
        super(x, y, health);
        damage = dmg;
    }
    int damage;

}
