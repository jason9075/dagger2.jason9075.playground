package com.jason9075.daggerplayground.components;

import com.jason9075.daggerplayground.MainActivity;
import com.jason9075.daggerplayground.module.ArmyModule;
import com.jason9075.daggerplayground.module.WeaponModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jason9075 on 2015/12/1.
 */

@Singleton
@Component(modules = {ArmyModule.class, WeaponModule.class})
public interface AppComponents {
    void inject(MainActivity activity);
}
