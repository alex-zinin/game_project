package Game_World;

import Entities.*;

import java.util.ArrayList;




public class Game_World {
    public final int Y_WORLD_SIZE = 200,
              X_WORLD_SIZE = 200;
    public ArrayList<Entity> entities = new ArrayList<>();
    ArrayList<Entity> obstacles;


    public Player player;
    public Game_World(int x0, int y0)
    {
//        for(int i = 0; i < Y_WORLD_SIZE; i++)
//        {
//            world[i][0] = '#';
//            world[i][X_WORLD_SIZE - 1] = '#';
//            for(int j = 1; j < X_WORLD_SIZE - 1; j++)
//            {
//                if(i == 0 || i == Y_WORLD_SIZE - 1)
//                    world[i][j] = '#';
//                else
//                    world[i][j] = '.';
//            }
//        }
       player = new Player(x0, y0);
       // entities.add(player);
        for (int y = 0; y < Y_WORLD_SIZE; y++) {
            int x = 0;
            while (x < X_WORLD_SIZE) {
                entities.add(new Wall(x, y));
                x += (y == 0 || y == Y_WORLD_SIZE - 1) ? 1: X_WORLD_SIZE - 1;
            }
        }

        entities.add(new Wolf(10,10));
        entities.add(new Witch(5, 3));
        entities.add(new First_Aid_Kit(20, 20));

    }
}
