package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
//хоcт для CrimeFragment
public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //получаем fm для управления объектами списком и стеком транзакцй фрагментов
        FragmentManager fm = getSupportFragmentManager();
        //support используется толлько потому, что используется библиотека поддержки и класс,иначе нужно субклассировать Activity и вызывать getFM()
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);//при повороте экрана восстанавливает уже существующий фрагмент

        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }

    }
}
