package com.locationlabs.optimizelydemo.ui.signin;

import com.locationlabs.optimizelydemo.SignInActivity;
import com.locationlabs.optimizelydemo.ui.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
public class SignInModule {

   private SignInActivity activity;

   public SignInModule(SignInActivity view) {
      this.activity = view;
   }

   @Provides
   @ActivityScope
   SignInActivity provideView() {
      return activity;
   }

   @Provides
   @ActivityScope
   SignInPresenter providePresenter(SignInActivity activity) {
      return new SignInPresenter(activity);
   }
}
