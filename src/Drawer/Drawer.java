package Drawer;

import Entities.Entity;
import Game_World.Game_World;
import java.lang.*;
import Entities.Entity;

public class Drawer {
    public Drawer(Game_World gm) { game_world = gm; }

    public void Draw() {
        final int X_SIZE = 167, Y_SIZE = 39;
        final int INDICATOR_Y_SIZE = Entity_Information_Drawer.ENTITY_LINE_NUMBERS;
        final int DELITER_SIZE  = 1;

        char[][] screen = new char[Y_SIZE][X_SIZE];
        char[][] deliters = new char[DELITER_SIZE][X_SIZE];

        for (int i = 0; i < DELITER_SIZE; ++i) {
            for (int j = 0; j < X_SIZE; ++j) {
                deliters[i][j] = '=';
            }
        }


        for (int i = 0; i < Y_SIZE; ++i) {
            for (int j = 0; j < X_SIZE; ++j) {
                screen[i][j] = ' ';
            }
        }
        System.out.print(Array_to_String(screen));

        for(int i = 0; i < Y_SIZE - 2*INDICATOR_Y_SIZE; i++) {
            for(int j = 0; j < X_SIZE; j++) {
                screen[i][j] = '.';
            }
        }
        System.out.print(Array_to_String(deliters));
        Entity_Information_Drawer.Draw_Entity_Info(game_world.player.Get_Entity_Info());
        System.out.print(Array_to_String(deliters));
        screen[game_world.player.pos_y][game_world.player.pos_x] = '@';

        System.out.print(Array_to_String(screen));
    }

    private StringBuilder Array_to_String(char[][] array) {
        StringBuilder result = new StringBuilder();
        for (char[] chars : array) {
            result.append(chars);
            result.append("\n\r");
        }

        return result;
    }
    Game_World game_world;

    public static class Entity_Information_Drawer
    {
        static void Draw_Entity_Info(Entity.Entity_Information entity_info)
        {
            System.out.print("PLAYER X = ");
            System.out.print(entity_info.x_pos);
            System.out.print(" Y = ");
            System.out.print(entity_info.y_pos);
            System.out.print("\n\rPLAYER HEALTH = ");
            System.out.print(entity_info.health);
            System.out.print("\n\r");
        }

        static int ENTITY_LINE_NUMBERS = 2;
    }
}



