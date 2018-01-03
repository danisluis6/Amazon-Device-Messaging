package tutorial.learnadm.Notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import tutorial.learnadm.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link()
 */

public class NotificationUtils {

    public static void demo(Context context) {

        // Build notification
        Notification notification = new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Simple NotificationUtils")
                .setContentText("This is a test of simple notification.")
                .build();

        // Gets an instance of the Notification Manager service
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        // To post your notification to the notification bar
        notificationManager.notify(0, notification);
    }
}
