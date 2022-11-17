/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.deadlock.models;

import com.github.redscarf.distributedsystems.deadlock.helpers.ApplicationExceptionHandler;

/**
 *
 * @author Pavlo
 */
public class Conflict {

    private final String name;
    private static boolean isBusy = false;

    public Conflict(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void bow(Conflict bower) {
        while (isBusy) {
            try {
                System.out.format(">>> [%s] Waiting for execution of "
                        + "other synchronized instructions "
                        + "in bow() method for \"%s\"%n", 
                        Thread.currentThread().getName(), this.getName());
                wait();
            } catch (InterruptedException ex) {
                ApplicationExceptionHandler.handleInterruptException(ex);
            }
        }

        isBusy = true;
        notifyAll();

        System.out.format("%s: %s"
                + " passing me through!%n",
                this.name, bower.getName());
        bower.bowBack(this);
    }

    public synchronized void bowBack(Conflict bower) {
        while (!isBusy) {
            try {
                System.out.format(">>> [%s] Waiting for execution of "
                        + "other synchronized instructions "
                        + "in bowBack() method for \"%s\"%n", 
                        Thread.currentThread().getName(), this.getName());
                wait();
            } catch (InterruptedException ex) {
                ApplicationExceptionHandler.handleInterruptException(ex);
            }
        }

        isBusy = false;
        notifyAll();

        System.out.format("%s: %s"
                + " passing me through too!%n",
                this.name, bower.getName());
        System.out.println();
    }
}
