package com.jason9075.daggerplayground.model.weapon;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println(">>>>>>> chop chop chop!");
    }
}
