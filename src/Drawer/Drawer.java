package Drawer;

import Entities.Entity;
import Entities.Player;
import Entities.Witch;
import Entities.*;
import Game_World.Game_World;
import java.lang.*;
import java.util.HashMap;


public class Drawer {
    HashMap<Entity.Entity_Type, Character> entities_textures = new HashMap<>();
    public char[][] world;

    public Drawer(Game_World gm) {
        game_world = gm;
        entities_textures.put(Entity.Entity_Type.PLAYER, '@');
        entities_textures.put(Entity.Entity_Type.WOLF, '*');
        entities_textures.put(Entity.Entity_Type.WITCH, '&');
        entities_textures.put(Entity.Entity_Type.WALL, '#');
        entities_textures.put(Entity.Entity_Type.KIT, 'K');
        world = new char[gm.Y_WORLD_SIZE][gm.X_WORLD_SIZE];
        for(int i =0; i < gm.Y_WORLD_SIZE; i++)
        {
            for(int j = 0; j < gm.X_WORLD_SIZE; j++)
            {
                world[i][j] = ' ';
            }
        }

        for(var fu: game_world.entities)
        {
            world[fu.pos_y][fu.pos_x] = entities_textures.get(fu.type);
        }



//        for(int i = 0; i < gm.Y_WORLD_SIZE; i++)
//        {
//            world[i][0] = '#';
//            world[i][gm.X_WORLD_SIZE - 1] = '#';
//            for(int j = 1; j < gm.X_WORLD_SIZE - 1; j++)
//            {
//                if(i == 0 || i == gm.Y_WORLD_SIZE - 1)
//                    world[i][j] = '#';
//                else
//                    world[i][j] = '.';
//            }
//        }
    }

    public void Draw() {
        final int SCREEN_X_SIZE = 168, SCREEN_Y_SIZE = 40;
        final int INDICATOR_Y_SIZE = Entity_Information_Drawer.ENTITY_LINE_NUMBERS;
        final int DELITER_SIZE  = 1;
        int screen_x_position = game_world.player.pos_x; // center of screen position
        int screen_y_position = game_world.player.pos_y;//           relatively of  game world

        world[screen_y_position][screen_x_position] = entities_textures.get(Entity.Entity_Type.PLAYER);

        char[][] screen = new char[SCREEN_Y_SIZE][SCREEN_X_SIZE];
        char[][] deliters = new char[DELITER_SIZE][SCREEN_X_SIZE];

        for (int i = 0; i < DELITER_SIZE; ++i) {
            for (int j = 0; j < SCREEN_X_SIZE; ++j) {
                deliters[i][j] = '=';
            }
        }


        for (int i = 0; i < SCREEN_Y_SIZE; ++i) {
            for (int j = 0; j < SCREEN_X_SIZE; ++j) {
                screen[i][j] = ' ';
            }
        }
        System.out.print(Array_to_String(screen));







        for(int i = 0; i < SCREEN_Y_SIZE - 2*INDICATOR_Y_SIZE; i++) {
            for(int j = 0; j < SCREEN_X_SIZE; j++) {
                if((i + screen_y_position - SCREEN_Y_SIZE/2) < game_world.Y_WORLD_SIZE &&
                        (i + screen_y_position - SCREEN_Y_SIZE/2) >= 0 &&
                        (j + screen_x_position - SCREEN_X_SIZE/2) < game_world.X_WORLD_SIZE &&
                        (j + screen_x_position - SCREEN_X_SIZE/2) >= 0)
                screen[i][j] =
                        world[i + screen_y_position - SCREEN_Y_SIZE/2]
                                [j + screen_x_position - SCREEN_X_SIZE/2];
                else screen[i][j] = '!';
            }
        }

        System.out.print(Array_to_String(deliters));
        Entity_Information_Drawer.Draw_Entity_Info(game_world.player.Get_Entity_Info());
        System.out.print(Array_to_String(deliters));
       // screen[SCREEN_Y_SIZE /2][SCREEN_X_SIZE /2] = '@';

        System.out.print(Array_to_String(screen));
        world[screen_y_position][screen_x_position] = ' ';
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
            StringBuilder str = new StringBuilder("PLAYER X = " + entity_info.x_pos + " Y = " +
                    entity_info.y_pos + "\n\rPLAYER HEALTH = " + entity_info.health + "\n\r");
            System.out.print(str);
        }

        static int ENTITY_LINE_NUMBERS = 2;
    }
}



