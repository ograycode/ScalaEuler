package problems

import utils._

object TestTwo extends App {
  println(Two.solution)
}

trait ProjectEuler {
  def solution: Any
}

object Two extends ProjectEuler{
    //By considering the terms in the Fibonacci
    //sequence whose values do not exceed four 
    //million, find the sum of the even-valued terms.
	def solution = {
	  var sum = 0L
	  val fib = new Fibonacci
	  var num: Long = fib.nextNumber
	  while(num < 4000000) {
	    if (num % 2 == 0)
	      sum += num
	    num = fib.nextNumber
	  }
	  sum
	}
}