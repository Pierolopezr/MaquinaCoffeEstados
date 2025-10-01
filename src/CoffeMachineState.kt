
    sealed class CoffeeMachineState {
        class Idle : CoffeeMachineState(){
            init {
                println("Estoy en el init del Idle")
            }
        }
        object MakingCoffee : CoffeeMachineState()
        data class ServingCoffee(val brand: String) : CoffeeMachineState()
        data class IntroduzcoDinero(val dinero: Boolean) : CoffeeMachineState()
        data class Error(val message: String) : CoffeeMachineState()
    }
