package l2linkage
package myapp

object MyApp {
  def main(args: Array[String]): Unit = {
    val n1: Double =
      bippy.client.Bippy.bippy
    println(n1)

    val n2: BigDecimal =
      dingo.client.Dingo.dingo
    println(n2)
  }
}
