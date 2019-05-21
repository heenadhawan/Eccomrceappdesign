package alobha.com.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dell on 5/25/2018.
 */

public class Register extends AppCompatActivity {
    Button btnregister;
    TextView login,password;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnregister = (Button)findViewById(R.id.Register);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
                CommonMethod.overridePendingTransitionslide(Register.this);
            }
        });

        login = (TextView) findViewById(R.id.textvlogin);
        login .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
                CommonMethod.overridePendingTransitionslide(Register.this);
            }
        });
        back = (ImageView) findViewById(R.id.back);
        back .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
        password = (TextView) findViewById(R.id.password);
    }
}



