package com.jason9075.daggerplayground.model.army;

import com.jason9075.daggerplayground.model.weapon.Bow;

import javax.inject.Inject;

public class Archer implements ArmyAction{

    @Inject Bow bow;

    @Inject
    public Archer(Bow bow){
        this.bow = bow;
    }

    @Override
    public Bow getWeapon() {
        return bow;
    }
}
