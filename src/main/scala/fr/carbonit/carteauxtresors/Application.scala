package fr.carbonit.carteauxtresors

import fr.carbonit.carteauxtresors.treasuremap.TreasureMap

object Application {

  def main(args: Array[String]) : Unit = {
    println("CarbonIT - arte aux trésors")


    val treasureMap = TreasureMap.fromFile()

    println(treasureMap.x + ", " + treasureMap.y)

  }

}
