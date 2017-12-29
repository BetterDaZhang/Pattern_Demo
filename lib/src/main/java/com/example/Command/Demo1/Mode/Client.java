package com.example.Command.Demo1.Mode;

import com.example.Command.Demo1.Bean.ConcreteCommandOpen;
import com.example.Command.Demo1.Bean.InvokerControler;
import com.example.Command.Demo1.Bean.ReceiverTV;
import com.example.Command.Demo1.Interface.ICommand;
import com.example.Command.Demo1.Interface.IInvoker;
import com.example.Command.Demo1.Interface.IReceiver;

/**
 * Created by camdora on 17-12-15.
 */

public class Client {
    public static void clientPlatform(){
        IReceiver receiver = new ReceiverTV();
        ICommand command = new ConcreteCommandOpen(receiver);
        IInvoker invoker = new InvokerControler();
        invoker.addCommand(command);
        invoker.runCommand();
    }
}
