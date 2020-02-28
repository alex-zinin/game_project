package Entity_Handler;


import Game_World.Game_World;

public class Entity_Handler {
    public Entity_Handler(Game_World gm)
    {
        game_world = gm;
    }
    Game_World game_world;

    public Direction GetReverseDirection(Direction dir)
    {
        switch(dir)
        {
            case RIGHT: return Direction.LEFT;
            case LEFT: return Direction.RIGHT;
            case UP: return Direction.DOWN;
            case DOWN: return Direction.UP;
            default: return Direction.UP;
        }

    }

    public void turn(Direction dir) {
//        game_world.player.move(dir);
//        if(game_world.player.pos_x >= game_world.X_WORLD_SIZE - 1 ||
//                game_world.player.pos_x <= 0 ||
//                game_world.player.pos_y >= game_world.Y_WORLD_SIZE - 1||
//               game_world.player.pos_y <= 0)
//            game_world.player.move(GetReverseDirection(dir));
        game_world.player.move(dir);

        int entity_index = -1; //impossible index
        for (int i = 0; i < game_world.entities.size(); ++i) {
            if (game_world.entities.get(i).pos_x == game_world.player.pos_x &&
                    game_world.entities.get(i).pos_y == game_world.player.pos_y) {
                entity_index = i;
                break;
            }
        }

        if (entity_index == -1) {
            return;
        }

        game_world.player.health -= game_world.entities.get(entity_index).damage;
        if (game_world.player.health < 0) {
            System.out.print("GAME OVER\n");
            System.exit(0);
        }

        if (game_world.entities.get(entity_index).has_collisions == true) {
            game_world.player.move(GetReverseDirection(dir));
        }

    }
}
