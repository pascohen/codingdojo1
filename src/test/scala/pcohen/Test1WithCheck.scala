package pcohen

//import org.scalatest.FlatSpec
//import org.scalatest.prop.{ PropertyChecks, Checkers }
import org.scalacheck.Prop.forAll
import org.scalacheck.Properties


object Test1WithCheck extends Properties("String") {
    
    property("ints") = forAll { (a:Int) =>  
      val s = a.toString()
      Dojo1.add(s)  == a 
      }

      property("ints2") = forAll { (a:Int, b:Int) =>  
      val s = a.toString()+" "+b.toString()
      Dojo1.add(s)  == (a + b)
      }

}