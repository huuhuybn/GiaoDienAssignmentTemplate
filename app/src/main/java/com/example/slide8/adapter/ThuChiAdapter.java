package com.example.slide8.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;
import com.example.slide8.R;
import com.example.slide8.model.ThuChi;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ThuChiAdapter extends RecyclerView.Adapter<ThuChiHolder> {

    private List<ThuChi> thuChiList;

    public ThuChiAdapter(List<ThuChi> thuChiList) {
        this.thuChiList = thuChiList;
    }

    @NonNull
    @NotNull
    @Override
    public ThuChiHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.thu_chi, parent, false);
        return new ThuChiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ThuChiHolder holder, int position) {
        holder.bindData(thuChiList.get(position));
        holder.showPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(holder.itemView.getContext(), holder.itemView);
                popupMenu.inflate(R.menu.thu_chi);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.m_update:

                                break;

                            case R.id.m_delete:

                                //1 - xoa tren ArrayList
                                thuChiList.remove(position);
                                //2 - xoa tren csdl
                                notifyDataSetChanged();
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return thuChiList.size();
    }
}
