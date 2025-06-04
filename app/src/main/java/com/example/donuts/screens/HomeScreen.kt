package com.example.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.combosable.DonutCard
import com.example.donuts.combosable.SpacerHorizontal
import com.example.donuts.combosable.SpacerVertical
import com.example.donuts.combosable.TodayOfferCard
import com.example.donuts.ui.theme.CardPinkColor
import com.example.donuts.ui.theme.DarkPinkColor
import com.example.donuts.ui.theme.GrayColor
import com.example.donuts.ui.theme.Inter
import com.example.donuts.ui.theme.LightBlueColor
import com.example.donuts.ui.theme.LightPinkColor


@Composable
fun HomeScreen() {
    val width = LocalConfiguration.current.screenWidthDp
    val height = LocalConfiguration.current.screenHeightDp
    Column(
        modifier = Modifier
            .background(GrayColor)
            .fillMaxSize()
            .padding(start = (0.08 * width).dp, top = (0.085 * height).dp)
            .verticalScroll(rememberScrollState())

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(
                    text = "Let’s Gonuts!",
                    color = DarkPinkColor,
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 30.sp,
                )
                SpacerVertical(3)
                Text(
                    text = "Order your favourite donuts from here",
                    color = Color.Black,
                    modifier = Modifier.alpha(0.6f),
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                )
            }
            Box(
                modifier = Modifier
                    .padding(end = (0.083 * width).dp)
                    .size(45.dp)
                    .background(
                        LightPinkColor,
                        shape = RoundedCornerShape(15.dp)
                    )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "search",
                    tint = DarkPinkColor,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        SpacerVertical(58)
        Text(
            text = "Today Offers",
            color = Color.Black,
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
        )
        SpacerVertical(30)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            TodayOfferCard(
                color = LightBlueColor,
                image = R.drawable.first_donut,
                title = "Strawberry Wheel",
                description = "These Baked Strawberry\nDonuts are filled with\nfresh strawberries..."
            )
            SpacerHorizontal(12)
            TodayOfferCard(
                color = CardPinkColor,
                image = R.drawable.second_donut,
                title = "Chocolate Glaze",
                description = "Moist and fluffy baked\nchocolate donuts full of\nchocolate flavor."
            )
            SpacerHorizontal(12)
            TodayOfferCard(
                color = LightBlueColor,
                image = R.drawable.first_donut,
                title = "Strawberry Wheel",
                description = "These Baked Strawberry\nDonuts are filled with\nfresh strawberries..."
            )
            SpacerHorizontal(12)
            TodayOfferCard(
                color = CardPinkColor,
                image = R.drawable.second_donut,
                title = "Chocolate Glaze",
                description = "Moist and fluffy baked\nchocolate donuts full of\nchocolate flavor."
            )
            SpacerHorizontal(12)
            TodayOfferCard(
                color = LightBlueColor,
                image = R.drawable.first_donut,
                title = "Strawberry Wheel",
                description = "These Baked Strawberry\nDonuts are filled with\nfresh strawberries..."
            )
            SpacerHorizontal(12)
            TodayOfferCard(
                color = CardPinkColor,
                image = R.drawable.second_donut,
                title = "Chocolate Glaze",
                description = "Moist and fluffy baked\nchocolate donuts full of\nchocolate flavor."
            )
        }

        SpacerVertical(50)
        Text(
            text = "Donuts",
            color = Color.Black,
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
        )
        SpacerVertical(35)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            DonutCard(image = R.drawable.choco_donut, text = "Chocolate Cherry")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.white_donut, text = "Strawberry Rain")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.pistacio_donut, text = "Strawberry Coco")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.choco_donut, text = "Chocolate Cherry")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.white_donut, text = "Strawberry Rain")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.pistacio_donut, text = "Strawberry Coco")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.choco_donut, text = "Chocolate Cherry")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.white_donut, text = "Strawberry Rain")
            SpacerHorizontal(21)
            DonutCard(image = R.drawable.pistacio_donut, text = "Strawberry Coco")
        }
        SpacerVertical(60)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = (0.08 * width).dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.home),
                tint = DarkPinkColor,
                contentDescription = "home",
            )
            Icon(
                painter = painterResource(id = R.drawable.heart),
                tint = DarkPinkColor,
                contentDescription = "heart",
            )
            Icon(
                painter = painterResource(id = R.drawable.notification),
                tint = DarkPinkColor,
                contentDescription = "notification",
            )
            Image(
                painter = painterResource(id = R.drawable.buy),
                contentDescription = "buy",
            )
            Icon(
                painter = painterResource(id = R.drawable.account),
                tint = DarkPinkColor,
                contentDescription = "account",
            )
        }
        SpacerVertical(30)
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
