package com.example.makemon.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.util.Log
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.makemon.R
import com.example.makemon.ui.splash.SplashActivity
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import okhttp3.internal.notify
import java.net.URL

class FirebaseService : FirebaseMessagingService() {

    companion object {
        private const val CHANNEL_ID = "fcm_message_service_channel" // 임의의 채널 ID
        private const val CHANNEL_NAME = "Makemon"
    }

    private var dataIcon : Bitmap? = null
    private var dataIconExpanded : Bitmap? = null
    private var notiIcon : Bitmap? = null

    private var intent : PendingIntent? = null

    override fun onCreate() {
        super.onCreate()

        val notificationIntent = Intent(this, SplashActivity::class.java)
        notificationIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

        intent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_MUTABLE)
    }

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

        if (message.notification == null) {
            Log.w("FCMService", "m.notification == null")

            try {
                // 썸네일 축소형 아이콘 처리
                val url = URL(message.data["imageURL"])
                dataIcon = BitmapFactory.decodeStream(url.openConnection().getInputStream())

                // 썸네일 확장형 아이콘 처리
                val url2 = URL(message.data["expandImageURL"])
                dataIconExpanded = BitmapFactory.decodeStream(url2.openConnection().getInputStream())
            } catch (e: Exception) {
                e.printStackTrace()
            }

            builder
                .setContentTitle(message.data["title"])
                .setContentText(message.data["body"])
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setLargeIcon(dataIcon)
                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(dataIconExpanded).bigLargeIcon(null))
                .setContentIntent(intent)
                // 사용자가 Noti 클릭시 자동으로 사라지게 하는 코드
                .setAutoCancel(true)
                .build()
        } else {
            Log.w("FCMService", "m.notification != null")

            try {
                val url3 = URL(message.notification!!.imageUrl.toString())
                // 썸네일 아이콘 처리
                notiIcon = BitmapFactory.decodeStream(url3.openConnection().getInputStream())
            } catch (e: Exception) {
                e.printStackTrace()
            }

            builder
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(message.notification!!.title)
                .setContentText(message.notification!!.body)
                .setLargeIcon(notiIcon)
                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(notiIcon).bigLargeIcon(null))
                /*.setStyle(NotificationCompat.DecoratedCustomViewStyle())
                .setCustomContentView(customLayout)
                .setCustomBigContentView(expandLayout)*/
                .setContentIntent(intent)
                .setAutoCancel(true)
                .build()
        }

        val notification: Notification = builder.build()
        notificationManager.notify(1, notification)

        //Note: 커스텀 Notification View 설정하는 코드
        /*.setStyle(NotificationCompat.DecoratedCustomViewStyle())
        .setCustomContentView(customLayout)
        .setCustomBigContentView(expandLayout)*/
    }
}
