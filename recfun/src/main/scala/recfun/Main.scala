package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || r == 0) 1
    else if (c == r) 1
    else pascal(c, r-1) + pascal(c-1, r-1)

  /**
   * Exercise 2
   */
  def balanceCountCheck(chars: List[Char], count: Int): Boolean =
    if(count < 0) false
    else if(chars.isEmpty) if(count == 0) true else false
    else if(chars.head == '(') balanceCountCheck(chars.tail, count+1)
    else if(chars.head == ')') balanceCountCheck(chars.tail, count-1)
    else balanceCountCheck(chars.tail, count)
    
  def balance(chars: List[Char]): Boolean = 
    balanceCountCheck(chars, 0)
    

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if(coins.isEmpty && money == 0) 1
    else if (coins.isEmpty) 0
    else {
      val currentCoin: Int = coins.head
      var i,ways: Int = 0
      
      while(currentCoin * i <= money) {
        ways = ways + countChange(money - currentCoin*i, coins.tail)
        i+=1
      }
    
      ways
    } 
      
    
}
