import androidx.compose.runtime.Composable
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "primera_pantalla") {
        composable("primera_pantalla") {
            PrimeraPantalla(navController)
        }
        composable("lista_eventos") {
            ListaDeEventos(navController)
        }
        composable("detalles_activity") {
            DetallesActivity(navController)
        }
        composable("pantalla") {
            Pantalla(navController)
        }
    }
}
