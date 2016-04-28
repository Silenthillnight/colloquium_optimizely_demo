package com.piecakepie.optimizelydemo.ui.main;

import com.piecakepie.optimizelydemo.MainActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

   private MainActivity activity;

   public MainModule(MainActivity view) {
      this.activity = view;
   }

   @Provides
   @ActivityScope
   MainActivity provideView() {
      return activity;
   }

   @Provides
   @ActivityScope
   MainPresenter providePresenter(MainActivity activity) {
      return new MainPresenter(activity);
   }
}
