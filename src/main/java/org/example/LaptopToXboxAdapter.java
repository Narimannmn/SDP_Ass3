package org.example;

public class LaptopToXboxAdapter implements CharacterControl {
    private LaptopControl laptop;

    public LaptopToXboxAdapter(LaptopControl laptop) {
        this.laptop = laptop;
    }

    public void goForward(){
        laptop.pressW();
    }
    public void goLeft(){
        laptop.pressA();
    }
    public void goBack(){
        laptop.pressS();
    }
    public void goRight(){
        laptop.pressD();
    }
}
