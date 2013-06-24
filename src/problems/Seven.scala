package problems

import utils._

object Seven extends App{

  println(solution)
  
  //What is the 10 001st prime number?
  def solution = {
    var primeCount = 0
    var num = 1L
    do  {
      num += 1
      if (PrimeFactor.isPrime(num))
        primeCount += 1
    } while (primeCount < 10000)
    num
  }
}