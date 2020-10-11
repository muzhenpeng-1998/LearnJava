package com.example.study.Tank;

import org.junit.Test;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import static org.junit.Assert.assertNotNull;

/**
 * @author nameM
 */
public class ImageTest {

    @Test
    public void test() throws IOException {

        //从硬盘上读取图片文件
        //            BufferedImage image = ImageIO.read(new File("E:\\mashibing-study\\SpringCloud\\src\\main\\java\\com\\example\\study\\Tank\\images\\bulletD.gif"));
//            assertNotNull(image);

//        InputStream resourceAsStream = ImageTest.class.getClassLoader().getResourceAsStream("images/bulletD.gif");
//        System.out.println(resourceAsStream);
                    BufferedImage image2 = ImageIO.read(ImageTest.class.getClassLoader().getResourceAsStream("com/example/study/Tank/images/0.gif"));
//        this.getClass()
            assertNotNull(image2);
    }
}
