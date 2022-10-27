sealed  interface seal{
    public fun getData()
}
 sealed  class A:seal{
    override fun getData() {
       print("is called")
    }
}
public open class B: A() {
    public open fun getInner(){
        println("b called")
    }

}
