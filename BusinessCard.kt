import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF162167))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Mohamed Hassan Sobhy",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFFFFFF)
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Artificial Intelligence Student",
            fontSize = 18.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(32.dp))


        Surface(
            shape = MaterialTheme.shapes.medium,
            color = Color.White,
            shadowElevation = 4.dp
        ) {
            Text(
                text = "LinkedIn:linkedin.com/in/mohamed hassan",
                modifier = Modifier.padding(18.dp),
                color = Color(0xFF0077B5),
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}