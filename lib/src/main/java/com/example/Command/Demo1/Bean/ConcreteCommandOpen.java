package com.example.Command.Demo1.Bean;

import com.example.Command.Demo1.Interface.ICommand;
import com.example.Command.Demo1.Interface.IReceiver;

/**
 * Created by camdora on 17-12-15.
 */

public class ConcreteCommandOpen implements ICommand{

    private IReceiver receiveAction;

    public ConcreteCommandOpen(IReceiver receiveAction) {
        this.receiveAction = receiveAction;
    }

    @Override
    public void execute() {
        receiveAction.actionOpen();
    }
}
