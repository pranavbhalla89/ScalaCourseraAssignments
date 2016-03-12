package week2

object week2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(104); 
  
  def product(f: Int => Int)(a: Int, b:Int): Int =
  	if (a > b) 1
  	else f(a) * product(f)(a+1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(27); val res$0 = 
  	
  product(x => x)(1,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(57); 
  
  def factorial(n: Int): Int =
  	product(x=>x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(19); val res$1 = 
  	
  factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(34); 
 
  
  val x = new Rational(1, 2);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(10); val res$2 = 
  x.numer;System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 
  
  x.neg;System.out.println("""res3: week2.Rational = """ + $show(res$3))}
}

// classes
class Rational(x:Int, y:Int) {
 def numer = x
 def denom = y
 
 def neg: Rational =
 	new Rational(- numer, denom)
 	
 	override def toString:String = numer + "/" + denom
}
