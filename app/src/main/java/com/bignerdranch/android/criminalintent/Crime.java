package com.bignerdranch.android.criminalintent;

import java.util.Date;
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
    private String mTitle;      //название преступления
    private Date mDate;         //Дата
    private boolean mSolved;    //Статус(раскрыто или нет)


    public Crime() {
        // Генерирование уникального идентификатора
        mId = UUID.randomUUID();
        //По умолчанию присваивает текущую дату
        mDate = new Date();
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

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }




}
