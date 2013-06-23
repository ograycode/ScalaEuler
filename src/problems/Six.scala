package problems

object Six extends App{

  println(solution)
  
  //Find the difference between the sum of the 
  //squares of the first one hundred natural 
  //numbers and the square of the sum.
  def solution = {
    val nums = 1.to(100)
    val squareOfTheSum = Math.pow(nums.sum, 2.0).toInt
    val sumOfTheSquared = nums.map(Math.pow(_, 2.0)).sum.asInstanceOf[Int]
    squareOfTheSum - sumOfTheSquared
  }
}