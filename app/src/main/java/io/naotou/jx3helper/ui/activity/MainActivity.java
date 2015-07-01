package io.naotou.jx3helper.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import io.naotou.jx3helper.R;
import io.naotou.jx3helper.base.BaseToolBarActivity;

public class MainActivity extends BaseToolBarActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
