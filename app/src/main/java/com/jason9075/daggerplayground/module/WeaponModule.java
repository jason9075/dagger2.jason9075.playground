package com.jason9075.daggerplayground.module;

import android.app.Application;

import com.jason9075.daggerplayground.model.weapon.Bow;
import com.jason9075.daggerplayground.model.weapon.Shield;
import com.jason9075.daggerplayground.model.weapon.Sword;

import dagger.Module;
import dagger.Provides;

@Module
public class WeaponModule {

    @Provides
    Sword provideSword(){return new Sword();}

    @Provides
    Bow provideBow(){return new Bow();}

    @Provides
    Shield provideShield(){return new Shield();}
}
