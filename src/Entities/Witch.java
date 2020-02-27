package Entities;

public class Witch extends Enemy {
    private static final int WITCH_HEALTH = 50; //TWO BILLION
    private static final int WITCH_DAMAGE = 10; //TWO BILLION

    public Witch(int x, int y)
    {
        super(x, y, WITCH_HEALTH, 10); // Witch damage
        type = Entity_Type.WITCH;
    }


}
