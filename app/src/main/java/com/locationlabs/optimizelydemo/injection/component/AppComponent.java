package com.locationlabs.optimizelydemo.injection.component;

import android.app.Application;
import com.locationlabs.optimizelydemo.injection.module.AppModule;
import com.locationlabs.optimizelydemo.ui.landing.LandingScreenComponent;
import com.locationlabs.optimizelydemo.ui.landing.LandingScreenModule;
import com.locationlabs.optimizelydemo.ui.main.MainComponent;
import com.locationlabs.optimizelydemo.ui.main.MainModule;
import com.locationlabs.optimizelydemo.ui.signin.SignInComponent;
import com.locationlabs.optimizelydemo.ui.signin.SignInModule;
import com.locationlabs.optimizelydemo.ui.signup.SignUpComponent;
import com.locationlabs.optimizelydemo.ui.signup.SignUpModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

   Application getApplication();

   LandingScreenComponent plus(LandingScreenModule module);
   SignUpComponent plus(SignUpModule module);
   SignInComponent plus(SignInModule module);
   MainComponent plus(MainModule module);
}
