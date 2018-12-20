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
import de.hdodenhof.circleimageview.CircleImageView;
import webbleu.ibaax.R;

public class OwnerOrSalesContact extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
    @BindView(R.id.txt_username)
    TextView txtUsername;
    @BindView(R.id.txt_addressline1)
    TextView txtAddressline1;
    @BindView(R.id.txt_addressline2)
    TextView txtAddressline2;
    @BindView(R.id.img_fav)
    ImageView imgFav;
    @BindView(R.id.img_share)
    ImageView imgShare;
    @BindView(R.id.img_commennt)
    ImageView imgCommennt;
    @BindView(R.id.card_view)
    CardView cardView;
    @BindView(R.id.txt_owner_contact)
    TextView txtOwnerContact;
    @BindView(R.id.txt_agent_contact)
    TextView txtBusinessProfile;
    @BindView(R.id.btn_save_and_continue)
    Button btnSaveContinue;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_or_sales_contact);
        ButterKnife.bind(this);

        txtTitle.setText(getResources().getString(R.string.owner_sales));

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        txtOwnerContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OwnerOrSalesContact.this,AddNewCOntactACtivity.class);
                intent.putExtra("type","OwnerContact");
                startActivity(intent);
            }
        });

        txtBusinessProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(OwnerOrSalesContact.this,AddNewCOntactACtivity.class);
                intent.putExtra("type","AgentContact");
                startActivity(intent);

            }
        });

        btnSaveContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OwnerOrSalesContact.this,BasicPropertyInfoActivity.class);
                startActivity(intent);
            }
        });

    }
}
