import java.io.IOException;
import java.util.*;

import Drawer.Drawer;
import Entities.Player;
import Entity_Handler.Direction;
import Entity_Handler.Entity_Handler;
import Game_World.Game_World;
import Input_Handler.*;
import java.lang.Runtime;




public class Main {


    public static void main(String[] args) throws IOException {
        String[] cmd = {"/bin/sh", "-c", "stty raw </dev/tty\n\n" +
                "\n" +
                "stty_orig=`stty -g`\n" +
                "stty -echo\n" +
                "echo 'hidden section'\n" +
                "stty $stty_orig\n" +
                "\n"};
        Runtime.getRuntime().exec(cmd);
        Game_World game_world = new Game_World(10, 10); // start position
        Input_Handler input_handler = new Input_Handler();
        Entity_Handler entity_handler = new Entity_Handler(game_world);
        Drawer drawer = new Drawer(game_world);
       // game_world.player = new Player(10, 10);
        HashMap<Character, Direction> map_direction = new HashMap<Character, Direction>();
        map_direction.put('w', Direction.UP);
        map_direction.put('s', Direction.DOWN);
        map_direction.put('d', Direction.RIGHT);
        map_direction.put('a', Direction.LEFT);
        int time = 0;
        while (time < 1000) {
            time++;
            try {
                char res = input_handler.Read();
                if(map_direction.containsKey(res)) {
                    entity_handler.turn(map_direction.get(res));
                    drawer.Draw();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
