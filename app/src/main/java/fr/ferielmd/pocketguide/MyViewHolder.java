package fr.ferielmd.pocketguide;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, lieuView, numView;

    @SuppressLint("CutPasteId")
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        lieuView = itemView.findViewById(R.id.lieu);
        numView = itemView.findViewById(R.id.num);
    }
}
