package org.example;

public class XboxControl implements CharacterControl{
    public void goForward(){
        System.out.println("Your character goes forward");
    }
    public void goLeft(){
        System.out.println("Your character goes left");
    }
    public void goBack(){
        System.out.println("Your character goes back");
    }
    public void goRight(){
        System.out.println("Your character goes right");
    }
}
