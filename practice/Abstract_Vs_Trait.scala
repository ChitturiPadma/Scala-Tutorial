package com.expedia.demos

trait AccountValue
{
  var accValue:Double
}

trait AccountOpen
{
  def isAccountOpen:Boolean
}

abstract class Person2(name:String)
{
  var age:Int = 0
  val greet:String = "Hello ! This is abstract class demo"
  def displayDetails = println("Name is..."+name+", Age is..."+age+" ,Greet message is ..."+greet)
}

class Employee2(name:String, ageParam:Int) extends Person2(name) with AccountValue with AccountOpen
{
   age = ageParam
   var accValue = 10000.0
  override val greet:String = "hello this is employee class extended by abstract Person"

   def isAccountOpen: Boolean = true
}

object Abstract_Vs_Trait extends App {



  val empObj = new Employee2("Padma", 27)
  println(empObj.isAccountOpen)
  println(empObj.accValue)
  println(empObj.greet)

}
