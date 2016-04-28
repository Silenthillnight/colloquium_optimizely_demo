package com.piecakepie.optimizelydemo.ui.landing;

import com.piecakepie.optimizelydemo.LandingScreenActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {LandingScreenModule.class})
public interface LandingScreenComponent {
   LandingScreenActivity inject(LandingScreenActivity activity);
}
