package fr.ferielmd.pocketguide;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder1 extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, emailView;

    @SuppressLint("CutPasteId")
    public MyViewHolder1(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
    }
}
