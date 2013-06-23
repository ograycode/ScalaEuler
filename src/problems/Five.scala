package problems

object Five extends App{
  
  println(solution)
  
  //What is the smallest positive number that is evenly
  //divisible by all of the numbers from 1 to 20?
  def solution = {
    val numbers = 2.to(20)
    var num = 20L
    var found = false
    while (!found) {
      num += 1
      var index = 0
      var allDiv = true
      while (!found && allDiv && index < numbers.length) {
        if (num % numbers.apply(index) != 0)
          allDiv = false
        else if (index == numbers.length - 1 && allDiv)
          found = true
        index += 1
      }
    }
    num
  }

}