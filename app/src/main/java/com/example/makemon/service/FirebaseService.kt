package com.example.makemon.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.util.Log
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.makemon.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import java.net.URL

class FirebaseService : FirebaseMessagingService() {

    companion object {
        private const val CHANNEL_ID = "fcm_message_service_channel" // 임의의 채널 ID
        private const val CHANNEL_NAME = "Makemon"
    }

    private var icon : Bitmap? = null

    private var intent : PendingIntent? = null

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("FirebaseService", "onNewToken:: FCM Token: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.w("FirebaseService", "onMessageReceived:: $message")

//        val customLayout: RemoteViews = RemoteViews(packageName, R.layout.test_notification)
//        val expandLayout: RemoteViews = RemoteViews(packageName, R.layout.test_notification_expanded)

        val notificationManager: NotificationManagerCompat = NotificationManagerCompat.from(this)

        val builder: NotificationCompat.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (notificationManager.getNotificationChannel(CHANNEL_ID) == null) {
                val channel = NotificationChannel(
                    CHANNEL_ID,
                    CHANNEL_NAME,
                    NotificationManager.IMPORTANCE_DEFAULT
                )
                notificationManager.createNotificationChannel(channel)
            }
            NotificationCompat.Builder(this, CHANNEL_ID)
        } else {
            NotificationCompat.Builder(this)
        }

        // message notification
        Log.w("FirebaseService", "Message Notification Title:: ${message.notification!!.title}")
        Log.w("FirebaseService", "Message Notification Body:: ${message.notification!!.body}")
        Log.w("FirebaseService", "Message Notification imageUrl:: ${message.notification!!.imageUrl}")

        // message data
        Log.w("FirebaseService", "Message data Title:: ${message.data["Title"]}")
        Log.w("FirebaseService", "Message data Body:: ${message.data["Contents"]}")
        Log.w("FirebaseService", "Message data imageUrl:: ${message.data["ImageUrl"]}")

        //아이콘 처리
        try {
            val url = URL(message.notification!!.imageUrl.toString())
            icon = BitmapFactory.decodeStream(url.openConnection().getInputStream())
        } catch (e: Exception) {
            e.printStackTrace()
        }

        builder
            .setContentTitle(message.notification!!.title)
            .setContentText(message.notification!!.body)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setLargeIcon(icon)
            .setStyle(NotificationCompat.BigPictureStyle().bigPicture(icon))
            .setAutoCancel(true)
            .build()

        val notification: Notification = builder.build()
        notificationManager.notify(1, notification)

        //Note: 커스텀 Notification View 설정하는 코드
        /*.setStyle(NotificationCompat.DecoratedCustomViewStyle())
        .setCustomContentView(customLayout)
        .setCustomBigContentView(expandLayout)*/
    }
}
