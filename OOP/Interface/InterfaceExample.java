package OOP.Interface;

interface WaterBottleInterface {
    String color = "Blue";
    void fillUp();
    void pourOut();
}

class InterfaceExample implements WaterBottleInterface{

    @Override
    public void fillUp() {
        System.out.println("if is filled up");
    }

    public static void main(String[] args){

        System.out.println(color);
        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
        ex.pourOut();

    }

    @Override
    public void pourOut() {
        System.out.println("pour out the water...");
    }
    
}
