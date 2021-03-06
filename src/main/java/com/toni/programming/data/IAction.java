package com.toni.programming.data;

import java.util.List;

public interface IAction {

    public void doAttack();
    public void doDefend();
    public void doEscape();
    public void doFly();
    public void doDig();
    public void doHeal();
    public void doSwim();
    public void doSleep();
    public void doEat();
    public void doWeakened();
    public Actions getCurrentActions();
    public void setCurrentActions(Actions pokeAction);

}
