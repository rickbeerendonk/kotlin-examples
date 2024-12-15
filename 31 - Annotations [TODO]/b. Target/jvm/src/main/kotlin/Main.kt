// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.annotations.define

@Target(AnnotationTarget.CLASS)
annotation class ClassAnnotation

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class ClassAnnotationClass // TODO

@Target(AnnotationTarget.TYPE_PARAMETER)
annotation class TypeParameterAnnotation // TODO

@Target(AnnotationTarget.PROPERTY)
annotation class PropertyAnnotation

@Target(AnnotationTarget.FIELD)
annotation class FieldAnnotation

@Target(AnnotationTarget.LOCAL_VARIABLE)
annotation class LocalVariableAnnotation // TODO

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class ValueParameterAnnotation

@Target(AnnotationTarget.CONSTRUCTOR)
annotation class ConstructorAnnotation

@Target(AnnotationTarget.FUNCTION)
annotation class FunAnnotation // TODO

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class PropertyGetterAnnotation

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class PropertySetterAnnotation

@Target(AnnotationTarget.TYPE)
annotation class TypeAnnotation // TODO

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.EXPRESSION)
annotation class ExpressionAnnotation // TODO

@Target(AnnotationTarget.FILE)
annotation class FileAnnotation // TODO

@Target(AnnotationTarget.TYPEALIAS)
annotation class TypeAliasAnnotation // TODO

@ClassAnnotation class Foo @ConstructorAnnotation constructor(@ValueParameterAnnotation val value: String) {
    @FieldAnnotation
    var myField = 0

    @PropertyAnnotation
    var myProperty: Int
        @PropertyGetterAnnotation get() = myField
        @PropertySetterAnnotation set(value) {
            myField = value
        }
}

fun main() {
    println(Foo("bar"))
}
