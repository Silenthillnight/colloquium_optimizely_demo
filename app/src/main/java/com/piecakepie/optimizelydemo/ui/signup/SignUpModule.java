package com.piecakepie.optimizelydemo.ui.signup;

import com.piecakepie.optimizelydemo.SignUpActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
public class SignUpModule {
   private SignUpActivity activity;

   public SignUpModule(SignUpActivity view) {
      this.activity = view;
   }

   @Provides
   @ActivityScope
   SignUpActivity provideView() {
      return activity;
   }

   @Provides
   @ActivityScope
   SignUpPresenter provideSignUpPresenter(SignUpActivity activity) {
      return new SignUpPresenter(activity);
   }
}
