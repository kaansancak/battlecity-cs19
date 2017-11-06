/**
 * Created by kaan on 10/28/2017.
 */
public abstract class Tank extends GameObject {

    //Variables
    private int BULLET_DAMAGE = 200;
    private int type;
    private int id;
    private int health;
    private int dir;

    //Methods
    public Bullet fire(){
        Bullet tankBullet = new Bullet( id, super.getxLoc()+(int)getImage().getHeight(), super.getyLoc()+(int)getImage().getWidth()/2, dir);
        return tankBullet;
    }

    public boolean isAlive(){
        return ( health <= 0);
    }

    /* This method must be modified
    the direction which tank tries to move
    might be unpassable, so return type must be
    boolean but not void
     */

    public int requestMove(){
        return dir;
    }
    public void move( int dir){
            this.dir = dir;
            if( dir == 0)
                super.setxLoc(super.getxLoc() + 1);
            else if( dir == 1)
                super.setxLoc( super.getxLoc() - 1);
            else if ( dir == 2)
                super.setyLoc( super.getyLoc() + 1);
            else if( dir == 3)
                super.setyLoc( super.getyLoc() - 1);
    }

    public void getDamaged(){
        health = health - BULLET_DAMAGE;
    }

    //Setters and Getters
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public boolean isMovableTile(){
        return false;
    }
}
