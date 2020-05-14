package example.myapp

interface FishColor {
    val color: String
}

class Shark: FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishColor by fishColor, FishAction by PrintingFishAction("eat algae")

interface FishAction {
    fun eat()
}

object GoldColor: FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat(){
        println(food)
    }
}
