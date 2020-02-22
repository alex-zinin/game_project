package Drawer;

import Game_World.Game_World;
import java.lang.*;

public class Drawer {
    public Drawer(Game_World gm)
    {
        game_world = gm;
    }

    public void Draw()
    {
        final int X_SIZE = 150, Y_SIZE = 40;


        char[][] screen = new char[Y_SIZE][X_SIZE];
        for(int i = 0; i < Y_SIZE; i++)
        {
            for(int j = 0; j < X_SIZE; j++)
            {
                System.out.print(" ");
            }
            System.out.print("\n\r");
        }

        for(int i = 0; i < Y_SIZE; i++)
        {
            for(int j = 0; j < X_SIZE; j++)
            {
                screen[i][j] = '.';
            }
        }
        String str = new String(screen[0]);
        screen[game_world.player.pos_y][game_world.player.pos_x] = '@';

        for(int i = 0; i < Y_SIZE; i++)
        {
            //for(int j = 0; j < X_SIZE; j++)
            //{
                //System.out.print(screen[i][j]);
                System.out.print(str);
            //}
            System.out.print("\n\r");
        }
    }

    Game_World game_world;
}
