package Entities;


import Entity_Handler.Direction;


class Point{
    Point(int x0, int y0)
    {
        x = x0;
        y = y0;
    }

    int x;
    int y;
}

public class Entity {
    public int pos_x, pos_y;
    public int health = 0;

    public void move(Direction dir){
        switch(dir)
        {
            case RIGHT: pos_x++; break;
            case LEFT: pos_x--; break;
            case UP: pos_y--; break;
            case DOWN: pos_y++; break;
        }
    }

    Point GetPos()
    {
        return new Point(pos_x, pos_y);
    }

    int GetHealth()
    {
        return health;
    }


}
