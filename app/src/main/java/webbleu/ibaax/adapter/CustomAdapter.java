package webbleu.ibaax.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import webbleu.ibaax.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyHolder>{
    Context context;
    String[] facingdtaa;
    public CustomAdapter(Context applicationContext, String[] facingdtaa) {
        context=applicationContext;
        this.facingdtaa=facingdtaa;
    }

    @NonNull
    @Override
    public CustomAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyHolder holder, int position) {
        holder.checkBox.setText(facingdtaa[position]);

    }

    @Override
    public int getItemCount() {
        return facingdtaa.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        CheckBox checkBox;
        public MyHolder(View itemView) {
            super(itemView);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.ln);
            checkBox=(CheckBox)itemView.findViewById(R.id.checkBox);
        }
    }
}
