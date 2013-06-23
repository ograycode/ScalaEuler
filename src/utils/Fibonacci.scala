package utils

class Fibonacci {
	var previous = 0
	var current = 1
	
	def nextNumber = {
	  val holder = current
	  current = current + previous
	  previous = holder
	  current
	}
}