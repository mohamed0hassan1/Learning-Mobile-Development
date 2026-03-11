fun main() {
    val score = 85
  when (score){
      in 90..100->println("grade A ")
      in 80 ..89-> println("grade B ")
      in 70 ..79-> println("grade c ")
      else -> println("grade F")
  }
}
