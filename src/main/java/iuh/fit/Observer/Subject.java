/*
 * @ (#) Subject.java        1.0     3/13/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.observer;

/*
 * @description
 * @author: Ho Vinh Duy
 * @date:   3/13/2025
 */
public interface Subject {
    void registerObserver(Subsciber observer, String coPhieu);
    void removeObserver(Subsciber observer, String coPhieu);
    void notifyObservers(String coPhieu);
}
