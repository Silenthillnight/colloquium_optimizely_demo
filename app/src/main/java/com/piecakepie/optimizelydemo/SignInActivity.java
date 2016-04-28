package com.piecakepie.optimizelydemo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import com.piecakepie.optimizelydemo.R;
import com.piecakepie.optimizelydemo.injection.component.AppComponent;
import com.piecakepie.optimizelydemo.ui.BaseActivity;
import com.piecakepie.optimizelydemo.ui.signin.SignInModule;
import com.piecakepie.optimizelydemo.ui.signin.SignInPresenter;

import javax.inject.Inject;

public class SignInActivity extends BaseActivity {

   @Inject
   SignInPresenter presenter;

   @BindView(R.id.sign_in_edit_text_email)
   EditText email;

   @BindView(R.id.sign_in_edit_text_password)
   EditText password;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_sign_in);
      ButterKnife.setDebug(true);
      ButterKnife.bind(this);

      Log.d("BLAH", "email: " + (email != null));
   }

   @Override
   protected void setupActivityComponent(AppComponent appComponent) {
      appComponent.plus(new SignInModule(this)).inject(this);
   }

   @OnClick(R.id.sign_in_button)
   protected void handleSignIn() {
      presenter.handleSignIn(email, password);
   }

   @OnEditorAction(R.id.sign_in_edit_text_password)
   protected boolean handleSignInFromPassword() {
      View view = this.getCurrentFocus();
      if (view != null) {
         InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
         imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
      }

      handleSignIn();
      return true;
   }

   public void setErrorCondition(String message) {
      email.setText("");
      password.setText("");
      Toast.makeText(this, message, Toast.LENGTH_LONG).show();
   }
}
