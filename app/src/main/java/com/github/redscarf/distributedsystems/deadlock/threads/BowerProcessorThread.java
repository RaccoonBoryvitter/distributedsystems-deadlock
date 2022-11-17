/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.deadlock.threads;

import com.github.redscarf.distributedsystems.deadlock.models.Conflict;

/**
 *
 * @author Pavlo
 */
public class BowerProcessorThread implements Runnable {

    private final Conflict mainBower;
    private final Conflict secondaryBower;
    
    public BowerProcessorThread(Conflict mainBower, Conflict secondaryBower) {
        this.mainBower = mainBower;
        this.secondaryBower = secondaryBower;
    }
    
    @Override
    public void run() {
        mainBower.bow(secondaryBower);
    }
    
}
