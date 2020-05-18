package generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners(){
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter() {
        needsProcessing= false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}