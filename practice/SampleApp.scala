package com.expedia.demos


abstract class Person(name: String) {

  def printName = println("Person's Name is..."+name)
}

object SampleApp {

  case class Employee (name:String, age:Int) extends Person(name)
  {
    override def printName: Unit = println("Employee Name is..."+name+", Age is..."+age)
  }

  case class Account (name:String, accountNo:String, location:String) extends Person(name)
  {
    override def printName: Unit = println("Employee Account Details: Name is..."+name+", Account is..."+accountNo+" Location is..."+location)
  }


  def main(args:Array[String]): Unit = {
    //Instantiating the case class objects

    val employee  = Employee("Padma", 27)

    val account = Account("Padma", "AAA", "BLR")

    //Invoking method in Employee
    employee.printName

    //Invoking Method in Account
    account.printName

  }

}
