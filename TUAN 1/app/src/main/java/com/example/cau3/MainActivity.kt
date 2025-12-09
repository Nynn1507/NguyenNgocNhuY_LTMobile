package com.example.cau3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cau3.ui.theme.Cau3Theme  // <-- CHÚ Ý CHỖ NÀY

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cau3Theme {      // <-- ĐỔI LẠI APP THEME
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F7F9))
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "Back",
            modifier = Modifier
                .padding(20.dp)
                .size(36.dp)
                .align(Alignment.TopStart)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = "Menu",
            modifier = Modifier
                .padding(20.dp)
                .size(36.dp)
                .align(Alignment.TopEnd)
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFCDE8F6))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar_sample),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Johan Smith",
                fontSize = 22.sp,
                color = Color.Black
            )

            Text(
                text = "California, USA",
                fontSize = 16.sp,
                color = Color(0xFF777777)
            )
        }
    }
}
