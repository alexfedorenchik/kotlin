// !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -TOPLEVEL_TYPEALIASES_ONLY

abstract class AbstractClass
typealias Test1 = AbstractClass
val test1 = Test1()
val test1a = AbstractClass()

annotation class AnnotationClass
typealias Test2 = AnnotationClass
val test2 = Test2()
val test2a = AnnotationClass()

enum class EnumClass { VALUE1, VALUE2 }
typealias Test3 = EnumClass
val test3 = <!INAPPLICABLE_CANDIDATE!>Test3<!>()
val test3a = <!INAPPLICABLE_CANDIDATE!>EnumClass<!>()

sealed class SealedClass
typealias Test4 = SealedClass
val test4 = Test4()
val test4a = SealedClass()

class Outer {
    inner class Inner
    typealias TestInner = Inner
}
typealias Test5 = Outer.Inner

val test5 = Test5()
val test5a = Outer.<!UNRESOLVED_REFERENCE!>Inner<!>()
val test5b = Outer.<!UNRESOLVED_REFERENCE!>TestInner<!>()
val test5c = Outer().<!UNRESOLVED_REFERENCE!>TestInner<!>()
val test5d = Outer().Inner()
val test5e = Outer().<!UNRESOLVED_REFERENCE!>Test5<!>()
