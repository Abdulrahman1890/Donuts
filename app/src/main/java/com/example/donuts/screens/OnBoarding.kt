package com.example.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.ui.theme.DarkPinkColor
import com.example.donuts.ui.theme.Inter
import com.example.donuts.ui.theme.LightPinkColor
import com.example.donuts.ui.theme.NormalPinkColor

@Composable
fun OnBoarding() {
    val width = LocalConfiguration.current.screenWidthDp
    val height = LocalConfiguration.current.screenHeightDp
    Column (
        modifier = Modifier
            .background(LightPinkColor)
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.donuts_spalsh),
            contentDescription = "donuts",
        )

        Text(
            text = "Gonuts\nwith\nDonuts",
            color = DarkPinkColor,
            fontFamily = Inter,
            fontWeight = FontWeight.Bold,
            fontSize = 54.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = (0.083 * width).dp)
                .offset(y = (-140).dp)
        )

        Text(
            text = "Gonuts with Donuts is a Sri Lanka\ndedicated food outlets for specialize\nmanufacturing of Donuts in Colombo,\nSri Lanka.",
            color = NormalPinkColor,
            fontFamily = Inter,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
                .offset(y = (-120).dp)
        )
        Box(
            modifier = Modifier
                .offset(y = (-50).dp)
                .padding(start = 50.dp, end = 50.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(Color.White)
                .clickable {}
        ) {
            Text(
                text = "Get Started",
                color = Color.Black,
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 118.dp, vertical = 22.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewOnBoarding() {
    OnBoarding()
}