package com.yobombel.designpatterns.Observer.structure;

public interface Subject {

    void addObserver();
    void removeObserver();
    void notifyObservers();

}
