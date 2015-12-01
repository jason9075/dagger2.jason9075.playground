package com.jason9075.daggerplayground.model.weapon;

public class Shield implements Weapon {

    @Override
    public void attack() {
        System.out.println(">>>>>>> smash!!!");
    }
}
