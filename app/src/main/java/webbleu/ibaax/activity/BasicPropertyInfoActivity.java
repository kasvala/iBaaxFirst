package webbleu.ibaax.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;
import webbleu.ibaax.adapter.ContactData;
import webbleu.ibaax.adapter.CustomAdapter;
import webbleu.ibaax.model.PhotoData;

public class BasicPropertyInfoActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.txt_instant_offer)
    TextView txtInstantOffer;
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
    @BindView(R.id.txt_des)
    TextView txtDes;
    @BindView(R.id.txt_des1)
    TextView txtDes1;
    @BindView(R.id.txt_des2)
    TextView txtDes2;
    @BindView(R.id.txt_des3)
    TextView txtDes3;
    @BindView(R.id.calendar)
    CalendarView calendar;
    @BindView(R.id.txt_date1)
    TextView txtDate1;
    @BindView(R.id.txt_time1)
    TextView txtTime1;
    @BindView(R.id.btn_booknow1)
    Button btnBooknow1;
    @BindView(R.id.txt_date2)
    TextView txtDate2;
    @BindView(R.id.txt_time2)
    TextView txtTime2;
    @BindView(R.id.btn_booknow2)
    Button btnBooknow2;
    @BindView(R.id.rec_indoor)
    RecyclerView recIndoor;
    @BindView(R.id.rec_outdoor)
    RecyclerView recOutdoor;
    @BindView(R.id.rec_propertyFacing)
    RecyclerView recPropertyFacing;
    @BindView(R.id.ed_surr1)
    EditText edSurr1;
    @BindView(R.id.ed_surr2)
    EditText edSurr2;
    @BindView(R.id.ed_surr3)
    EditText edSurr3;
    @BindView(R.id.ed_surr4)
    EditText edSurr4;
    @BindView(R.id.ed_price1)
    EditText edPrice1;
    @BindView(R.id.ed_price2)
    EditText edPrice2;
    @BindView(R.id.ed_price3)
    EditText edPrice3;
    @BindView(R.id.ed_price4)
    EditText edPrice4;


    private static final String[] indoor = new String[]{
            " City view", "Park view", "Gymnasium", "Gaurd Room", "Wi-Fi Connectivity", "Gymnasium", "Value Name", "Value Name", "Value Name", "Value Name"
    };
    private static final String[] oudoor = new String[]{
            " City view", "Park view", "Gymnasium", "Gaurd Room", "Wi-Fi Connectivity", "Gymnasium", "Value Name", "Value Name", "Value Name", "Value Name"
    };
    private static final String[] facingdtaa = new String[]{
            " City view", "Park view", "Gymnasium", "Gaurd Room", "Wi-Fi Connectivity", "Gymnasium", "Value Name", "Value Name", "Value Name", "Value Name"
    };

    @BindView(R.id.rec_contactinfo)
    RecyclerView recContactinfo;
    @BindView(R.id.btn_publish_property)
    Button btnPublishProperty;
    @BindView(R.id.btn_unpublish)
    Button btnUnpublish;

   ContactAdpter contactAdpter;
    ArrayList<ContactData> contactlist = new ArrayList<>();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_property_info);
        ButterKnife.bind(this);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        txtTitle.setText(getResources().getString(R.string.basice_property_info));

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), indoor);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recIndoor.setLayoutManager(layoutManager);
        recIndoor.setItemAnimator(new DefaultItemAnimator());
        recIndoor.setAdapter(adapter);

        CustomAdapter adapter1 = new CustomAdapter(getApplicationContext(), oudoor);
        GridLayoutManager layoutManager1 = new GridLayoutManager(getApplicationContext(), 2);
        recOutdoor.setLayoutManager(layoutManager1);
        recOutdoor.setItemAnimator(new DefaultItemAnimator());
        recOutdoor.setAdapter(adapter1);

        CustomAdapter adapter2 = new CustomAdapter(getApplicationContext(), facingdtaa);
        GridLayoutManager layoutManager2 = new GridLayoutManager(getApplicationContext(), 2);
        recPropertyFacing.setLayoutManager(layoutManager2);
        recPropertyFacing.setItemAnimator(new DefaultItemAnimator());
        recPropertyFacing.setAdapter(adapter2);

        contactAdpter = new ContactAdpter(getApplicationContext(), contactlist);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recContactinfo.setLayoutManager(layoutManager3);
        recContactinfo.setItemAnimator(new DefaultItemAnimator());
        recContactinfo.setAdapter(contactAdpter);


        btnPublishProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BasicPropertyInfoActivity.this,MakeFeturedActivity.class);
                startActivity(intent);
            }
        });
    }


    //===========================================================================================================================
    private class ContactAdpter extends RecyclerView.Adapter<ContactAdpter.Myholder> {
        Context context;
        ArrayList<ContactData> contactlist;
        public ContactAdpter(Context applicationContext, ArrayList<ContactData> contactlist) {
            context=applicationContext;
            this.contactlist=contactlist;
        }

        @NonNull
        @Override
        public ContactAdpter.Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_contact_detail, parent, false);
            return new Myholder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ContactAdpter.Myholder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 2;
        }

        public class Myholder extends RecyclerView.ViewHolder {
            public Myholder(View itemView) {
                super(itemView);
            }
        }
    }
}
