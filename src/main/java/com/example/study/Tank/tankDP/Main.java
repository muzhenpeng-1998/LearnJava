package com.example.study.Tank.tankDP;

import com.example.study.Tank.tank.Dir;
import com.example.study.Tank.tank.Group;
import com.example.study.Tank.tank.Tank;
import com.example.study.Tank.tank.TankFrame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author nameM
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        //初始化敌方坦克
        for(int i=0; i<5; i++) {
            tf.tanks.add(new Tank(50 + i*80, 200, Dir.DOWN, Group.BAD, tf));
        }

        while(true) {
            Thread.sleep(25);
            tf.repaint();
        }
    }
}
