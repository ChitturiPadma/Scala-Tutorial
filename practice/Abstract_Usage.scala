package com.scala.demos

abstract class Person1(name:String) {
  var age:Int = 0
  val greet:String = "Hello ! This is abstract class demo"
  def displayDetails = println("Name is..."+name+", Age is..."+age+" ,Greet message is ..."+greet)
}

class Employee1(name:String, ageParam:Int) extends Person1(name)
{
   age = ageParam
  override val greet:String = "hello this is employee class extended by abstract Person"
}

object Abstract_Usage {
  def main(args: Array[String]): Unit = {

    //Usage of Abstract Class
    val empObj = new Employee1("Padma", 27)
    empObj.displayDetails
  }

}
