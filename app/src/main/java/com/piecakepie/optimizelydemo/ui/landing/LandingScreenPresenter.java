package com.piecakepie.optimizelydemo.ui.landing;

import android.content.Intent;
import com.piecakepie.optimizelydemo.LandingScreenActivity;
import com.piecakepie.optimizelydemo.SignInActivity;
import com.piecakepie.optimizelydemo.SignUpActivity;

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
