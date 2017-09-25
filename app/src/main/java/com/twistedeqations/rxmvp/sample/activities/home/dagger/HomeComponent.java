package com.twistedeqations.rxmvp.sample.activities.home.dagger;

import com.twistedeqations.rxmvp.sample.activities.home.MainActivity;
import com.twistedeqations.rxmvp.sample.app.dagger.AppComponent;

import dagger.Component;

@HomeScope
@Component(modules = {HomeModule.class}, dependencies = AppComponent.class)
public interface HomeComponent {

    void inject(MainActivity mainActivity);

}
