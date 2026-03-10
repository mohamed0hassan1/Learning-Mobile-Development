fun main() {
    val score = 85
    if (score in 90..100){
        println("grade : A")
    }
    else if ( score in 80 ..89 ){
        println("grade : B")
    }
    else if ( score in 70.. 79 ){
        println("grade : C")
    }
    else if  ( score < 70 ){
        println("grade : F")
    }
}
