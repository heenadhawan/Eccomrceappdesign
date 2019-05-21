package alobha.com.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {
Button login,btnskip;
TextView signup;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
       login = (Button)findViewById(R.id.login);
       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Navigation.class);
                startActivity(intent);
            }
        });
  btnskip = (Button)findViewById(R.id.button);
   btnskip .setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Login.this,Navigation.class);
        startActivity(intent);
    }
});
signup = (TextView) findViewById(R.id.textvsignup);
signup .setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Login.this,Register.class);
        startActivity(intent);
    }
});
back = (ImageView) findViewById(R.id.back);
back .setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Login.this,Navigation.class);
        startActivity(intent);
    }
});
    }
}
