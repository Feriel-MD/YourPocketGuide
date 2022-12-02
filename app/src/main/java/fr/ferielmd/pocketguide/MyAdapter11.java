package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter11 extends RecyclerView.Adapter<MyViewHolder11> {

    Context context;
    List<Item11> items;

    public MyAdapter11(Context context, List<Item11> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder11 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder11(LayoutInflater.from(context).inflate(R.layout.item_view_hebergement_nantes,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder11 holder, int position) {
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
