package webbleu.ibaax.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import webbleu.ibaax.R;

public class SettingActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
    @BindView(R.id.txt_username)
    TextView txtUsername;
    @BindView(R.id.txt_mobile)
    TextView txtMobile;
    @BindView(R.id.txt_email)
    TextView txtEmail;
    @BindView(R.id.img_account)
    ImageView imgAccount;
    @BindView(R.id.txt_acc_setting)
    TextView txtAccSetting;
    @BindView(R.id.img_right_arrow)
    ImageView imgRightArrow;
    @BindView(R.id.rl_acc_setting)
    RelativeLayout rlAccSetting;
    @BindView(R.id.img_profession)
    ImageView imgProfession;
    @BindView(R.id.txt_profession)
    TextView txtProfession;
    @BindView(R.id.img_right_arrow2)
    ImageView imgRightArrow2;
    @BindView(R.id.rl_profession_profile)
    RelativeLayout rlProfessionProfile;
    @BindView(R.id.img_business)
    ImageView imgBusiness;
    @BindView(R.id.txt_business)
    TextView txtBusiness;
    @BindView(R.id.img_right_arrow3)
    ImageView imgRightArrow3;
    @BindView(R.id.rl_business_profile)
    RelativeLayout rlBusinessProfile;
    @BindView(R.id.img_lng)
    ImageView imgLng;
    @BindView(R.id.txt_lng)
    TextView txtLng;
    @BindView(R.id.img_right_arrow4)
    ImageView imgRightArrow4;
    @BindView(R.id.rl_lng)
    RelativeLayout rlLng;
    @BindView(R.id.img_pswd)
    ImageView imgPswd;
    @BindView(R.id.txt_pswd)
    TextView txtPswd;
    @BindView(R.id.img_right_arrow5)
    ImageView imgRightArrow5;
    @BindView(R.id.rl_pswd)
    RelativeLayout rlPswd;
    @BindView(R.id.card_view)
    CardView cardView;
    @BindView(R.id.img_notification)
    ImageView imgNotification;
    @BindView(R.id.txt_notification)
    TextView txtNotification;
    @BindView(R.id.img_noti_switch)
    ImageView imgNotiSwitch;
    @BindView(R.id.rl_notification)
    RelativeLayout rlNotification;
    @BindView(R.id.img_sms)
    ImageView imgSms;
    @BindView(R.id.txt_sms)
    TextView txtSms;
    @BindView(R.id.img_sms_switch)
    ImageView imgSmsSwitch;
    @BindView(R.id.rl_sms)
    RelativeLayout rlSms;
    @BindView(R.id.img_email)
    ImageView imgEmail;
    @BindView(R.id.txt_emailsub)
    TextView txtEmailsub;
    @BindView(R.id.img_email_switch)
    ImageView imgEmailSwitch;
    @BindView(R.id.rl_email)
    RelativeLayout rlEmail;
    @BindView(R.id.card_view2)
    CardView cardView2;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
