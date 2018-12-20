package webbleu.ibaax.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.*;

import at.markushi.ui.CircleButton;
import webbleu.ibaax.R;

public class AccountSetUpActivity extends AppCompatActivity {

    CircleButton btn_next;
    ImageView back;

    RadioButton rd_business_profile,rd_profetional_profile,rd_general;
    RadioGroup radioGrop;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_set_up);
        btn_next=(CircleButton)findViewById(R.id.btn_next_account);
        back=(ImageView)findViewById(R.id.img_back);
        radioGrop=(RadioGroup)findViewById(R.id.radioGrop);
        rd_business_profile=(RadioButton)findViewById(R.id.rd_business_profile);
        rd_profetional_profile=(RadioButton)findViewById(R.id.rd_profetional_profile);
        rd_general=(RadioButton)findViewById(R.id.rd_general);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });






        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGrop.getCheckedRadioButtonId()){

                    case R.id.rd_general:
                        Intent in=new Intent(AccountSetUpActivity.this,GeneralAccountSetup.class);
                        startActivity(in);
                        break;

                    case R.id.rd_business_profile:
                        break;

                    case R.id.rd_profetional_profile:
                        break;
                }
            }
        });
    }
}
