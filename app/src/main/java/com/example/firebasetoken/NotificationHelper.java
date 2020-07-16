package com.example.firebasetoken;

import android.app.Notification;
import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationHelper {
    public static void DisplayNotification(Context context,String title,String body) {
        // Create notification use the notification builder class
        // set the notification title and as well as icon
        NotificationCompat.Builder mybulider = new NotificationCompat.Builder(context, MainActivity.channel_id)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);


        NotificationManagerCompat notiMgr = NotificationManagerCompat.from(context);
        // two parameter notification id it use later delete or update notification
        //
        notiMgr.notify(1, mybulider.build());

    }

}
