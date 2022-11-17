/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.deadlock.helpers;

/**
 *
 * @author Pavlo
 */
public class ApplicationExceptionHandler {
    
    public static void handleInterruptException(InterruptedException ex) {
        Thread.currentThread().interrupt();
        System.err.println("Thread Interrupted");
        System.err.println(ex.getMessage());
    }
    
}
