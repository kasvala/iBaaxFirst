package webbleu.ibaax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;

public class MenuWithoutLogin extends AppCompatActivity {

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
    @BindView(R.id.fb)
    ImageView fb;
    @BindView(R.id.twitter)
    ImageView twitter;
    @BindView(R.id.google)
    ImageView google;
    @BindView(R.id.ln_share)
    LinearLayout lnShare;
    @BindView(R.id.navMenu1)
    RelativeLayout navMenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_without_login);
        ButterKnife.bind(this);


        View header = shitstuff.getHeaderView(0);
        Button btn_getStart = (Button) header.findViewById(R.id.btn_getStart);
        Button btn_signin = (Button) header.findViewById(R.id.btn_signin);

        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });

        btn_getStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuWithoutLogin.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuWithoutLogin.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnNextAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuWithoutLogin.this, AccessDataSCreen.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
