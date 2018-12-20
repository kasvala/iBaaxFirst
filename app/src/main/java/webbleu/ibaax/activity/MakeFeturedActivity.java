package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class MakeFeturedActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.txt_property_title)
    TextView txtPropertyTitle;
    @BindView(R.id.txt_property_location)
    TextView txtPropertyLocation;
    @BindView(R.id.img_sq_ft)
    ImageView imgSqFt;
    @BindView(R.id.txt_sq_ft)
    TextView txtSqFt;
    @BindView(R.id.img_bed)
    ImageView imgBed;
    @BindView(R.id.txt_no_bed)
    TextView txtNoBed;
    @BindView(R.id.img_bath)
    ImageView imgBath;
    @BindView(R.id.txt_no_bath)
    TextView txtNoBath;
    @BindView(R.id.card_view)
    CardView cardView;
    @BindView(R.id.btn_payment)
    Button btnPayment;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_fetured);
        ButterKnife.bind(this);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        txtTitle.setText(getResources().getString(R.string.make_feture));
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MakeFeturedActivity.this,MakePaymentActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

}
