package Entities;

public class Player extends Entity {
    private static final int PLAYER_HEALTH = 100; //TWO BILLION

    public Player(Integer x, Integer y)
    {
        super(x, y, PLAYER_HEALTH);
        type = Entity_Type.PLAYER;
    }

    // return private information about player
    public Entity_Information Get_Info()
    {
        return new Entity_Information(pos_x, pos_y, health);
    }
}

