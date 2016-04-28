package com.piecakepie.optimizelydemo.injection.component;

import android.app.Application;
import com.piecakepie.optimizelydemo.injection.module.AppModule;
import com.piecakepie.optimizelydemo.ui.landing.LandingScreenComponent;
import com.piecakepie.optimizelydemo.ui.landing.LandingScreenModule;
import com.piecakepie.optimizelydemo.ui.main.MainComponent;
import com.piecakepie.optimizelydemo.ui.main.MainModule;
import com.piecakepie.optimizelydemo.ui.signin.SignInComponent;
import com.piecakepie.optimizelydemo.ui.signin.SignInModule;
import com.piecakepie.optimizelydemo.ui.signup.SignUpComponent;
import com.piecakepie.optimizelydemo.ui.signup.SignUpModule;
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
