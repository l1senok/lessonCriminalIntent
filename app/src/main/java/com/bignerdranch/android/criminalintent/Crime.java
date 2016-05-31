package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by alice on 12.05.16.
 * @author alice
 * @since 12.05.16
 * @version 1
 *
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

}
