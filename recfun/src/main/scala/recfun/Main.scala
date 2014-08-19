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
  def pascal(c: Int, r: Int): Int = { 
  	if (c == 0 || c == r) 1
  	else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
  	def solve(cnt: Int, chars: List[Char]): Boolean = {
  		if (cnt < 0) false
  		else if (chars.isEmpty) cnt == 0
  		else if (chars.head == '(') solve(cnt+1, chars.tail)
  		else if (chars.head == ')') solve(cnt-1, chars.tail)
  		else solve(cnt, chars.tail)
  	}
  	solve(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
  	def solve(now: Int, coins: List[Int]): Int = {
  		if (now == money) 1
  		else if (now > money) 0
  		else {
  			if (coins.isEmpty) 0
  			else solve(now + coins.head, coins) + solve(now, coins.tail)
  		}
  	}
  	solve(0, coins)
  }
}
