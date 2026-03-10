fun main() {
   val  name : String ="Mohamed"
   val age : Int = 20
    val nickname : String? = null

    println("name : " + name )
    if (nickname ==null){
    println("nick name is empty ")
    }else{
    println("nick name :"+ nickname )
    }
    if (age >= 18) {
        println("age status: Adult")
    } else {
        println("age status: Minor")
    }

}
