package edu.uw.tacoma.mmuppa.criminalintent;

import java.util.UUID;
import java.util.Date;
/**
 * Created by mmuppa on 4/6/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
