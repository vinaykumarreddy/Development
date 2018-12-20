package Default

class Functions {
  val name:List[String]= List("vinay","kumar","reddy","Hyderabad")
  val name2:List[String]= List("vinay","kumar","reddy","Hyderabad")
  
  val id:List[Int]=List(1,2,3,4,5,6)
}
object L{
  def main(args: Array[String]): Unit = {
    val f=new Functions()
    print(f.name+"\n")
    
    //print(f.name2)
    
    
    print(f.id+"\n")
  }
}