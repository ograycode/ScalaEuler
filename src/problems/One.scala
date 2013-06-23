package problems

object Test extends App {
  println(One.solution.toString)
}

object One {
    //Find the sum of all the multiples of 3 or 5 below 1000.
	def solution = {
	  var sum = 0
	  for (i<-1.to(999)) {
	    if (i % 3 == 0
	        || i % 5 == 0)
	      sum += i
	  }
	  sum
	}
}