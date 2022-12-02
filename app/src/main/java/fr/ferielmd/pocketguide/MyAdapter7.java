package fr.ferielmd.pocketguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter7 extends RecyclerView.Adapter<MyViewHolder7> {

    Context context;
    List<Item7> items;

    public MyAdapter7(Context context, List<Item7> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder7 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder7(LayoutInflater.from(context).inflate(R.layout.item_view_activites_marseille,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder7 holder, int position) {
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
