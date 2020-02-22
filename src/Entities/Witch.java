package Entities;

public class Witch extends Enemy {
    Witch(int x, int y, int health0)
    {
        super(50); // Witch damage
        health = health0;
        pos_x = x;
        pos_y = y;
    }


}
