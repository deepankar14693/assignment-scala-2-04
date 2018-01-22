package edu.knoldus

class TotalCommission {
 def getTotalCommission(commissionList:List[Commission]): String={

for(l <- commissionList){
 l match {
  case ClientSideCommission(a) => {
   //val obj = new ClientSideCommission(a)
  }
  case StreetSideCommission(a) => {
   val obj = new StreetSideCommission(a)
  }
  case _ =>
 }
}
 }

}

abstract class Commission(val value: Int)  {
 type T <: Commission

}

case class ClientSideCommission(override val value: Int) extends Commission(value) {
 type T=ClientSideCommission
}

case class StreetSideCommission(override val value: Int) extends Commission(value) {
 type T=StreetSideCommission
}

object Display{
 private sealed trait CommissionDisplay {
  def totalDisplayCommission: String
 }

 implicit class DisplayTheCommission(T:Commission) extends CommissionDisplay{
  override def totalDisplayCommission: String =
  {
 val x=that.value + T.value
   return x.toString
  }
 }

}