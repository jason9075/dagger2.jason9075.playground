package com.jason9075.daggerplayground.module;

import com.jason9075.daggerplayground.model.army.Archer;
import com.jason9075.daggerplayground.model.army.Knight;
import com.jason9075.daggerplayground.model.army.Scout;
import com.jason9075.daggerplayground.model.weapon.Bow;
import com.jason9075.daggerplayground.model.weapon.Shield;
import com.jason9075.daggerplayground.model.weapon.Sword;

import dagger.Module;
import dagger.Provides;

@Module
public class ArmyModule {

    @Provides
    Knight provideKnight(Sword sword, Shield shield) {
        return new Knight(sword, shield);
    }

    @Provides
    Archer provideArcher(Bow bow) {
        return new Archer(bow);
    }

    @Provides
    Scout provideScout() {
        return new Scout();
    }


}
