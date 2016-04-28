package com.piecakepie.optimizelydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.piecakepie.optimizelydemo.R;
import com.piecakepie.optimizelydemo.injection.component.AppComponent;
import com.piecakepie.optimizelydemo.ui.BaseActivity;
import com.piecakepie.optimizelydemo.ui.signup.SignUpModule;
import com.piecakepie.optimizelydemo.ui.signup.SignUpPresenter;
import com.piecakepie.optimizelydemo.util.OptimizelyUtil;

import javax.inject.Inject;

public class SignUpActivity extends BaseActivity {

   @Inject
   SignUpPresenter presenter;

   @BindView(R.id.sign_up_edit_text_email)
   EditText email;

   @BindView(R.id.sign_up_edit_text_password)
   EditText password;

   @Nullable
   @BindView(R.id.sign_up_edit_text_password_confirm)
   EditText passwordConfirm;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_sign_up);
      ButterKnife.bind(this);

      checkOptimizelyLiveVariables();
   }

   @Override
   protected void setupActivityComponent(AppComponent appComponent) {
      appComponent.plus(new SignUpModule(this)).inject(this);
   }

   @OnClick(R.id.sign_up_button)
   protected void handleSignUp() {
      presenter.handleSignUp(email, password, passwordConfirm);
   }

   TextView.OnEditorActionListener completeSignUp = new TextView.OnEditorActionListener() {
      @Override
      public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
         if (v != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
         }

         handleSignUp();
         return false;
      }
   };

   public void setErrorCondition(String message) {
      email.setText("");
      password.setText("");
      if (passwordConfirm != null) {
         passwordConfirm.setText("");
      }
      Toast.makeText(this, message, Toast.LENGTH_LONG).show();
   }

   public void checkOptimizelyLiveVariables() {
      if (OptimizelyUtil.getConfirmPasswordLiveVariable()) {
         passwordConfirm.setVisibility(View.GONE);
         passwordConfirm = null;
         password.setImeOptions(EditorInfo.IME_ACTION_DONE);
         password.setOnEditorActionListener(completeSignUp);
      } else {
         passwordConfirm.setOnEditorActionListener(completeSignUp);
      }
   }
}
