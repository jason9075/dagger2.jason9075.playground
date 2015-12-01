package com.jason9075.daggerplayground.model.army;

import com.jason9075.daggerplayground.model.weapon.Sword;

import javax.inject.Inject;

public class Scout implements ArmyAction {

    @Inject
    Sword sword;

    @Override
    public Sword getWeapon() {
        return sword;
    }
}
