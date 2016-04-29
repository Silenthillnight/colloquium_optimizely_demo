package com.locationlabs.optimizelydemo.ui.landing;

import com.locationlabs.optimizelydemo.LandingScreenActivity;
import com.locationlabs.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {LandingScreenModule.class})
public interface LandingScreenComponent {
   LandingScreenActivity inject(LandingScreenActivity activity);
}
