package problems

import utils._

object Three extends App {
  
	println(solution.toString)
  
    //What is the largest prime factor of the number 600851475143
	def solution = {
	  val number: Long = 600851475143L
	  val min = 1
	  var num = Math.sqrt(number).toLong
	  var found = false
	  while (!found && num > min) {
	    if (number % num == 0) {
	      found = PrimeFactor.isPrime(num)
	    } 
	    num -= 1
	  }
	  num += 1
	  num
	}
}