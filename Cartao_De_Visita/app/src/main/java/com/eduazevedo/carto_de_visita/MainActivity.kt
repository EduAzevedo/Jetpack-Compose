package com.eduazevedo.carto_de_visita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eduazevedo.carto_de_visita.ui.theme.Cartão_De_VisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cartão_De_VisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingCard()
                }
            }
        }
    }
}

@Composable
fun GreetingCard() {
    Column() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android logo",
                Modifier.width(240.dp),

            )
            Text(
                text = "Eduardo Azevedo",
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Android developer",
                fontSize = 18.sp,
                )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(Icons.Rounded.Phone, contentDescription = "Phone Icon", modifier = Modifier.padding(16.dp).weight(0.5f))
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "+55 79 99999-9999", modifier = Modifier.padding(16.dp).weight(1f))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(Icons.Rounded.Email, contentDescription = "Email Icon", modifier = Modifier.padding(16.dp).weight(0.5f))
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "email@example.com", modifier = Modifier.padding(16.dp).weight(1f))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(Icons.Rounded.Share, contentDescription = "Social media Icon", modifier = Modifier.padding(16.dp).weight(0.5f))
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "@eduazevedo", modifier = Modifier.padding(16.dp).weight(1f))

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Cartão_De_VisitaTheme {
        GreetingCard()
    }
}