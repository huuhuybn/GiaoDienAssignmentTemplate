package com.example.slide8.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.slide8.model.ThuChi;

import java.util.ArrayList;
import java.util.List;

public class ThuChiSqliteHelper extends SQLiteOpenHelper {

    String create_table_thu_chi = "Sv tu viet";
    String create_table_loai_thu_chi = "Sv tu viet";

    public ThuChiSqliteHelper(Context context) {
        super(context, "data.sql", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_table_loai_thu_chi);
        db.execSQL(create_table_thu_chi);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<ThuChi> getListThu() {
        List<ThuChi> thuChiList = new ArrayList<>();

        // lay danh sách tiền loại THU
        String truy_van = "select * from tenBang where cotTien > 0";

        /* sinh viên tự viết câu lệnh truy vấn */

        return thuChiList;
    }

    public List<ThuChi> getListChi() {
        List<ThuChi> thuChiList = new ArrayList<>();

        // lay danh sách tiền loại THU
        String truy_van = "select * from tenBang where cotTien < 0";

        /* sinh viên tự viết câu lệnh truy vấn */

        return thuChiList;
    }


    public void themThuChi(ThuChi thuChi) {


    }

    public void xoaThuChi(int id) {

    }

    public void suaThuChi(ThuChi thuChi) {

    }



}
