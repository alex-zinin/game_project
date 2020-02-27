package Entities;

public class Wolf extends Enemy {
    private static final int WOLF_HEALTH = 10; //TWO BILLION
    private static final int WOLF_DAMAGE = 20; //TWO BILLION

    public Wolf(Integer x, Integer y)
    {
        super(x, y,WOLF_HEALTH, WOLF_DAMAGE); // wolf damage
        type = Entity_Type.WOLF;
    }
}


