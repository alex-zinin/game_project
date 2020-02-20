package Drawer;

import Game_World.Game_World;

public class Drawer {
    public Drawer(Game_World gm)
    {
        game_world = gm;
    }

    public void Draw()
    {
        char[][] screen = new char[30][100];
        for(int i = 0; i < 30; i++)
        {
            for(int j = 0; j < 50; j++)
            {
                screen[i][j] = '.';
            }
        }

        screen[game_world.player.pos_y][game_world.player.pos_x] = '@';

        for(int i = 0; i < 30; i++)
        {
            for(int j = 0; j < 50; j++)
            {
                System.out.print(screen[i][j]);
            }
            System.out.print("\n\r");
        }
    }

    Game_World game_world;
}
