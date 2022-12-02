package fr.ferielmd.pocketguide;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder7 extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, lieuView, numView;


    public MyViewHolder7(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        lieuView = itemView.findViewById(R.id.lieu);
        numView = itemView.findViewById(R.id.num);
    }
}
