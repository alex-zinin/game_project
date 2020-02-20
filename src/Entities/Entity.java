package Entities;

import Entity_Handler.Direction;

public class Entity {
    public int pos_x, pos_y;

    public void move(Direction dir){
        switch(dir)
        {
            case RIGHT: pos_x++; break;
            case LEFT: pos_x--; break;
            case UP: pos_y--; break;
            case DOWN: pos_y++; break;
        }
    }

}
