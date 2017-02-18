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
}
