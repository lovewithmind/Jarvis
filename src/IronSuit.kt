import com.stark.ai.Blaster
import com.stark.ai.Jarvis

fun main(){
    val jarvis = Jarvis()
    val command = "BOOST Energy"
    val value = 47
    val energyValue = jarvis
            .help(command, value)
    print(energyValue)
}