package de.schlender.carsten.alqu.chooseCategory;

import android.os.Bundle;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import de.schlender.carsten.alqu.R;

public class Init extends AppCompatActivity {

    private Data mData;
    private Gui mGui;
    private ApplicationLogic mApplicationLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData(savedInstanceState);
        initGui();
        initApplicationLogic();
        initEventToListenerMapping();

    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
       // mData.saveDataInBundle(outState);
    }


    @Override
    protected void onRestart() {
        super.onResume();
        //mApplicationLogic.onRestart();
    }


    private void initData(Bundle savedInstanceState) {
        mData = new Data(savedInstanceState, this);

    }

    private void initGui() {
        mGui = new Gui(this);

    }

    private void initApplicationLogic() {
        mApplicationLogic = new ApplicationLogic(mData, mGui);
    }

    private void initEventToListenerMapping() {
        new EventToListenerMapping(mGui, mApplicationLogic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return mGui.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mGui.onOptionsItemSelected(item) == true){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //Wenn notwendig kann hier C++ eingebunden werden:
    /*// A native method that is implemented by the 'native-lib' native library,
    // which is packaged with this application.

    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    } */
}
/*
    setContentView(R.layout.activity_choose);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


     // A native method that is implemented by the 'native-lib' native library,
     // which is packaged with this application.

    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
*/