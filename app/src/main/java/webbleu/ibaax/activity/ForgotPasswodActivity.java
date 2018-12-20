package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class ForgotPasswodActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.img_email)
    ImageView imgEmail;
    @BindView(R.id.view_1)
    View view1;
    @BindView(R.id.txt_recover_Email)
    TextView txtRecoverEmail;
    @BindView(R.id.txt_recover_Email2)
    TextView txtRecoverEmail2;
    @BindView(R.id.card_view)
    CardView cardView;
    @BindView(R.id.ed_email)
    EditText edEmail;
    @BindView(R.id.img_email_send)
    ImageView imgEmailSend;
    @BindView(R.id.rl_email)
    RelativeLayout rlEmail;
    @BindView(R.id.img_phone)
    ImageView imgPhone;
    @BindView(R.id.view_2)
    View view2;
    @BindView(R.id.txt_recover_phone)
    TextView txtRecoverPhone;
    @BindView(R.id.txt_recover_phone2)
    TextView txtRecoverPhone2;
    @BindView(R.id.card_view2)
    CardView cardView2;
    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.img_phone_send)
    ImageView imgPhoneSend;
    @BindView(R.id.rl_phone)
    RelativeLayout rlPhone;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passwod);
        ButterKnife.bind(this);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlEmail.setVisibility(View.VISIBLE);

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlPhone.setVisibility(View.VISIBLE);
            }
        });

        imgEmailSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgotPasswodActivity.this,VeryFyCodeActivity.class);
                startActivity(intent);
            }
        });

        imgPhoneSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgotPasswodActivity.this,VeryFyCodeActivity.class);
                startActivity(intent);
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
