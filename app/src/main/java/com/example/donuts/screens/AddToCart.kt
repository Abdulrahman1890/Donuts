package com.example.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.combosable.SpacerHorizontal
import com.example.donuts.combosable.SpacerVertical
import com.example.donuts.ui.theme.DarkPinkColor
import com.example.donuts.ui.theme.Inter
import com.example.donuts.ui.theme.LightGrayColor
import com.example.donuts.ui.theme.LightPinkColor

@Composable
fun AddToCart() {
    val width = LocalConfiguration.current.screenWidthDp
    val height = LocalConfiguration.current.screenHeightDp
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LightPinkColor)
            .padding(horizontal = (0.083 * width).dp, vertical = (0.085 * height).dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = "back",
        )
        Image(
            painter = painterResource(id = R.drawable.big_donut),
            contentDescription = "donut",
            modifier = Modifier
                .fillMaxWidth()
                .size(300.dp)
                .padding(top = 20.dp)
        )
    }
    Box {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 490.dp)
                .background(
                    LightGrayColor,
                    shape = RoundedCornerShape(40.dp)
                ),
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(start = 40.dp, top = 35.dp)
            ) {
                Text(
                    text = "Strawberry Wheel",
                    color = DarkPinkColor,
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 30.sp,
                )
                SpacerVertical(33)
                Text(
                    text = "About Gonut",
                    color = Color.Black,
                    modifier = Modifier.alpha(0.75f),
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                )
                SpacerVertical(16)
                Text(
                    text = "These soft, cake-like Strawberry Frosted\nDonuts feature fresh strawberries and a\ndelicious fresh strawberry glaze frosting. Pretty\nenough for company and the perfect treat to\nsatisfy your sweet tooth.",
                    color = Color.Black,
                    modifier = Modifier.alpha(0.6f),
                    fontFamily = Inter,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                )
                SpacerVertical(26)
                Text(
                    text = "Quantity",
                    color = Color.Black,
                    modifier = Modifier.alpha(0.75f),
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                )
                SpacerVertical(19)
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.minus),
                        contentDescription = "minus",
                        modifier = Modifier
                            .size(45.dp)
                            .shadow(elevation = 300.dp, shape = RoundedCornerShape(15.dp))
                    )
                    SpacerHorizontal(20)
                    Image(
                        painter = painterResource(id = R.drawable.one),
                        contentDescription = "one",
                        modifier = Modifier
                            .size(45.dp)
                            .shadow(elevation = 300.dp, shape = RoundedCornerShape(15.dp))

                    )
                    SpacerHorizontal(20)
                    Image(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "plus",
                        modifier = Modifier
                            .size(45.dp)
                            .shadow(elevation = 300.dp, shape = RoundedCornerShape(15.dp))
                    )
                }
                SpacerVertical(47)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "£16",
                        color = Color.Black,
                        fontFamily = Inter,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 30.sp,
                    )
                    SpacerHorizontal(26)
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 40.dp)
                            .background(
                                DarkPinkColor,
                                shape = RoundedCornerShape(50.dp)
                            )
                            .padding(horizontal = 76.dp, vertical = 22.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Add to Cart",
                            color = Color.White,
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
        ) {
            Image(
                painter = painterResource(id = R.drawable.favourite_heart),
                contentDescription = "food plate",
                modifier = Modifier
                    .size(145.dp)
                    .shadow(elevation = 300.dp, shape = CircleShape)
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun PreviewAddToCart() {
    AddToCart()
}