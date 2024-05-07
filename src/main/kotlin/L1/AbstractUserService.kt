package L1

abstract class AbstractUserService : UserService {

    /**
     * 抽象类必须带open的函数才可以复写
     */
    open fun validate() {
        println("abstract validate")
    }

    /**
     * final 修饰符，标识不能被重写
     */
    final override fun delUser(){

    }

}