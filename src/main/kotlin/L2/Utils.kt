package L2


/**
 * 扩展 String类
 */
fun String.isEmail(): Boolean{
    return this.contains("@")
}

