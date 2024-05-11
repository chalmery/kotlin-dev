package L5


//运算符和中缀表达式
fun main() {

    "Hello"=="World"
    "Hello".equals("World")


    2+3
    2.plus(3)


    val list = listOf(1,2,3,4)
    2 in list
    list.contains(2)

    val  map = mapOf("key1" to "one","key2" to "two")
    map["key1"]
    map.get("key1")

    //报错原因是可变性问题 使用 mapOf 创建的是一个不可变的 Map 实例
//    map["key3"] = "value1"
//    map.set("key3","value1")

    val  mutMap = mutableMapOf("key1" to "one","key2" to "two")
    mutMap["key1"]
    mutMap.get("key1")

    mutMap["key3"] = "value1"
    mutMap.set("key3","value1")



    2>3
    2.compareTo(3)>0



    val func = fun(){
        println("函数引用")
    }
    func.invoke()
    func()

    2 to 3






}
