package Game_World;

import Entities.Entity;
import Entities.Player;

import java.util.ArrayList;




public class Game_World {
    public final int Y_WORLD_SIZE = 100,
              X_WORLD_SIZE = 100;
    ArrayList<Entity> entities;
    ArrayList<Entity> obstacles;
    public char[][] world = new char[Y_WORLD_SIZE][X_WORLD_SIZE];
    public Player player;
    public Game_World()
    {
        for(int i = 0; i < Y_WORLD_SIZE; i++)
        {
            world[i][0] = '#';
            world[i][X_WORLD_SIZE - 1] = '#';
            for(int j = 1; j < X_WORLD_SIZE - 1; j++)
            {
                if(i == 0 || i == Y_WORLD_SIZE - 1)
                    world[i][j] = '#';
                else
                    world[i][j] = '.';
            }
        }
    }
}
