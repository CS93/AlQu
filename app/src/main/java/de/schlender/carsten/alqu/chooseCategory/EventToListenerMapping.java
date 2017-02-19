package de.schlender.carsten.alqu.chooseCategory;

import android.view.View;
import android.widget.Button;

/**
 * Created by Carsten on 18.02.2017.
 */

public class EventToListenerMapping {
    private ApplicationLogic mApplicationLogic;

    public EventToListenerMapping(Gui gui, ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
        //mGui.getXxButton().setOnClicklistener(this) <-- impleents OnClickListener
    }

    /*@Override
    public void onClick(View v) {
        switch ( v.getId()){
            case R.id.b_refresh_category:
                mApplicationLogic.onRefreshClicked();
                break;
            default:
                //View v gets casted to button, to hand the ButtonText to mApplicationLogic.onCategoryClicked. This is necessary because the chosen category is required for the next activity
                Button b = (Button) v;
                mApplicationLogic.onCategoryClicked(b.getText().toString());
                break;
        }
    }*/
}
