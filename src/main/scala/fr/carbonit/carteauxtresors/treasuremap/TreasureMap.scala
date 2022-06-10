package fr.carbonit.carteauxtresors.treasuremap

object TreasureMap {

  def fromFile() : TreasureMap = {
    new TreasureMap(3, 4)
  }

}

class TreasureMap(val x: Int, val y:Int) {

}
