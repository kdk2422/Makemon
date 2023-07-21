/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.wear.presentation

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract.EXTRA_EVENT_ID
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.wear.presentation.theme.MakemonTheme

import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.NotificationCompat.WearableExtender

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WearApp("Android")
        }
    }
}

@Composable
fun WearApp(greetingName: String) {
    MakemonTheme {
        /* If you have enough items in your list, use [ScalingLazyColumn] which is an optimized
         * version of LazyColumn for wear devices with some added features. For more information,
         * see d.android.com/wear/compose.
         */
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(MaterialTheme.colors.onBackground),
            verticalArrangement = Arrangement.Center,
        ) {
            TextTest()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.onBackground),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ButtonWithColor()
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.onBackground),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ButtonWithColorTwo()
            }
        }
    }
}

@Preview
@Composable
fun ButtonWithColor() {
    // Compose Context 얻는 코드
    val context = LocalContext.current

    var defaultLVolume = 10

    Button(
        onClick = { Toast.makeText(context, "APT ON", Toast.LENGTH_SHORT).show() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        modifier = Modifier.size(50.dp, 50.dp)
    )
    {
        Text(text = "ON", color = Color.White, textAlign = TextAlign.Center)
    }

    Button(
        onClick = {
            if (defaultLVolume >= 10) {
                return@Button
            } else {
                defaultLVolume++
                Toast.makeText(context, "$defaultLVolume", Toast.LENGTH_SHORT).show()
            }
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        modifier = Modifier.size(50.dp, 50.dp)
    )
    {
        Text(text = "L+", color = Color.White, textAlign = TextAlign.Center)
    }

    Button(
        onClick = {
            if (defaultLVolume <= 0) {
                return@Button
            } else {
                defaultLVolume--
                Toast.makeText(context, "$defaultLVolume", Toast.LENGTH_SHORT).show()
            }
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        modifier = Modifier.size(50.dp, 50.dp)
    )
    {
        Text(text = "L-", color = Color.White, textAlign = TextAlign.Center)
    }
}

@Preview
@Composable
fun ButtonWithColorTwo() {
    // Compose Context 얻는 코드
    val context = LocalContext.current

    var defaultRVolume = 10

    Button(
        onClick = { Toast.makeText(context, "APT OFF", Toast.LENGTH_SHORT).show() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        modifier = Modifier.size(50.dp, 50.dp)
    )
    {
        Text(text = "OFF", color = Color.White, textAlign = TextAlign.Center)
    }

    Button(
        onClick = {
            if (defaultRVolume >= 10) {
                return@Button
            } else {
                defaultRVolume++
                Toast.makeText(context, "$defaultRVolume", Toast.LENGTH_SHORT).show()
            }
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        modifier = Modifier.size(50.dp, 50.dp)
    )
    {
        Text(text = "R+", color = Color.White, textAlign = TextAlign.Center)
    }

    Button(
        onClick = {
            if (defaultRVolume <= 0) {
                return@Button
            } else {
                defaultRVolume--
                Toast.makeText(context, "$defaultRVolume", Toast.LENGTH_SHORT).show()
            }
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
        modifier = Modifier.size(50.dp, 50.dp)
    )
    {
        Text(text = "R-", color = Color.White, textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun TextTest() {
    val offset = Offset(0.5f, 10.0f)
    Text(
        text = "Control Page",
        color = Color.Black,
        style = TextStyle(
            fontSize = 12.sp,
            /*shadow = Shadow(
                color = Color.Gray,
                offset = offset,
                blurRadius = 2f
            )*/
        ),
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth(),
        maxLines = 1
    )
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp("Preview Android")
}