/*
 * @ (#) DonHang.java        1.0     3/6/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.Bai1;

/*
 * @description
 * @author: Ho Vinh Duy
 * @date:   3/6/2025
 */
public class DonHang {
    private TrangThai trangThai;

    public DonHang(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public void thanhToan() {
        trangThai.quantrinhThanhToan();
    }

    public void huyThanhToan() {
        trangThai.huyThanhToan();
    }

    public void layThongTin() {
        trangThai.layThongTin();
    }

    public static void main(String[] args) {
        DonHang donHang = new DonHang(new chuyenKhoan());
        donHang.thanhToan();
        donHang.huyThanhToan();
        donHang.layThongTin();

        donHang.setTrangThai(new tienMat());
        donHang.thanhToan();
        donHang.huyThanhToan();
        donHang.layThongTin();

        donHang.setTrangThai(new moMo());
        donHang.thanhToan();
        donHang.huyThanhToan();
        donHang.layThongTin();
    }
}
