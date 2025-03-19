/*
 * @ (#) Main.java        1.0     3/13/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.observer;

/*
 * @description
 * @author: Ho Vinh Duy
 * @date:   3/13/2025
 */
public class Main {
    public static void main(String[] args) {
        CoPhieu coPhieu = new CoPhieu("ABC", 10, 5);
        NhaDauTu nhaDauTu1 = new NhaDauTu("Nha dau tu 1");
        NhaDauTu nhaDauTu2 = new NhaDauTu("Nha dau tu 2");
        coPhieu.registerObserver(nhaDauTu1, "ABC");
        coPhieu.registerObserver(nhaDauTu2, "ABC");
        coPhieu.setGiaMoi(15);
    }
}
