package io.naotou.jx3helper.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import io.naotou.jx3helper.R;
import io.naotou.jx3helper.base.BaseToolBarActivity;

public class MainActivity extends BaseToolBarActivity {

    private Toast toast;
    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toast = Toast.makeText(getApplicationContext(),"再按一次退出",Toast.LENGTH_SHORT);
    }

    @Override
    public void onBackPressed() {
        if (toast.getView().getParent() != null) {
            toast.show();
        } else {
            System.exit(0);
        }
    }
}
