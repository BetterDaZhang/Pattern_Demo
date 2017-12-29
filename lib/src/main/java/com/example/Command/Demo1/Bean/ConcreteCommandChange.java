package com.example.Command.Demo1.Bean;

import com.example.Command.Demo1.Interface.ICommand;
import com.example.Command.Demo1.Interface.IReceiver;

/**
 * Created by camdora on 17-12-15.
 */

public class ConcreteCommandChange implements ICommand {
    private IReceiver receiveAction;

    public ConcreteCommandChange(IReceiver receiveAction) {
        this.receiveAction = receiveAction;
    }

    @Override
    public void execute() {
        receiveAction.actionChange();
    }
}
