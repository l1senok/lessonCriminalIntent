package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by alice on 01.06.16.
 * singleton class(1 instance class)
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        //либо возвращает уже готовый, либо задает новый обект класса
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    //закрытый конструктор
    private CrimeLab(Context context) {
        //mAppContext = appContext;
        //генерирование списка из ста элементов, где каждое второе преступление имеет метку "не раскрыто"
        mCrimes = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    //get-метод для списка
    public List<Crime> getCrimes() {
        return mCrimes;
    }

    //get-метод для элемента списка
    public Crime getCrime(UUID id){
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
