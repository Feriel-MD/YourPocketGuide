package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter13 extends RecyclerView.Adapter<MyViewHolder13> {

    Context context;
    List<Item13> items;

    public MyAdapter13(Context context, List<Item13> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder13 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder13(LayoutInflater.from(context).inflate(R.layout.item_view_activites_toulouse,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder13 holder, int position) {
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
