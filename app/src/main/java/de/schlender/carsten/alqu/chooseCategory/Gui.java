package de.schlender.carsten.alqu.chooseCategory;

import android.app.Activity;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import de.schlender.carsten.alqu.R;

/**
 * Created by Carsten on 18.02.2017.
 */

public class Gui {

    private Activity mActivity;
    private Toolbar mToolbar;
    private FloatingActionButton mFab;
    private TextView mTextView;

    public Gui(Activity act){
        mActivity = act;
        mActivity.setContentView(R.layout.activity_choose);
        mToolbar = (Toolbar) mActivity.findViewById(R.id.toolbar);
        //setSupportActionBar(mToolbar);

        mFab = (FloatingActionButton) mActivity.findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Example of a call to a native method
        mTextView = (TextView) act.findViewById(R.id.sample_text);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        mActivity.getMenuInflater().inflate(R.menu.menu_choose, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return false;
    }

    public void showToast(Activity act, String text){
        Toast toast = Toast.makeText(act, text, Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        toastTV.setTextColor(Color.RED);
        toast.show();
    }

}
