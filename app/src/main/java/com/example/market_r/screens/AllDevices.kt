import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.market_r.R

@Composable
@Preview (showSystemUi = true)
fun DevicesListScreen() {
    val devices = remember {
        listOf(
            Device("123456543212456765432", "Working properly", "Меркурий-115/185Ф", "2024-12-31"),
            Device("123456789876543346345", "Needs maintenance", "Орион-100Ф", "2025-06-30"),
            Device("098765432345678765434", "New device", "Меркурий-115/185Ф", "2024-09-15"),
            Device("098765445762498579272", "Needs replacement", "Меркурий-115/185Ф", "2025-03-31"),
            Device("394857083458374253038", "Under maintenance", "Орион-100Ф", "2024-11-30"),
            Device("324850987348750233325", "Needs repairs", "Орион-100Ф", "2025-09-15"),
            Device("324850987348750233325", "Needs cleaning", "Орион-100Ф", "2025-07-31"),
            Device("123456789876543346345", "Under repair", "Меркурий-115/185Ф", "2024-10-31"),
            Device("324850987348750233325", "Needs repairs", "Орион-100Ф", "2025-05-15"),
            Device("324850987348750233325", "Needs repairs", "Меркурий-115/185Ф", "2025-01-91"),
        )
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(devices) { device ->
            DeviceItem(device)
        }
    }
}

@Composable
fun DeviceItem(device: Device) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    device.modelName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.list),
                        contentDescription = "List",
                    )
                }
            }
            Divider(modifier = Modifier.padding(vertical = 8.dp))
            InfoSection("Card ID", device.cardId)
            InfoSection("Paid until", device.paidUntil)
            InfoSection("Comment", device.comment)
        }
    }
}

@Composable
fun InfoSection(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Text(value, fontWeight = FontWeight.Medium)
    }
}

data class Device(
    val cardId: String,
    val comment: String,
    val modelName: String,
    val paidUntil: String
)