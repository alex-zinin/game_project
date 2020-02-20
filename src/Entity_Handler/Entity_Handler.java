package Entity_Handler;


import Game_World.Game_World;

public class Entity_Handler {
    public Entity_Handler(Game_World gm)
    {
        game_world = gm;
    }
    Game_World game_world;

    public void turn(Direction dir){
        game_world.player.move(dir);

    }
}
