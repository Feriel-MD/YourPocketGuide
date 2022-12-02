package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter9 extends RecyclerView.Adapter<MyViewHolder9> {

    Context context;
    List<Item9> items;

    public MyAdapter9(Context context, List<Item9> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder9 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder9(LayoutInflater.from(context).inflate(R.layout.item_view_restaurents_nantes,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder9 holder, int position) {
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
