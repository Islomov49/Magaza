package basc.magaza;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

/**
 * Created by root on 7/7/16.
 */
public class MyApplication extends com.activeandroid.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Configuration dbConfiguration = new Configuration.Builder(this).setDatabaseName("shop.db").create();
        ActiveAndroid.initialize(dbConfiguration);
    }
}
