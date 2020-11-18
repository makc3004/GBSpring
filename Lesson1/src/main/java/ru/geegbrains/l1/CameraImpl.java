package ru.geegbrains.l1;

public class CameraImpl {
    private CameraRollClas cameraRoll;

    public CameraRollClas getCameraRoll(){
        return cameraRoll;
    }

    public void setCameraRoll(CameraRollClas cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    //    public Camera(CameraRoll cameraRoll){
//        this.cameraRoll = cameraRoll;
//    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }

}
