package week2

object week2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def product(f: Int => Int)(a: Int, b:Int): Int =
  	if (a > b) 1
  	else f(a) * product(f)(a+1, b)            //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  product(x => x)(1,3)                            //> res0: Int = 6
  
  def factorial(n: Int): Int =
  	product(x=>x)(1, n)                       //> factorial: (n: Int)Int
  	
  factorial(5)                                    //> res1: Int = 120
 
  
  val x = new Rational(1, 2)                      //> x  : week2.Rational = 1/2
  x.numer                                         //> res2: Int = 1
  
  x.neg                                           //> res3: week2.Rational = -1/2
}

// classes
class Rational(x:Int, y:Int) {
 def numer = x
 def denom = y
 
 def neg: Rational =
 	new Rational(- numer, denom)
 	
 	override def toString:String = numer + "/" + denom
}