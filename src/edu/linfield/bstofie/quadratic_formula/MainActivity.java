package edu.linfield.bstofie.quadratic_formula;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	public void showSoftKeyboard(View view) {
	    if (view.requestFocus()) {
	        InputMethodManager imm = (InputMethodManager)
	                getSystemService(Context.INPUT_METHOD_SERVICE);
	        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
	    }
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button CalculateBtn = (Button) findViewById(R.id.calcBtn);
        CalculateBtn.setOnClickListener(new OnClickListener() {
		//make variable to hold user input and pass into quadCheck
        	/*EditText editTextA = (EditText) findViewById(R.id.editText_A);
        	String stringTextA = editTextA.toString();
        	Double ax2 = Double.valueOf(stringTextA);
       		  
       		EditText editTextB = (EditText) findViewById(R.id.editText_B);
       		String stringTextB = editTextB.toString();
     		Double bx = Double.valueOf(stringTextB);
     		
     		EditText editTextC = (EditText) findViewById(R.id.editText_C);
     		String stringTextC = editTextC.toString();
     		Double c1 = Double.valueOf(stringTextC); */
        
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("MainActivity","calculate btn clicked");
				//put variable into method (instead of 0,0,0)
				QuadCheck.quadCheck(0, 0, 0);
				//Toast.makeText(getApplicationContext(), "x^2=" + ax2 , Toast.LENGTH_LONG).show();
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
