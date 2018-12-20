package Default

class Collections {
  
  println("Scala")
}
object A{
   def main(args: Array[String]): Unit = {
    
  
  
  val Name=List("vinay","kumar","reddy")
  val City=List("vinay","kumar","reddy")
  val age=List(20,30,40,50)
   val age1=List(20,30,40,50,60)
  if(age==age1)
  {
    println("corret")
  }else {println("incorrect")
    
  }
  
  val a=new Collections()
  println("Main name:"+ Name.head)
  println("main name:"+Name.last)
  println("age :"+age(0))
  

  
}
}