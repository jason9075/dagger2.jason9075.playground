package com.jason9075.daggerplayground;

import android.app.Application;

import com.jason9075.daggerplayground.components.AppComponents;
import com.jason9075.daggerplayground.components.DaggerAppComponents;
import com.jason9075.daggerplayground.module.ArmyModule;
import com.jason9075.daggerplayground.module.WeaponModule;

public class MyApplication extends Application {
    private static AppComponents appComponents;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        appComponents = DaggerAppComponents.builder()
                .armyModule(new ArmyModule())
                .weaponModule(new WeaponModule())
                .build();
    }

    public static AppComponents getAppComponents() {
        return appComponents;
    }

}
