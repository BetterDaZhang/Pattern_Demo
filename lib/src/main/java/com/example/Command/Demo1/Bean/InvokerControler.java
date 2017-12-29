package com.example.Command.Demo1.Bean;

import com.example.Command.Demo1.Interface.ICommand;
import com.example.Command.Demo1.Interface.IInvoker;

/**
 * Created by camdora on 17-12-15.
 */

public class InvokerControler implements IInvoker {
    private ICommand command;

    public InvokerControler() {
    }

    @Override
    public void addCommand(ICommand command) {
        this.command = command;
    }

    @Override
    public void runCommand() {
        command.execute();
    }
}
