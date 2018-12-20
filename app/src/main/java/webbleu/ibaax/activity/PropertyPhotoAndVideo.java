package webbleu.ibaax.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import webbleu.ibaax.R;
import webbleu.ibaax.model.PhotoData;

public class PropertyPhotoAndVideo extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @BindView(R.id.img_property)
    ImageView imgProperty;
    @BindView(R.id.rl_photo_upload)
    RelativeLayout rlPhotoUpload;
    @BindView(R.id.recycler_photo)
    RecyclerView recyclerPhoto;
    @BindView(R.id.ed_vediolink)
    EditText edVediolink;

    Photoadpter adapter;
    ArrayList<PhotoData> photolist = new ArrayList<>();
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
        setContentView(R.layout.activity_property_photo_and_video);
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
                Intent in=new Intent(PropertyPhotoAndVideo.this,PropertyAmenities.class);
                startActivity(in);
            }
        });

        txtTitle.setText(getResources().getString(R.string.photo_and_video));

        adapter = new Photoadpter(getApplicationContext(), photolist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerPhoto.setLayoutManager(layoutManager);
        recyclerPhoto.setItemAnimator(new DefaultItemAnimator());
        recyclerPhoto.setAdapter(adapter);

    }


    //====================================================================================================================
    private class Photoadpter extends RecyclerView.Adapter<Photoadpter.Myholder> {
        Context context;
        ArrayList<PhotoData> photolist;

        public Photoadpter(Context applicationContext, ArrayList<PhotoData> photolist) {
            context = applicationContext;
            this.photolist = photolist;
        }

        @NonNull
        @Override
        public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_post_photo, parent, false);
            return new Myholder(v);

        }

        @Override
        public void onBindViewHolder(@NonNull Myholder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 5;
        }

        public class Myholder extends RecyclerView.ViewHolder {
            public Myholder(View itemView) {
                super(itemView);
            }
        }
    }
}
