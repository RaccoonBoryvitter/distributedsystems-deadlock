/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.deadlock.factories;

import com.github.redscarf.distributedsystems.deadlock.models.Conflict;
import com.github.redscarf.distributedsystems.deadlock.threads.BowerProcessorThread;

/**
 *
 * @author Pavlo
 */
public class BowerProcessorThreadFactory {
    
    public static Thread create(Conflict mainBower, Conflict secondaryBower) {
        return new Thread(new BowerProcessorThread(mainBower, secondaryBower));
    }
    
}
