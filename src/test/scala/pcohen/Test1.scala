package pcohen

import org.scalatest.FlatSpec


class Test1 extends FlatSpec {
  
   "A Call with single int 1" should "return 1" in {
     val i = Dojo1.add("1")
     assert(i==1)
   }
  
}