package com.piecakepie.optimizelydemo.ui.signin;

import android.content.Intent;
import android.widget.EditText;

import com.piecakepie.optimizelydemo.R;
import com.piecakepie.optimizelydemo.MainActivity;
import com.piecakepie.optimizelydemo.SignInActivity;
import com.piecakepie.optimizelydemo.util.ValidationUtil;

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
