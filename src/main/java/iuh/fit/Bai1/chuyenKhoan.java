/*
 * @ (#) chuyenKhoan.java        1.0     3/6/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.Bai1;

/*
 * @description
 * @author: Ho Vinh Duy
 * @date:   3/6/2025
 */
public class chuyenKhoan implements TrangThai {
    @Override
    public void quantrinhThanhToan() {
        System.out.println("Thanh toán bằng chuyển khoản");
    }

    @Override
    public void huyThanhToan() {
        System.out.println("Hủy thanh toán bằng chuyển khoản");
    }

    @Override
    public void layThongTin() {
        System.out.println("Lấy thông tin thanh toán bằng chuyển khoản");
    }
}
