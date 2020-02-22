package Drawer;

import Game_World.Game_World;
import java.lang.*;

public class Drawer {
    public Drawer(Game_World gm) {
        game_world = gm;
    }

    public void Draw() {
        final int X_SIZE = 167, Y_SIZE = 39;

        char[][] screen = new char[Y_SIZE][X_SIZE];

        for (int i = 0; i < Y_SIZE; ++i) {
            for (int j = 0; j < X_SIZE; ++j) {
                screen[i][j] = ' ';
            }
        }
        System.out.print(Array_to_String(screen));

        for(int i = 0; i < Y_SIZE; i++) {
            for(int j = 0; j < X_SIZE; j++) {
                screen[i][j] = '.';
            }
        }
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
}
