package e.gemaris.preworkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Sets up the button that changes text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });

        //Sets up the button that changes background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.backgroundColorChange));

            }
        });

        //Sets up the button that changes text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Android is awesome!");
                }
                else
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                //put the text into textView once the when the "change text" button is clicked

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to original
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.textColor));

                //reset background color back to orignal
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.backgroundColor));

                //reset the text back to "Hello from Gemaris!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Gemaris!");
            }
        });


    }
}
