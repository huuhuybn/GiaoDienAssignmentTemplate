package com.example.slide8.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.slide8.R;
import com.example.slide8.model.ThuChi;
import org.jetbrains.annotations.NotNull;

public class ThuChiHolder extends RecyclerView.ViewHolder {

    public TextView tvTieuDe, tvTien, tvNgayThang;
    public View showPopUp;

    public ThuChiHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        tvTieuDe = itemView.findViewById(R.id.tvTieuDe);
        tvTien = itemView.findViewById(R.id.tvTien);
        tvNgayThang = itemView.findViewById(R.id.tvNgayThang);
        showPopUp = itemView.findViewById(R.id.showPopUp);
    }

    public void bindData(ThuChi thuChi) {
        tvTieuDe.setText(thuChi.tieuDe);
        tvTien.setText(String.valueOf(thuChi.soTien));
        tvNgayThang.setText(thuChi.ngayThang);
    }
}
