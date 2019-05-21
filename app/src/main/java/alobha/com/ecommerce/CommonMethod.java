package alobha.com.ecommerce;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

public class CommonMethod {

	/** Called for Showing Alert in Application */
	public static void showAlert(String message, Activity context) {

		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setMessage(message).setCancelable(false)
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

					}
				});
		try {
			builder.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/** Called for checking Internet connection */
	public static boolean isOnline(Context context) {

		ConnectivityManager cm = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);

		NetworkInfo netInfo;
		try {
			netInfo = cm.getActiveNetworkInfo();
			if (netInfo != null && netInfo.isConnectedOrConnecting()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	 public static void closeKeyboard(final Context context, final View view){
	    	InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
	        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
	    }
	 
	 public static void showNetworkSnack(View view, String message, String action){
		 Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG) .setAction(action, new View.OnClickListener() {
					 @Override
					 public void onClick(View view) {



					 }
				 });
		 snackbar.setActionTextColor(Color.RED);

		 View sbView = snackbar.getView();
		 TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
		 textView.setTextColor(Color.YELLOW);
		 snackbar.show();
	 }

	public static void showSnack(View view, String message){
		Snackbar snackbar = Snackbar
				.make(view, message, Snackbar.LENGTH_LONG);
		snackbar.show();
	}

	public static void  write(String msg )
	{
		System.out.println(msg);
	}
	public static void  overridePendingTransitionslide(Activity activity )
	{
		activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
		
}
