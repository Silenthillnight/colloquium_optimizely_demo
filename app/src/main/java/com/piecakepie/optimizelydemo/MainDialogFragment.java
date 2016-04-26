package com.piecakepie.optimizelydemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;
import com.optimizely.Optimizely;

public class MainDialogFragment extends DialogFragment {
   @Override
   public Dialog onCreateDialog(Bundle savedInstanceState) {
      // Use Builder class to create Dialog
      AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
      builder.setMessage(R.string.main_dialog_message)
         .setPositiveButton(R.string.main_dialog_like, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getActivity(), R.string.main_dialog_like_toast, Toast.LENGTH_SHORT).show();
               Optimizely.trackEvent("like");
            }
         })
         .setNegativeButton(R.string.main_dialog_dislike, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getActivity(), R.string.main_dialog_dislike_toast, Toast.LENGTH_SHORT).show();
               Optimizely.trackEvent("dislike");
            }
         });

      // Create the AlertDialog object and return it
      return builder.create();
   }
}
