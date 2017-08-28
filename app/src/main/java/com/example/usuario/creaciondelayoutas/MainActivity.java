package com.example.usuario.creaciondelayoutas;

import android.os.Bundle;
import android.provider.Settings;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout L = (ConstraintLayout) findViewById(R.id.row);
        final LinearLayout Y= (LinearLayout) findViewById(R.id.res);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout R = new LinearLayout(Y.getContext());
                count++;
                TextView T= new TextView(Y.getContext());
                T.setText("campo"+String.valueOf(count));
                R.addView(T);

                EditText E= new EditText(Y.getContext());
                E.setText("TF");
                R.addView(E);

                Button B= new Button(Y.getContext());
                B.setText("LOG");
                R.addView(B);

                B.setOnClickListener(new View.OnClickListener() {
                    String num= "campo"+String.valueOf(count);
                    @Override
                    public void onClick(View view) {
                        System.out.println(num);
                    }
                });

                Y.addView(R);

                System.out.println("hi");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        setContentView(R.layout.activity_main);


        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
