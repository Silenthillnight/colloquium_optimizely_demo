package com.locationlabs.optimizelydemo.ui.signup;

import android.content.Intent;
import android.widget.EditText;

import com.locationlabs.optimizelydemo.R;
import com.locationlabs.optimizelydemo.MainActivity;
import com.locationlabs.optimizelydemo.SignUpActivity;
import com.locationlabs.optimizelydemo.util.ValidationUtil;

public class SignUpPresenter {

   private SignUpActivity view;

   public SignUpPresenter(SignUpActivity view) {
      this.view = view;
   }

   public void handleSignUp(EditText email, EditText password, EditText passwordConfirm) {
      if (!ValidationUtil.isValidEmail(email.getText().toString())) {
         view.setErrorCondition(view.getString(R.string.invalid_email_message));
      } else if (password == null || password.getText().toString().isEmpty()) {
         view.setErrorCondition(view.getString(R.string.invalid_password_message));
      } else if (passwordConfirm != null &&
                 !ValidationUtil.isPasswordsMatch(password.getText().toString(),
                                                  passwordConfirm.getText().toString())) {
         view.setErrorCondition(view.getString(R.string.invalid_password_confirm_message));
      } else {
         view.startActivity(new Intent(view, MainActivity.class));
      }
   }
}
