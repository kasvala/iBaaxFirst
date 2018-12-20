package webbleu.ibaax.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import webbleu.ibaax.R;

public class HomeActivity extends AppCompatActivity {

    Button btn_getStart,btn_signin,btn_skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_signin=(Button)findViewById(R.id.btn_signin);
        btn_getStart=(Button)findViewById(R.id.btn_getStart);
        btn_skip=(Button)findViewById(R.id.btn_skip);
        btn_getStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,SignInActivity.class);
                startActivity(intent);

            }
        });

        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,MenuWithoutLogin.class);
                startActivity(intent);
            }
        });

    }
}
