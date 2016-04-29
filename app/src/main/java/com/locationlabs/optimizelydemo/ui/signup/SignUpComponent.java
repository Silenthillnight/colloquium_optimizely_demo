package com.locationlabs.optimizelydemo.ui.signup;

import com.locationlabs.optimizelydemo.SignUpActivity;
import com.locationlabs.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {SignUpModule.class})
public interface SignUpComponent {
   SignUpActivity inject(SignUpActivity activity);
}
