
object CoffeeMachine {

    var estadoIdle = CoffeeMachineState.Idle()
    var currentState: CoffeeMachineState = estadoIdle


    fun makeCoffee() {
        println("Estado actual: $currentState")

        when (currentState) {
            // siempre después de cada accion, se actualiza el estado,
            // luego este detecta en que estado está y sigue en el siguiente y así sucesivamente
            // Simula un proceso de preparación


            is CoffeeMachineState.Idle -> {
                println("Máquina encendida.")
                currentState = CoffeeMachineState.MakingCoffee
                Thread.sleep(2000)

                println("¡Café listo! Estado: $currentState")
                makeCoffee()
            }
            is CoffeeMachineState.MakingCoffee -> {
                println("Introduce dinero")
                Thread.sleep(2000)
                makeCoffee()
            }
            is CoffeeMachineState.MakingCoffee -> {
                currentState = CoffeeMachineState.ServingCoffee("Nescafé")
                println("Tipo de café escogido $currentState")
                Thread.sleep(2000)
                makeCoffee()
            }
            is CoffeeMachineState.MakingCoffee -> {
                println("Cantidad de azúcar seleccionada")
                Thread.sleep(2000)
                makeCoffee()
            }
            is CoffeeMachineState.MakingCoffee -> {
                println("Café servido")
                Thread.sleep(2000)
                makeCoffee()
            }
            is CoffeeMachineState.ServingCoffee -> {
                println("Café recogido.")
                Thread.sleep(2000)
                makeCoffee()
            }
            is CoffeeMachineState.Error -> {
                println("La máquina tiene un error: ${(currentState as CoffeeMachineState.Error).message}")
            }
        }
    }

    fun clean() {
        println("Limpiando la máquina...")
        currentState = CoffeeMachineState.Idle()
        println("Máquina limpia. Estado: $currentState")
    }

}
