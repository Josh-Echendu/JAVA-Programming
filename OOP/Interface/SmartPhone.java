package OOP.Interface;

interface Camera {
    String picture = ".jpg";
    void takePhoto();
}

interface GPS {
    void getLocation();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, GPS, MusicPlayer {
    String phoneName;

    public SmartPhone(String phoneName){
        this.phoneName = phoneName;
    }

    @Override
    public void takePhoto() {
        System.out.println(Camera.picture);
        System.out.println("Click!");
        System.out.println("take photo on my" + this.phoneName + " phone" );
    }

    @Override
    public void getLocation() {
        System.out.println("check location on my " + this.phoneName + " phone" );
        System.out.println("Latitude: 6.5244, Longitude: 3.3792");
    }

    @Override
    public void playMusic() {
        System.out.println("play music on my " + this.phoneName + " phone" );
        System.out.println("Now playing: Burna Boy - City Boys 🎶");
    }
}

class all_phone {
    public static void main(String[] args){
        SmartPhone sPhone = new SmartPhone("samsung");
        sPhone.playMusic();
        sPhone.takePhoto();
        sPhone.getLocation();
    }
}
