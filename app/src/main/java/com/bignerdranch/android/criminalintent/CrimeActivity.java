package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**хост для CrimeFragment
 * Активность для отображение 1 преступления(создание само описание в фрагменте(CrimeFragment))
 */
public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }


}
