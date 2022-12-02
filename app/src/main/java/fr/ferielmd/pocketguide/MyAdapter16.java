package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter16 extends RecyclerView.Adapter<MyViewHolder16> {

    Context context;
    List<Item16> items;

    public MyAdapter16(Context context, List<Item16> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder16 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder16(LayoutInflater.from(context).inflate(R.layout.item_view_activites_strasbourg,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder16 holder, int position) {
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
