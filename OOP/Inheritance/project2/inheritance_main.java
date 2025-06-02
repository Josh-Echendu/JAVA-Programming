package OOP.Inheritance.project2;

class Mouse {
    public static void leftClick(){
        System.out.println("LeftClick");
    }

    public static void rightClick(){
        System.out.println("rightclick");
    }

    void ScrollUp(){
        System.out.println("Scrolled Up!");
    }

    void ScrollDown(){
        System.out.println("Scrolled Down!");
    }
}

public class inheritance_main {
    public static void main(String[] args){
        mouse1 mou1 = new mouse1();
        System.out.println('"' + mou1.texture + '"');

        // accesing the scrollup and scrolldown method using the objects instance
        mou1.ScrollUp();
        mou1.ScrollDown();

        //accesing the leftclick and rightclick method using the className bcos they are static methods
        mouse1.leftClick();
        mouse1.rightClick();

        mouse2 mou2 = new mouse2();
        System.out.println("'" + mou2.connectz + "'");
        mouse2.connect();
        mou2.ScrollUp();
        mou2.ScrollDown();

        mouse3 mou3 = new mouse3();
        System.out.println("'" + mou3.ambidextrous + "'");
        mou3.ScrollUp();
        mou3.ScrollDown();

    }
}