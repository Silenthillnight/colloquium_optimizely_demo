package com.piecakepie.optimizelydemo.ui.landing;

import com.piecakepie.optimizelydemo.LandingScreenActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
public class LandingScreenModule {
   private LandingScreenActivity activity;

   public LandingScreenModule(LandingScreenActivity view) {
      this.activity = view;
   }

   @Provides
   @ActivityScope
   LandingScreenActivity provideView() {
      return activity;
   }

   @Provides
   @ActivityScope
   LandingScreenPresenter provideLandingScreenPresenter(LandingScreenActivity view) {
      return new LandingScreenPresenter(view);
   }
}
