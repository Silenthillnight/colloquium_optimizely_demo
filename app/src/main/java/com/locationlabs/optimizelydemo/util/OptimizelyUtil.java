package com.locationlabs.optimizelydemo.util;

import android.app.Application;

import com.optimizely.Optimizely;
import com.optimizely.Variable.LiveVariable;

public class OptimizelyUtil {

   public static void initializeOptimizely(Application application) {
      Optimizely.setVerboseLogging(true);
      Optimizely.resetUserBucketing(application);
      //Optimizely.enableEditor();
      Optimizely.startOptimizelyWithAPIToken("AANPVcwBUWp6XnhOXzcPBnCQsWnb0hWP~5736442140", application);
   }

   public static boolean getConfirmPasswordLiveVariable() {
      LiveVariable<Boolean> signUpConfirmPassword = Optimizely.booleanForKey("noConfirmPassword", false);

      return signUpConfirmPassword.get();
   }

   public static boolean getRotateMainLogoLiveVariable() {
      LiveVariable<Boolean> rotateMainLogo = Optimizely.booleanForKey("rotateMainLogo", false);

      return rotateMainLogo.get();
   }
}
