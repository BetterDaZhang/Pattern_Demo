package com.example.Adapter.Demo1.Mode;

import com.example.Adapter.Demo1.Adapter.TurkeyAdapter;
import com.example.Adapter.Demo1.Bean.WildTurkey;
import com.example.Adapter.Demo1.Interface.Turkey;

/**
 * Created by camdora on 17-12-18.
 */

public class AdapterMode {
    public static void adapterPlatform(){
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
