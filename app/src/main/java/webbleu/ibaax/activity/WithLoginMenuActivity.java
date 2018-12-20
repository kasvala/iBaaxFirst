package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class WithLoginMenuActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.btn_next_account)
    CircleButton btnNextAccount;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.containerView)
    FrameLayout containerView;
    @BindView(R.id.shitstuff)
    NavigationView shitstuff;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;

    ImageView img_logout, chat, notification, setting, share;
    TextView txt_username, txt_mobile, txt_email;
    @BindView(R.id.btn_add_account)
    CircleButton btnAddAccount;
    @BindView(R.id.txt_postedproperty)
    TextView txtPostedproperty;
    @BindView(R.id.txt_no_postedproperty)
    TextView txtNoPostedproperty;
    @BindView(R.id.txt_posted_requirement)
    TextView txtPostedRequirement;
    @BindView(R.id.txt_no_posted_requirements)
    TextView txtNoPostedRequirements;
    @BindView(R.id.txt_like_proprty)
    TextView txtLikeProprty;
    @BindView(R.id.txt_no_liked_property)
    TextView txtNoLikedProperty;
    @BindView(R.id.txt_estate_contact)
    TextView txtEstateContact;
    @BindView(R.id.txt_no_contacts)
    TextView txtNoContacts;
    @BindView(R.id.txt_estate_profetional)
    TextView txtEstateProfetional;
    @BindView(R.id.img_profettion)
    ImageView imgProfettion;
    @BindView(R.id.txt_estate_business)
    TextView txtEstateBusiness;
    @BindView(R.id.img_business)
    ImageView imgBusiness;
    @BindView(R.id.txt_premium_service)
    TextView txtPremiumService;
    @BindView(R.id.txt_terms)
    TextView txtTerms;
    @BindView(R.id.txt_privacy_policy)
    TextView txtPrivacyPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_login_menu);
        ButterKnife.bind(this);

        View header = shitstuff.getHeaderView(0);
        img_logout = (ImageView) header.findViewById(R.id.img_logout);
        chat = (ImageView) header.findViewById(R.id.chat);
        notification = (ImageView) header.findViewById(R.id.notification);
        setting = (ImageView) header.findViewById(R.id.setting);
        share = (ImageView) header.findViewById(R.id.share);

        txt_username = (TextView) header.findViewById(R.id.txt_username);
        txt_mobile = (TextView) header.findViewById(R.id.txt_mobile);
        txt_email = (TextView) header.findViewById(R.id.txt_email);

        img_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WithLoginMenuActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });


        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WithLoginMenuActivity.this, SettingActivity.class);
                startActivity(intent);

            }
        });


        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });

        btnNextAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WithLoginMenuActivity.this, PostPropertyDashBoard.class);
                startActivity(intent);
            }
        });
        btnAddAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WithLoginMenuActivity.this, PostPropertyDashBoard.class);
                startActivity(intent);
            }
        });
    }
}
