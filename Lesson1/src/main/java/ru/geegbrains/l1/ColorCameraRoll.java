package ru.geegbrains.l1;

import org.springframework.stereotype.Component;

@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll {
    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}

//public class ColorCameraRoll implements CameraRoll {
//    @Override
//    public void processing() {
//        System.out.println("-1 кадр");
//    }
//}
