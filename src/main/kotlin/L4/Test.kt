package L4



fun main() {

    //if表达式 ，kotli没有三元，但是可以这么写
    val count  = if (1 > 2) 1 else 2



    //和switch case 一样


    when(count){
        1 -> println("1")
        2 -> println("2")
        else -> println("else")
    }


    val res = when(count){
        1 -> 1*100
        2 -> 2*100
        else -> count*count
    }



}