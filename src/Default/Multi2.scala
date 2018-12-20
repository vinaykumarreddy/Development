package Default

class M extends Thread{
  override def run()
  {
    
    println("child class thread")
  }
  def login()
  {
    val name="String"
  }
}



object Multi2 {
  def main(args: Array[String]): Unit = {
    
    println("main class thread")
    
    val a=new M()
    a.start()
    for (a<-10 to 20)
    {
      println("lopp statements")
    }
    
  }
  
}