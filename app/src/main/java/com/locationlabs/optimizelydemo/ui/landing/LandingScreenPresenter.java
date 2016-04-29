package com.locationlabs.optimizelydemo.ui.landing;

import android.content.Intent;
import com.locationlabs.optimizelydemo.LandingScreenActivity;
import com.locationlabs.optimizelydemo.SignInActivity;
import com.locationlabs.optimizelydemo.SignUpActivity;

public class LandingScreenPresenter {

   private LandingScreenActivity view;

   public LandingScreenPresenter(LandingScreenActivity view) {
      this.view = view;
   }

   public void startSignInActivity() {
      view.startActivity(new Intent(view, SignInActivity.class));
   }

   public void startSignUpActivity() {
      view.startActivity(new Intent(view, SignUpActivity.class));
   }
}
