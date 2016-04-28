package com.piecakepie.optimizelydemo;

import android.os.Bundle;
import com.piecakepie.optimizelydemo.R;
import com.piecakepie.optimizelydemo.injection.component.AppComponent;
import com.piecakepie.optimizelydemo.ui.BaseActivity;
import com.piecakepie.optimizelydemo.ui.main.MainModule;
import com.piecakepie.optimizelydemo.ui.main.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

   @Inject
   MainPresenter presenter;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   @Override
   protected void setupActivityComponent(AppComponent appComponent) {
      appComponent.plus(new MainModule(this)).inject(this);
   }
}
