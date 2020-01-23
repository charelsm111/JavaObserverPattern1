package com.charel;

interface ISubject {

    void notifyObservers();
    void register(Observer o);
    void unregister(Observer o);

}
