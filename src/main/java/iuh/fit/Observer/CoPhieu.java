/*
 * @ (#) CoPhieu.java        1.0     3/13/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.observer;

import java.util.List;

/*
 * @description
 * @author: Ho Vinh Duy
 * @date:   3/13/2025
 */
public class CoPhieu implements Subject{
    private String tenCoPhieu;
    private double giaMoi;
    private double giaCu;
    private List<Subsciber> nhaDauTu;

    public CoPhieu(String tenCoPhieu, double giaMoi, double giaCu) {
        this.tenCoPhieu = tenCoPhieu;
        this.giaMoi = giaMoi;
        this.giaCu = giaCu;
    }

    public void setGiaMoi(double giaMoi) {
        this.giaMoi = giaMoi;
        notifyObservers(tenCoPhieu);
    }

    public void registerObserver(Subsciber observer, String coPhieu) {
        nhaDauTu.add(observer);
    }

    public void removeObserver(Subsciber observer, String coPhieu) {
        nhaDauTu.remove(observer);
    }

    public void notifyObservers(String coPhieu) {
        for (Subsciber nhaDauTu : nhaDauTu) {
            nhaDauTu.update(coPhieu, giaMoi, giaCu);
        }
    }
}
