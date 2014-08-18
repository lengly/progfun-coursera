package example

object Main extends App{
  println(Lists.sum(List(1,2,3,0)))
  println(Lists.max(List(3,5,2,1)))
  println(Lists.sum(List()))
  println(Lists.max(List()))
}