package com.piecakepie.optimizelydemo.ui;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.piecakepie.optimizelydemo.OptimizelyDemoApplication;
import com.piecakepie.optimizelydemo.injection.component.AppComponent;

public abstract class BaseActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
      setupActivityComponent(OptimizelyDemoApplication.get(this).getAppComponent());
   }

   protected abstract void setupActivityComponent(AppComponent appComponent);
}
