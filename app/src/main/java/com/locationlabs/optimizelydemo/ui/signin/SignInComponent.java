package com.locationlabs.optimizelydemo.ui.signin;

import com.locationlabs.optimizelydemo.SignInActivity;
import com.locationlabs.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {SignInModule.class})
public interface SignInComponent {
   SignInActivity inject(SignInActivity activity);
}
