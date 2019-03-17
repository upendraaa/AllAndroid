package interview.upendra.com.interviewtest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by upendra on 12/03/19.
 */


/**Three type of Services
 * STICKY_SERVICE   This will start automatically when resources are available, while automatically restart
 *                  it will get Intent as Null, So if we are not worrying about the State of kill time. Like music player
 * NONSTICKY_SERVICE   Service are not explicty managed, Service can start and stop self (Alarm service, server data polling)
 *
 * RE_DELIVERED_INTENT  Service are explicity managed, and start from the last state, like file download
 *
 * only relevant when the phone runs out of memory and kills the service before it finishes executing.
 * START_STICKY tells the OS to recreate the service after it has enough memory and call onStartCommand() again with a null intent.
 * START_NOT_STICKY tells the OS to not bother recreating the service again. There is also a
 * third code START_REDELIVER_INTENT that tells the OS to recreate the service and redeliver the same intent to onStartCommand()
 *
 *Bound Service: Bound service can be started service, When there is Consistent and frequent communicatin between
 *               Client (Activity, Fragment or any other component) and Server (Service) (mitchabian bound service MVVM
 *
 *               //https://www.youtube.com/watch?v=_xNkVNaC9AI
 *
 *
 * Started Service:
 *
 */

public class ExampleService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
