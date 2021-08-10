package com.example.slide8.model;

// thể hiện khoản thu hoặc chi
public class ThuChi {
    public String tieuDe;
    // soTien > 0 thì là Thu, < 0 thì là Chi
    public float soTien;
    public String ngayThang;
    public String noiDung;

    // thể hiện ThuChi là Thu hay Chi
    public String thuOrChi;

    // khóa ngoại
    public int loaiThuChiID;
}
