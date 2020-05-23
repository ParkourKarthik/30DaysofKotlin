package generics

fun main() {
    genericsExample()
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    addItemTo(aquarium)
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    val cleaner = TapWaterCleaner()
    val aquarium5 = Aquarium(TapWater())
    aquarium5.addWater(cleaner)}
