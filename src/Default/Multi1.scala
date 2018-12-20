package Default

class Multi1 extends Thread
{
  override def run()
  {
    
    for (i<-10 to 20)
    {
      println("develop")
    }
    def Menu()
    {
      val n="String";
      val i=Int;
    }
  }
  


class Demo{
   def main(args: Array[String]): Unit = {
     
     
     val d=new Thread()
     val a =new Multi1()
     
     a.start()
     println("main")
    
  }
}
}