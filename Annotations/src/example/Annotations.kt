package example

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}
    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false}

fun testAnnotations() {
    val planObject = Plant::class
    for (a in planObject.annotations){
        println(a.annotationClass.simpleName)
    }
    val myAnnotationObject = planObject.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}

fun main() {
    testAnnotations()
}

annotation class ImAPlant