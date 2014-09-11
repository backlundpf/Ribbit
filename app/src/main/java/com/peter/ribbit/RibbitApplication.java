package com.peter.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by peter on 9/7/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "CcYzQ5rWyKTmFjwuLBFGjp4Qlfaw1rpMbEqksOGy", "8XoiQnfCLkdKH9NzVYM3o0OKkA7YinJHQLnVPcNL");

    }
}
