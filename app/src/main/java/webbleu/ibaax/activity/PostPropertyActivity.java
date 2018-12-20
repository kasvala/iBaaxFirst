package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class PostPropertyActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.rd_sale)
    RadioButton rdSale;
    @BindView(R.id.rd_rent)
    RadioButton rdRent;
    @BindView(R.id.radioGrop)
    RadioGroup radioGrop;
    @BindView(R.id.sp_property_type)
    Spinner spPropertyType;
    @BindView(R.id.ed_title)
    EditText edTitle;
    @BindView(R.id.ed_address)
    EditText edAddress;
    @BindView(R.id.ed_location)
    EditText edLocation;
    @BindView(R.id.sp_bedroom)
    Spinner spBedroom;
    @BindView(R.id.sp_bathroom)
    Spinner spBathroom;
    @BindView(R.id.sp_area)
    Spinner spArea;
    @BindView(R.id.ed_area)
    EditText edArea;
    @BindView(R.id.ed_prize)
    EditText edPrize;
    @BindView(R.id.btn_next_account)
    CircleButton btnNextAccount;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_property);
        ButterKnife.bind(this);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        btnNextAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(PostPropertyActivity.this,PropertyPhotoAndVideo.class);
                startActivity(in);
            }
        });

    }
}
