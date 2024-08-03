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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun DevicesListScreen() {
    val devices = remember {
        listOf(
            Device("ID001", "Working properly", "Model A", "2024-12-31"),
            Device("ID002", "Needs maintenance", "Model B", "2025-06-30"),
            Device("ID003", "New device", "Model C", "2024-09-15"),
            Device("ID004", "Needs replacement", "Model D", "2025-03-31"),
            Device("ID005", "Under maintenance", "Model E", "2024-11-30"),
            Device("ID006", "Needs repairs", "Model F", "2025-09-15"),
            Device("ID007", "Needs cleaning", "Model G", "2025-07-31"),
            Device("ID008", "Under repair", "Model H", "2024-10-31"),
            Device("ID009", "Needs repairs", "Model I", "2025-05-15"),
            Device("ID010", "Needs repairs", "Model J","232=324234-24234"),
            Device("ID011", "Needs repairs", "Model K", "2025-01-31"),
            Device("ID012", "Needs repairs", "Model L", "2025-07-31"),
            Device("ID013", "Needs repairs", "Model M", "2025-03-31"),
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
                    color = MaterialTheme.colorScheme.primary
                )
                IconButton(onClick = { /* Implement edit functionality */ }) {
                    Icon(Icons.Default.Edit, contentDescription = "Edit")
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