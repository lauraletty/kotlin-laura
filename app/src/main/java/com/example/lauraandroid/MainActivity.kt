package com.example.lauraandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lauraandroid.ui.theme.LauraAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)) {

        val mContext = LocalContext.current
        androidx.compose.material3.Text(
            text = "welcome to Android",
            fontSize = 30.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        androidx.compose.material3.Text(
            text = "Types of Cars",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .height(29.dp),
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White
        )




        androidx.compose.material3.Text(text = "1.Ferrari")
        androidx.compose.material3.Text(text = "2.BMW")
        androidx.compose.material3.Text(text = "3.Mitsubishi")


        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Button(
                onClick = {
                          mContext.startActivity(Intent(mContext,layoutactivity::class.java) )
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Green)

            )
            {
                androidx.compose.material3.Text(text = "see more")
            }

        }



            androidx.compose.material3.Text(
                text = "Movies to Watch",
                modifier = Modifier
                    .background(Color.Green)
                    .height(30.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            androidx.compose.material3.Text(text = "Umbrella academy")
            androidx.compose.material3.Text(text = "Vampire diaries")
            androidx.compose.material3.Text(text = "Young sheldon")
            androidx.compose.material3.Text(text = "Warrior nun")



            Spacer(modifier = Modifier.height(40.dp))
            Divider()

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bl),
                    contentDescription = "bl",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )


            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                androidx.compose.material3.Text(text = "Next")
            }



    }


}

@Preview(showBackground = true)
@Composable
fun Textpreview(){
    Text()


}
