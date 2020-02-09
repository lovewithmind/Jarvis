import com.stark.ai.ArthematicComputer
import com.stark.ai.Blaster
import com.stark.ai.EnergyAlternater
import com.stark.ai.Jarvis

fun main(){
    val jarvis = Jarvis(EnergyAlternater(ArthematicComputer()))
    val command = "BOOST Energy"
    val value = 47
    val energyValue = jarvis
            .help(command, value)
    Blaster(energyValue).fire()
}