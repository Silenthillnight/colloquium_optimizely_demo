package com.locationlabs.optimizelydemo.util;

import android.util.Patterns;

public class ValidationUtil {

   public static boolean isValidEmail(CharSequence email) {
      return email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches();
   }

   public static boolean isPasswordsMatch(CharSequence password, CharSequence passwordConfirm) {
      return password.equals(passwordConfirm);
   }
}
