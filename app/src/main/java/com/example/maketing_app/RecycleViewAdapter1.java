package com.example.maketing_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.util.List;

public class RecycleViewAdapter1 extends RecyclerView.Adapter<RecycleViewAdapter1.MyViewHolder1> {
    Context context;
    List<Contact1> data;

    public RecycleViewAdapter1(Context context, List<Contact1> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        MyViewHolder1 viewHolder1=new MyViewHolder1(v);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 holder, @SuppressLint("RecyclerView") int position) {

        holder.tv_name.setText(data.get(position).getName());
        holder.img.setImageResource(data.get(position).getPhoto());
        holder.detail.setText(data.get(position).getDetail());

        holder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,News_Details.class);
                intent.putExtra("title",data.get(position).getName());
                intent.putExtra("img",data.get(position).getPhoto());
                intent.putExtra("detail",data.get(position).getDetail());
                context.startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public  static class MyViewHolder1 extends RecyclerView.ViewHolder implements OnClickListener {
        private TextView tv_name,detail;
        private ImageView img;

        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            img = (ImageView) itemView.findViewById(R.id.image_contact);
            detail=(TextView) itemView.findViewById(R.id.detail);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            Toast.makeText(itemView.getContext(), "Test Click"+position, Toast.LENGTH_SHORT).show();

        }
    }
}
