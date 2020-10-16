package com.example.study.Tank.tankDP;

import com.example.study.Tank.tank.ImageUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceMgr {

    public static BufferedImage goodTankL, goodTankU, goodTankR, goodTankD;
    public static BufferedImage badTankL, badTankU, badTankR, badTankD;
    public static BufferedImage bulletL, bulletU, bulletR, bulletD;
    public static BufferedImage[] explodes = new BufferedImage[16];

    static {
        try {
            goodTankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("com/example/study/Tank/images/GoodTank1.png"));
            goodTankL = com.example.study.Tank.tank.ImageUtil.rotateImage(goodTankU, -90);
            goodTankR = com.example.study.Tank.tank.ImageUtil.rotateImage(goodTankU, 90);
            goodTankD = com.example.study.Tank.tank.ImageUtil.rotateImage(goodTankU, 180);

            badTankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("com/example/study/Tank/images/BadTank1.png"));
            badTankL = com.example.study.Tank.tank.ImageUtil.rotateImage(badTankU, -90);
            badTankR = com.example.study.Tank.tank.ImageUtil.rotateImage(badTankU, 90);
            badTankD = com.example.study.Tank.tank.ImageUtil.rotateImage(badTankU, 180);

            bulletU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("com/example/study/Tank/images/bulletU.png"));
            bulletL = com.example.study.Tank.tank.ImageUtil.rotateImage(bulletU, -90);
            bulletR = com.example.study.Tank.tank.ImageUtil.rotateImage(bulletU, 90);
            bulletD = ImageUtil.rotateImage(bulletU, 180);

            for(int i=0; i<16; i++)
                explodes[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("com/example/study/Tank/images/e" + (i+1) + ".gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
