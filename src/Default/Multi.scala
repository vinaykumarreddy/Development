package pack2

class Multi extends Thread {
   override def run()
  {
    print("running")
  }
  
 }

class Multi1{
  def main(args: Array[String]): Unit = {
  
  val a= new Multi()
  //val t=new Thread()
  a.start()

}
}