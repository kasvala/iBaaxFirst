package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class SignInActivity extends AppCompatActivity {

    TextView txt_getStart;
    @BindView(R.id.img_logo)
    ImageView imgLogo;
    @BindView(R.id.ed_username)
    EditText edUsername;
    @BindView(R.id.ed_password)
    EditText edPassword;
    @BindView(R.id.txt_forgotpassword)
    TextView txtForgotpassword;
    @BindView(R.id.fb)
    ImageView fb;
    @BindView(R.id.twitter)
    ImageView twitter;
    @BindView(R.id.google)
    ImageView google;
    @BindView(R.id.ln_main)
    LinearLayout lnMain;
    @BindView(R.id.btn_signin)
    Button btnSignin;
    @BindView(R.id.txt_getStart)
    TextView txtGetStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);
        txt_getStart = (TextView) findViewById(R.id.txt_getStart);

        txt_getStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        txtForgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, ForgotPasswodActivity.class);
                startActivity(intent);
            }
        });
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, WithLoginMenuActivity.class);
                startActivity(intent);
            }
        });

    }
}
