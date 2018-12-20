package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class PostPropertyDashBoard extends AppCompatActivity{

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.rd_post_property)
    RadioButton rdPostProperty;
    @BindView(R.id.rd_post_requirement)
    RadioButton rdPostRequirement;
    @BindView(R.id.rd_real_estate_service)
    RadioButton rdRealEstateService;
    @BindView(R.id.radioGrop)
    RadioGroup radioGrop;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_property_dash_board);
        ButterKnife.bind(this);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        radioGrop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){

                    case R.id.rd_post_property:
                        Intent in=new Intent(PostPropertyDashBoard.this,PostPropertyActivity.class);
                        startActivity(in);
                        break;

                    case R.id.rd_post_requirement:
                        break;

                    case R.id.rd_real_estate_service:
                        break;
                }
            }
        });
    }
}
