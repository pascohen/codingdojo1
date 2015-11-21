package pcohen

object Dojo1 extends App {
 
  def add(s:String):Int = {
    val l = s.split(" ").toList.map(_.toInt)
    l.reduce((a,b) => a+b)
  }
}