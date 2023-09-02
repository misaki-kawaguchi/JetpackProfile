package com.example.jetpackprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackprofile.ui.theme.JetpackProfileTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      JetpackProfileTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(20.dp)
          ) {

            // プロフィール画像
            Image(
              painter = painterResource(id = R.drawable.img_profile),
              contentDescription = "プロフィール",
              modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
            )
            Spacer(modifier = Modifier.height(20.dp))

            // 名前
            Text(
              text = "山田 太郎",
              color = Color.Gray,
              fontSize = 16.sp,
              fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(20.dp))

            // 職業
            Text(
              text = "職業：エンジニア",
              color = Color.Gray,
              fontSize = 16.sp,
            )
            Spacer(modifier = Modifier.height(20.dp))

            Column(
              horizontalAlignment = Alignment.Start,
              modifier = Modifier.fillMaxWidth(),
            ) {
              // 会社名
              // 職業
              Text(
                text = "sample株式会社",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
              )
              Spacer(modifier = Modifier.height(10.dp))

              // 部署
              Text(
                text = "テクノロジーグループ",
                color = Color.Gray,
                fontSize = 16.sp,
              )
              Spacer(modifier = Modifier.height(20.dp))

              // Email
              Label(icon = Icons.Default.Email, text = "Email")
              Spacer(modifier = Modifier.height(10.dp))
              Text(
                text = "sample@gmail.com",
                fontSize = 16.sp,
              )
              Spacer(modifier = Modifier.height(5.dp))

              Divider(
                modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
                thickness = 2.dp,
              )
            }
            Spacer(modifier = Modifier.height(20.dp))

            // 詳細表示ボタン
            Button(
              modifier = Modifier.fillMaxWidth(),
              colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF85F6A)),
              onClick = { /*TODO*/ }) {
              Text(text = "詳細を表示", color = Color.White)
            }
            Spacer(modifier = Modifier.height(20.dp))

            // 趣味と居住地セクション
            Column(
              modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.LightGray.copy(alpha = 0.3f))
                .padding(horizontal = 10.dp, vertical = 20.dp)
            ) {
              Label(
                icon = Icons.Default.Favorite,
                text = "趣味：映画鑑賞",
                color = Color.Gray,
              )
              Spacer(modifier = Modifier.height(10.dp))

              Label(
                icon = Icons.Default.LocationOn,
                text = "居住地：東京都",
                color = Color.Gray,
              )
            }
          }
        }
      }
    }
  }
}

@Composable
fun Label(
  icon: ImageVector,
  text: String,
  color: Color = MaterialTheme.colors.onBackground,
) {
  Row(verticalAlignment = Alignment.CenterVertically) {
    Icon(
      imageVector = icon,
      contentDescription = null,
    )
    Spacer(modifier = Modifier.width(10.dp))
    Text(
      text = text,
      color = color,
      fontSize = 14.sp,
      fontWeight = FontWeight.Bold,
    )
  }
}
