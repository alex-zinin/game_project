package Entities;

public class Wolf extends Enemy {
    public Wolf(Integer x, Integer y, int health0)
    {
        super(10); // wolf damage
        health = health0;
        pos_x = x;
        pos_y = y;
    }
}


