package week1

object squareroot {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(45); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(134); 

  def sqrIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else
      sqrIter(improve(guess, x), x);System.out.println("""sqrIter: (guess: Double, x: Double)Double""");$skip(82); 

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.01;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(71); 

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(45); 

  def sqrt(x: Double) =
    sqrIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(44); 
  
  
	// Pascal's triangle
	var x: Int = 1;System.out.println("""x  : Int = """ + $show(x ))}
}
