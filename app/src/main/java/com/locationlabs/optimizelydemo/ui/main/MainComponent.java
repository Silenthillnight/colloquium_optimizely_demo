package com.locationlabs.optimizelydemo.ui.main;

import com.locationlabs.optimizelydemo.MainActivity;
import com.locationlabs.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
   MainActivity inject(MainActivity activity);
}
