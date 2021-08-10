package com.example.slide8.model;

import java.util.Random;

// thể hiện khoản thu hoặc chi
public class ThuChi {
    public String id;
    public String tieuDe;
    // soTien > 0 thì là Thu, < 0 thì là Chi
    public float soTien;
    public String ngayThang;
    public String noiDung;

    // thể hiện ThuChi là Thu hay Chi
    public String thuOrChi;

    // khóa ngoại
    public int loaiThuChiID;

    public ThuChi() {
        id = String.valueOf(new Random().nextInt());
        tieuDe = "Hello, Tien ve1111";
        soTien = new Random(1000000).nextFloat();
        ngayThang = "20/08/2021";
        noiDung = "Cat vao quy den";
    }
}
