package de.schlender.carsten.alqu.chooseCategory;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by Carsten on 18.02.2017.
 */

public class Data {
    //private User mUser;
    private Activity mActivity;
    //private DataInterface mDataInterface;
    private ArrayList<String> mCategories;

    public Data(Bundle b, Activity activity){
        mActivity = activity;
        //mUser = user;
        //mDataInterface = new DataInterface(activity);
        if (b == null ){
            //First start of the activity
            //loadCategories(); --> mDataInterface.get...
            //loadStatistics();
        }
        else {
            //restoreDataFromBundle(b);
        }
    }

    /*private void restoreDataFromBundle(Bundle b) {
        //The Serializable is used to put the User-Object in Bundle
        mCategories = (ArrayList<String>) b.getStringArrayList(Constants.KEY_KARTEIEN_VALUE);
        mStatistics = (ArrayList<Statistics>) b.getSerializable(Constants.KEY_STATISTICS_VALUE);
    }

    public void saveDataInBundle(Bundle b){
        //The Serializable is used to put the User-Object in Bundle
        b.putStringArrayList(Constants.KEY_KARTEIEN_VALUE, mCategories);
        b.putSerializable(Constants.KEY_STATISTICS_VALUE, mStatistics);
    }*/
}
