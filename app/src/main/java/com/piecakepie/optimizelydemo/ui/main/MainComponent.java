package com.piecakepie.optimizelydemo.ui.main;

import com.piecakepie.optimizelydemo.MainActivity;
import com.piecakepie.optimizelydemo.ui.ActivityScope;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
   MainActivity inject(MainActivity activity);
}
