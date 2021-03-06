package com.evan.pattern.observer.version2;

/**
 * Created by wangzhen318 on 2017/5/10.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
