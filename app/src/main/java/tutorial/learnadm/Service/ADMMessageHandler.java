package tutorial.learnadm.Service;

import android.content.Intent;
import android.util.Log;

import com.amazon.device.messaging.ADMMessageHandlerBase;

import tutorial.learnadm.Notification.NotificationUtils;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link(https://developer.amazon.com/docs/adm/send-message.html)
 */

public class ADMMessageHandler extends ADMMessageHandlerBase
{
    public ADMMessageHandler() {
        super("ADMMessageHandler");
        // TODO Auto-generated constructor stub
    }

    public ADMMessageHandler(String className) {
        super(className);
        // TODO Auto-generated constructor stub
    }


    @Override
    protected void onMessage(final Intent intent) {

        if(intent.getExtras() != null){
            Log.i("AmazonReceiver", intent.getExtras().toString());
            NotificationUtils.demo(getApplicationContext());
        }
    }

    /**
     * We recieved our token from Amazon but now need to register it with Liz.
     * @param newRegistrationId
     */
    @Override
    protected void onRegistered(final String newRegistrationId) {
        Log.v("ADM", "Register" + newRegistrationId );
    }

    @Override
    protected void onRegistrationError(final String errorId)
    {
        // You should consider a registration error fatal. In response, your app may
        // degrade gracefully, or you may wish to notify the user that this part of
        // your app's functionality is not available.
        Log.v("ADM", "Registration Error " + errorId);
    }

    @Override
    protected void onUnregistered(final String registrationId)
    {
        // If your app is unregistered on this device, inform your server that
        // this app instance is no longer a valid target for messages.
    }

}
