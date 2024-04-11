package net.xrrocha.hcluster

import net.xrrocha.hcluster.Types.*

trait PairGenerator {
  def pairsFrom[A](elements: IndexedSeq[A]): IndexedSeq[(Index, Index)]
}

trait ExhaustivePairGenerator extends PairGenerator {
  def pairsFrom[A](elements: IndexedSeq[A]): IndexedSeq[(Index, Index)] = ExhaustivePairGenerator.pairsFrom(elements.length)
}

object ExhaustivePairGenerator {
  def pairsFrom(length: Int): IndexedSeq[(Index, Index)] =
    for (i <- 0 until length; j <- i + 1 until length)
      yield (i, j)
}