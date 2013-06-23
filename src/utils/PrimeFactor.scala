package utils

object PrimeFactor {
	def isPrime(number: Long) = {
	  var isPrime = true
	  val min = 1
	  var num = number - 1
	  if (number % 2 == 0)
	    isPrime = false
	  while (isPrime && num > min) {
	    if (number % num == 0)
	      isPrime = false
	    num -= 1
	  }
	  isPrime
	}
}