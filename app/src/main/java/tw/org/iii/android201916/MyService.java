package tw.org.iii.android201916;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    private LocalBinder binder = new LocalBinder();

    public class LocalBinder extends Binder {
        public MyService getService(){
            return MyService.this;
        }
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
