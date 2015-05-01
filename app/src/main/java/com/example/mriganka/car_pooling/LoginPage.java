package com.example.mriganka.car_pooling;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_page, menu);
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
    public void signIn(View view){
        EditText un = (EditText)findViewById(R.id.etUserName);
        EditText pw = (EditText)findViewById(R.id.etPass);
        String username = un.getText().toString();
        String pass = pw.getText().toString();
        System.out.println(username);
        System.out.println(pass);
        if(username.equals("admin") && pass.equals("admin"))
        {
          System.out.println("inside if");
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Invalid Username or Password";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER| Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}
