package com.locationlabs.optimizelydemo.ui.signin;

import android.content.Intent;
import android.widget.EditText;

import com.locationlabs.optimizelydemo.R;
import com.locationlabs.optimizelydemo.MainActivity;
import com.locationlabs.optimizelydemo.SignInActivity;
import com.locationlabs.optimizelydemo.util.ValidationUtil;

public class SignInPresenter {

   private SignInActivity view;

   public SignInPresenter(SignInActivity view) {
      this.view = view;
   }

   public void handleSignIn(EditText email, EditText password) {
      if (!ValidationUtil.isValidEmail(email.getText().toString())) {
         view.setErrorCondition(view.getString(R.string.invalid_email_message));
      } else if (password == null || password.getText().toString().isEmpty()) {
         view.setErrorCondition(view.getString(R.string.invalid_password_message));
      } else {
         view.startActivity(new Intent(view, MainActivity.class));
      }
   }
}
