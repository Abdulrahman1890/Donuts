package com.example.donuts.combosable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.ui.theme.DarkPinkColor
import com.example.donuts.ui.theme.Inter

@Composable
fun DonutCard(image: Int, text: String) {
    Box(
        modifier = Modifier
            .size(width = 138.dp, height = 160.dp)
    ) {

        Box(
            modifier = Modifier
                .padding(top = 49.dp)
                .fillMaxWidth()
                .height(111.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    )
                ),
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 47.dp)
            ) {
                Text(
                    text = text,
                    color = Color.Black,
                    modifier = Modifier
                        .alpha(0.6f),
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                )
                SpacerVertical(10)
                Text(
                    text = "\$22",
                    color = DarkPinkColor,
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                )
            }

        }
        Image(
            painter = painterResource(image),
            contentDescription = "donut",
            modifier = Modifier
                .size(85.dp)
                .align(Alignment.TopCenter)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDonutCard() {
    DonutCard(image = R.drawable.choco_donut, text = "Chocolate Cherry")
}
