package webbleu.ibaax.activity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;
import webbleu.ibaax.adapter.CustomAdapter;

public class PropertyAmenities extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.rec_indoor)
    RecyclerView recIndoor;
    @BindView(R.id.rec_outdoor)
    RecyclerView recOutdoor;
    @BindView(R.id.rec_propertyFacing)
    RecyclerView recPropertyFacing;

    private static final String[] indoor = new String[]{
            " City view", "Gymnasium", "Wi-Fi Connectivity", "Value Name", "Value Name"
    };
    private static final String[] oudoor = new String[]{
            " City view", "Gymnasium", "Wi-Fi Connectivity", "Value Name", "Value Name"
    };
    private static final String[] facingdtaa = new String[]{
            " City view", "Gymnasium", "Wi-Fi Connectivity", "Value Name", "Value Name"};
    @BindView(R.id.ed_surr1)
    EditText edSurr1;
    @BindView(R.id.ed_surr2)
    EditText edSurr2;
    @BindView(R.id.ed_surr3)
    EditText edSurr3;
    @BindView(R.id.ed_price1)
    EditText edPrice1;
    @BindView(R.id.ed_price2)
    EditText edPrice2;
    @BindView(R.id.ed_price3)
    EditText edPrice3;
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
        setContentView(R.layout.activity_property_amenities);
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
                Intent intent=new Intent(PropertyAmenities.this,OwnerOrSalesContact.class);
                startActivity(intent);
            }
        });

        txtTitle.setText(getResources().getString(R.string.amenities));

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), indoor);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recIndoor.setLayoutManager(layoutManager);
        recIndoor.setItemAnimator(new DefaultItemAnimator());
        recIndoor.setAdapter(adapter);

        CustomAdapter adapter1 = new CustomAdapter(getApplicationContext(), oudoor);
        GridLayoutManager layoutManager1 = new GridLayoutManager(getApplicationContext(), 1);
        recOutdoor.setLayoutManager(layoutManager1);
        recOutdoor.setItemAnimator(new DefaultItemAnimator());
        recOutdoor.setAdapter(adapter1);

        CustomAdapter adapter2 = new CustomAdapter(getApplicationContext(), facingdtaa);
        GridLayoutManager layoutManager2 = new GridLayoutManager(getApplicationContext(), 1);
        recPropertyFacing.setLayoutManager(layoutManager2);
        recPropertyFacing.setItemAnimator(new DefaultItemAnimator());
        recPropertyFacing.setAdapter(adapter2);
    }
}
