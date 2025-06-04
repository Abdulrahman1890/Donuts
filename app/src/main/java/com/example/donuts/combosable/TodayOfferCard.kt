package com.example.donuts.combosable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.ui.theme.Inter
import com.example.donuts.ui.theme.LightBlueColor

@Composable
fun TodayOfferCard(color: Color,image: Int, title: String, description: String) {
    Box(
        modifier = Modifier
            .size(width = 228.dp, height = 325.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(193.dp)
                .background(
                    color,
                    shape = RoundedCornerShape(20.dp)
                ),
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.favorate),
                    contentDescription = "favorite",
                )
                SpacerVertical(155)
                Text(
                    text = title,
                    color = Color.Black,
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 5.dp)

                )
                SpacerVertical(8)
                Text(
                    text = description,
                    color = Color.Black,
                    modifier = Modifier
                        .alpha(0.6f)
                        .padding(start = 5.dp),
                    fontFamily = Inter,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.5.sp,
                )
                SpacerVertical(8)
                Row(
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier
                        .align(Alignment.End)
                        .offset(x = 15.dp)
                ) {
                    Text(
                        text = "\$20",
                        color = Color.Black,
                        modifier = Modifier
                            .alpha(0.6f)
                            .padding(start = 5.dp),
                        fontFamily = Inter,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough,
                        )
                    )
                    SpacerHorizontal(5)
                    Text(
                        text = "\$16",
                        color = Color.Black,
                        fontFamily = Inter,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 22.sp,
                    )
                }


            }
        }

        Image(
            painter = painterResource(image),
            contentDescription = "donut",
            modifier = Modifier
                .size(137.dp)
                .align(Alignment.CenterEnd)
                .offset(y = (-50).dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTodayOfferCard() {
    TodayOfferCard(color = LightBlueColor, image = R.drawable.first_donut, title = "Strawberry Wheel", description = "These Baked Strawberry\nDonuts are filled with\nfresh strawberries...")
}
