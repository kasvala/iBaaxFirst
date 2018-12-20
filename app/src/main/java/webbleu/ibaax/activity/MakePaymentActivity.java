package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class MakePaymentActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.rd_card)
    RadioButton rdCard;
    @BindView(R.id.rd_paypal)
    RadioButton rdPaypal;
    @BindView(R.id.radioGrop)
    RadioGroup radioGrop;
    @BindView(R.id.master_icon)
    ImageView masterIcon;
    @BindView(R.id.ed_card_no)
    EditText edCardNo;
    @BindView(R.id.ed_cvc_no)
    EditText edCvcNo;
    @BindView(R.id.ed_expdate)
    EditText edExpdate;
    @BindView(R.id.btn_paynow)
    Button btnPaynow;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent in=new Intent(MakePaymentActivity.this,WithLoginMenuActivity.class);
        in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(in);
        finishAffinity();
        finish();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment);
        ButterKnife.bind(this);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        txtTitle.setText(getResources().getString(R.string.make_payment));


        btnPaynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MakePaymentActivity.this,ThankYouActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
