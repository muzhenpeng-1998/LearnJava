package com.example.study.Tank.tankDP;

import com.example.study.Tank.tank.*;
import com.example.study.Tank.tank.Dir;
import com.example.study.Tank.tank.Group;
import com.example.study.Tank.tank.Tank;

import java.awt.*;

/**
 * @author nameM
 */
public class Bullet {
    private static final int SPEED = 6;
    private com.example.study.Tank.tank.Group group = com.example.study.Tank.tank.Group.BAD;

    public static int WIDTH = ResourceMgr.bulletD.getWidth();
    public static int HEIGHT = ResourceMgr.bulletD.getHeight();

    Rectangle rect = new Rectangle();

    private int x, y;
    private com.example.study.Tank.tank.Dir dir;

    private boolean living = true;
    TankFrame tf = null;

    public Bullet(int x, int y, Dir dir, com.example.study.Tank.tank.Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        this.tf = tf;

        rect.x = this.x;
        rect.y = this.y;
        rect.width = WIDTH;
        rect.height = HEIGHT;
    }

    public com.example.study.Tank.tank.Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void paint(Graphics g) {
        if(!living) {
            tf.bullets.remove(this);
        }
//        Color c = g.getColor();
//        g.setColor(Color.RED);
//        g.fillOval(x, y, WIDTH, HEIGHT);
//        g.setColor(c);

        switch(dir) {
            case LEFT:
                g.drawImage(ResourceMgr.bulletL, x, y, null);
                break;
            case UP:
                g.drawImage(ResourceMgr.bulletU, x, y, null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.bulletR, x, y, null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.bulletD, x, y, null);
                break;
        }

        move();
    }

    private void move() {

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }

        //update rect
        rect.x = this.x;
        rect.y = this.y;

        if(x < 0 || y < 0 || x > TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) living = false;
    }

    public void collideWith(com.example.study.Tank.tank.Tank tank) {
        if(this.group == tank.getGroup()) return;

        if(rect.intersects(tank.rect)) {
            tank.die();
            this.die();

            //调整爆炸的位置
            int eX = tank.getX() + com.example.study.Tank.tank.Tank.WIDTH/2 - Explode.WIDTH/2;
            int eY = tank.getY() + Tank.HEIGHT/2 - Explode.HEIGHT/2;
            tf.explodes.add(new Explode(eX, eY, tf));
        }

    }

    private void die() {
        this.living = false;
    }
}