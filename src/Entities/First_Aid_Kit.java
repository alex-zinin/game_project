package Entities;

public class First_Aid_Kit extends Entity {
    public First_Aid_Kit(int x, int y) {
        super(x, y, 200000);
        this.has_collisions = false;
        type = Entity_Type.KIT;
        damage = -100;
    }
}
