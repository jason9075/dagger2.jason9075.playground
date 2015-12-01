package com.jason9075.daggerplayground.model.army;

import com.jason9075.daggerplayground.model.weapon.Bow;
import com.jason9075.daggerplayground.model.weapon.Shield;
import com.jason9075.daggerplayground.model.weapon.Sword;

import javax.inject.Inject;

public class Knight implements ArmyAction {

    @Inject Sword sword;
    @Inject Shield shield;

    @Inject
    public Knight(Sword sword, Shield shield){
        this.sword = sword;
        this.shield = shield;
    }

    @Override
    public Sword getWeapon() {
        return sword;
    }
}
