package com.jason9075.daggerplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jason9075.daggerplayground.model.army.Archer;
import com.jason9075.daggerplayground.model.army.Knight;
import com.jason9075.daggerplayground.model.weapon.Sword;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Knight knight;

    @Inject
    Archer archer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getAppComponents().inject(this);
        knight.getWeapon().attack();
        archer.getWeapon().attack();
    }
}
