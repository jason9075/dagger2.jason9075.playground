package com.jason9075.daggerplayground.model.weapon;

public class Bow implements Weapon{

    @Override
    public void attack() {
        System.out.println(">>>>>>> arrow in your knee!");
    }
}
