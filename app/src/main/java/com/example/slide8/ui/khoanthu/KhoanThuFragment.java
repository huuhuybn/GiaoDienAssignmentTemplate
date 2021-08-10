package com.example.slide8.ui.khoanthu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.slide8.R;
import com.example.slide8.adapter.ThuChiAdapter;
import com.example.slide8.model.ThuChi;
import com.example.slide8.sqlite.ThuChiSqliteHelper;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class KhoanThuFragment extends Fragment {

    private RecyclerView rvList;

    private List<ThuChi> thuChiList;

    private ThuChiSqliteHelper thuChiSqliteHelper;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_khoan_thu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvList = view.findViewById(R.id.rvList);
        thuChiSqliteHelper = new ThuChiSqliteHelper(getActivity());
        thuChiList = thuChiSqliteHelper.getListThu();

        for (int i = 0; i < 5; i++) {
            thuChiList.add(new ThuChi());
        }
        ThuChiAdapter thuChiAdapter = new ThuChiAdapter(thuChiList);
        rvList.setAdapter(thuChiAdapter);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvList.setHasFixedSize(true);

    }
}
