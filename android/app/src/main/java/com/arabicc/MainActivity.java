package com.arabicc;

import android.os.Bundle; //here
import com.facebook.react.ReactActivity;
import org.devio.rn.splashscreen.SplashScreen; //splash

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  // here
        super.onCreate(savedInstanceState);
    }
    protected String getMainComponentName() {
        return "arabicc";
    }
}
