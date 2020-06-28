package example

import exposed.kotlin.sample.{DBConnect, DynamicTables}

object Hello extends App {
  DBConnect.INSTANCE.init()
  DynamicTables.INSTANCE.getTest()

}
