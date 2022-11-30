package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter5 extends RecyclerView.Adapter<MyViewHolder5>{

    Context context;
    List<Item5> items;

    public MyAdapter5(Context context, List<Item5> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder5 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder5(LayoutInflater.from(context).inflate(R.layout.item_view_hebergement_lyon,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder5 holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.lieuView.setText(items.get(position).getLieu());
        holder.numView.setText(items.get(position).getNum());
        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
