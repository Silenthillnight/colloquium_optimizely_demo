package com.piecakepie.optimizelydemo.ui.signin;

import com.piecakepie.optimizelydemo.SignInActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {SignInModule.class})
public interface SignInComponent {
   SignInActivity inject(SignInActivity activity);
}
