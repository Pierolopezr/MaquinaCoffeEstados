fun main() {
    println("--- Encendiendo la máquina ---")
    CoffeeMachine.makeCoffee()

    println("---  Esperando opción a elegir ---")
    CoffeeMachine.makeCoffee()

    println("---  Escoger cantidad de azúcar ---")
    CoffeeMachine.makeCoffee()

    println("--- Sirviendo café ---")
    CoffeeMachine.makeCoffee()

    println("--- Esperando recogida---")
    CoffeeMachine.makeCoffee()

    /*
    CoffeeMachine.currentState = CoffeeMachineState.Error("Falta agua")
    println("\n--- Intentando hacer café de nuevo ---")
    CoffeeMachine.makeCoffee()
    */
    println("\n--- Limpiando la máquina ---")
    CoffeeMachine.clean()

    /*
    println("\n--- Y ahora, otro café ---")
    CoffeeMachine.makeCoffee()
     */
}
