package com.piecakepie.optimizelydemo.ui.signup;

import com.piecakepie.optimizelydemo.SignUpActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {SignUpModule.class})
public interface SignUpComponent {
   SignUpActivity inject(SignUpActivity activity);
}
