package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter12 extends RecyclerView.Adapter<MyViewHolder12> {

    Context context;
    List<Item12> items;

    public MyAdapter12(Context context, List<Item12> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder12 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder12(LayoutInflater.from(context).inflate(R.layout.item_view_restaurents_toulouse,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder12 holder, int position) {
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
