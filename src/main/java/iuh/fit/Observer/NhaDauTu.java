/*
 * @ (#) NhaDauTu.java        1.0     3/13/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.observer;

/*
 * @description
 * @author: Ho Vinh Duy
 * @date:   3/13/2025
 */
public class NhaDauTu implements Subsciber {
    private String tenNhaDauTu;

    public NhaDauTu(String tenNhaDauTu) {
        this.tenNhaDauTu = tenNhaDauTu;
    }

    @Override
    public void update(String coPhieu, double giaMoi, double giaCu) {
        System.out.println("Nha dau tu " + tenNhaDauTu + " nhan duoc thong bao gia co phieu " + coPhieu + " thay doi tu " + giaCu + " len " + giaMoi);
    }
}
