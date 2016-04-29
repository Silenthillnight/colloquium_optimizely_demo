package com.locationlabs.optimizelydemo;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.locationlabs.optimizelydemo.R;
import com.locationlabs.optimizelydemo.injection.component.AppComponent;
import com.locationlabs.optimizelydemo.ui.BaseActivity;
import com.locationlabs.optimizelydemo.ui.main.MainModule;
import com.locationlabs.optimizelydemo.ui.main.MainPresenter;
import com.locationlabs.optimizelydemo.util.OptimizelyUtil;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

   @Inject
   MainPresenter presenter;

   @BindView(R.id.main_logo)
   ImageView mainLogo;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      ButterKnife.bind(this);

      if (OptimizelyUtil.getRotateMainLogoLiveVariable()) {
         animateRotatingLogo();
      }
   }

   @Override
   protected void setupActivityComponent(AppComponent appComponent) {
      appComponent.plus(new MainModule(this)).inject(this);
   }

   private void animateRotatingLogo() {
      RotateAnimation animation = new RotateAnimation(0.0f,
                                                      360.0f,
                                                      Animation.RELATIVE_TO_SELF,
                                                      0.5f,
                                                      Animation.RELATIVE_TO_SELF,
                                                      0.5f);
      animation.setDuration(5000);
      animation.setRepeatCount(-1);
      mainLogo.startAnimation(animation);
   }
}
