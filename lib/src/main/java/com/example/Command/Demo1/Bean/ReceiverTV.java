package com.example.Command.Demo1.Bean;

import com.example.Command.Demo1.Interface.IReceiver;

/**
 * Created by camdora on 17-12-15.
 */

public class ReceiverTV implements IReceiver {

    @Override
    public void actionOpen() {
        System.out.println("OPEN TV.");
    }

    @Override
    public void actionClose() {
        System.out.println("CLOSE TV.");
    }

    @Override
    public void actionChange() {
        System.out.println("CHANGE TV.");
    }
}
