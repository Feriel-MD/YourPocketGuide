package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter10 extends RecyclerView.Adapter<MyViewHolder10> {

    Context context;
    List<Item10> items;

    public MyAdapter10(Context context, List<Item10> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder10 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder10(LayoutInflater.from(context).inflate(R.layout.item_view_activites_nantes,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder10 holder, int position) {
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
