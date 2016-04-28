package com.piecakepie.optimizelydemo;

import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.optimizely.Optimizely;
import com.piecakepie.optimizelydemo.injection.component.AppComponent;
import com.piecakepie.optimizelydemo.ui.BaseActivity;
import com.piecakepie.optimizelydemo.ui.landing.LandingScreenModule;
import com.piecakepie.optimizelydemo.ui.landing.LandingScreenPresenter;

import javax.inject.Inject;

public class LandingScreenActivity extends BaseActivity {

   @Inject
   LandingScreenPresenter presenter;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_landing_screen);
      ButterKnife.bind(this);

      Optimizely.setVerboseLogging(true);
      Optimizely.startOptimizelyWithAPIToken("AANPVcwBUWp6XnhOXzcPBnCQsWnb0hWP~5736442140", getApplication());
   }

   @Override
   protected void setupActivityComponent(AppComponent appComponent) {
      appComponent.plus(new LandingScreenModule(this)).inject(this);
   }

   @OnClick(R.id.landing_sign_up_button)
   protected void startSignInActivity() {
      presenter.startSignUpActivity();
   }

   @OnClick(R.id.landing_sign_in_text)
   protected void startSignUpActivity() {
      presenter.startSignInActivity();
   }
}
