package ru.geegbrains.l1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();


}
//        Assistant assistant = new Assistant();
//        CameraImpl camera = assistant.getCamera();
//        camera.doPhotograph();
//    }

//    public static void main(String[] args) {
//        Camera camera = new Camera();
//        CameraRoll cameraRoll = new ColorCameraRoll();
//        camera.setCameraRoll(cameraRoll);
//        camera.doPhotograph();
//    }

}
