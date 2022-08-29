fun main(){
    MyClass.MyObject.f()
    MyClass.g()
}

class MyClass{
    object MyObject{
        fun f(){
            println("f() called")
        }
    }
    companion object Co{
        @JvmStatic
        fun g(){
            println("g() called")
        }
    }
}