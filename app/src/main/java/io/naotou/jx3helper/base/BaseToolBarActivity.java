package io.naotou.jx3helper.base;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import io.naotou.jx3helper.R;


/**
 * @author Jack Cooper
 * @name Jx3Helper
 * @date 2015/6/30
 * @2015 AngelCrunch 天使汇 http://www.angelcrunch.com/
 */
public abstract class BaseToolBarActivity extends AppCompatActivity {

    private AppBarLayout mAppbar;
    private Toolbar mToolbar;

    /**
     * @return 布局
     */
    abstract protected int getLayoutResource();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        mAppbar = (AppBarLayout) findViewById(R.id.appbar);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mAppbar == null || mToolbar == null) {
            throw new RuntimeException("no toolbar");
        }
        mToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnToolBarClick();
            }
        });

        setSupportActionBar(mToolbar);

        if (Build.VERSION.SDK_INT >= 21) {
            mAppbar.setElevation(8f);
        }
    }

    public void OnToolBarClick() {
        //让子类重写这个方法.
        //测试提交.
    }

}
