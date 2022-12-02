package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter6 extends RecyclerView.Adapter<MyViewHolder6> {

    Context context;
    List<Item6> items;

    public MyAdapter6(Context context, List<Item6> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder6 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder6(LayoutInflater.from(context).inflate(R.layout.item_view_restaurents_marseille,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder6 holder, int position) {
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
