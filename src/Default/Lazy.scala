package Default

class Strict()
{
  val a={
    println("strict")
    10
  }
}
  class Lazyeval{
  
    lazy val b={
      println("lazy");
      20
    }
  }



object Lazy {
  
  def main(args: Array[String]): Unit = {
    val c=new Strict;
   val d=new Lazyeval;
    println(c.a)
    println(d.b)
    
  }
}
  
