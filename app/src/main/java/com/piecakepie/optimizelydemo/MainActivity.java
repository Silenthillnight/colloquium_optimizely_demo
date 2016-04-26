package com.piecakepie.optimizelydemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.optimizely.Optimizely;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      ButterKnife.bind(this);

      Optimizely.startOptimizelyWithAPIToken("AANPVcYBDQi_NEwSShI0mJb72xEF3xDg~5736442140", getApplication());
   }

   @OnClick(R.id.main_button)
   public void createDialog(View view) {
      if (view.getId() == R.id.main_button) {
         FragmentManager fragmentManager = getSupportFragmentManager();
         MainDialogFragment dialogFragment = new MainDialogFragment();

         dialogFragment.show(fragmentManager, "main_dialog");
      }
   }
}
