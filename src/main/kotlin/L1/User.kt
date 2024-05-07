package L1

/**
 * 最普通的类
 */
class User {
    var name : String? = null
    var age : Int? = null
    constructor(name: String?, age: Int?) {
        this.name = name
        this.age = age
    }
    constructor() {
    }
}

/**
 * 参数不为空
 * 因为属性没有初始化，所以必须提供非空构造
 */
class User2 {
    var name : String
    var age : Int
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

/**
 * 提取构造函数到类声明上
 */
class User3(name: String, age: Int) {
    var name: String = name

    var age: Int = age
}

/**
 * 将参数提取出来
 */
class User4(var name: String,var age: Int) {
}

fun main() {
    val user4 = User4("John", 30)
}
