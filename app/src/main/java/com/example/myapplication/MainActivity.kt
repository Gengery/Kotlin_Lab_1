package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center) {
                MeetName()
            }
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomCenter) {
                MeetFooter()
            }
        }
    }
}

@Composable
fun MeetName() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 120.dp)) {
        Image(ImageBitmap.imageResource(R.drawable.android_logo),
            contentDescription = "",
            modifier = Modifier.background(Color.Black)
                .width(200.dp)
                .border(width = 4.dp, Color.Gray))
        Text("Кузнецов",
            fontSize = 25.sp,
            modifier = Modifier.padding(top = 20.dp),
            fontFamily = FontFamily.Serif)
        Text("Никита",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif)
        Text("Валерьевич",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif)
        Text("Android Developer",
            fontSize = 25.sp,
            color = Color.Gray,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 10.dp))
    }
}

@Composable
fun MeetFooter() {
    Column(verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 20.dp)) {
        Row {
            Icon(Icons.Filled.Call,
                contentDescription = "Phone number")
            Text(" +7 937 111 56 42",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                lineHeight = 30.sp)
        }
        Row {
            Icon(Icons.Filled.Share,
                contentDescription = "Github")
            Text(" @Gengery",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                lineHeight = 30.sp)
        }
        Row {
            Icon(Icons.Filled.Email,
                contentDescription = "Email")
            Text(" kuzhechik978@gmail.com",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                lineHeight = 30.sp)
        }
    }
}