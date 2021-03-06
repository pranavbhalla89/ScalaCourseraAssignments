package week1

object squareroot {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else
      sqrIter(improve(guess, x), x)               //> sqrIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.01                 //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) =
    sqrIter(1.0, x)                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4166666666666665
  
  
	// Pascal's triangle
	var x: Int = 1                            //> x  : Int = 1
}