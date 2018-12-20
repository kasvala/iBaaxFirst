package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class AccessDataSCreen extends AppCompatActivity {

    @BindView(R.id.img_logo)
    ImageView imgLogo;
    @BindView(R.id.btn_getStart)
    Button btnGetStart;
    @BindView(R.id.btn_signin)
    Button btnSignin;
    @BindView(R.id.ln_main)
    LinearLayout lnMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_data_screen);
        ButterKnife.bind(this);

        btnGetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AccessDataSCreen.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AccessDataSCreen.this,SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}
