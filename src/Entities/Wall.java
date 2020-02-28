package Entities;

public class Wall extends Entity{
    public static final int WALL_HEALTH = 200000;
    public Wall(int x, int y) {
        super(x, y, WALL_HEALTH);
        this.has_collisions = true;
        type = Entity_Type.WALL;
    }
}
