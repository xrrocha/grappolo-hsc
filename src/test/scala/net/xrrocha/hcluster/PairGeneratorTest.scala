package net.xrrocha.hcluster

import munit.Assertions.assertEquals

class PairGeneratorTest extends munit.FunSuite:
  test("epa!") {
    val results = Map[Int, Set[(Int, Int)]](
      0 -> Set(),
      1 -> Set(),
      2 -> Set((0, 1)),
      3 -> Set((0, 1), (0, 2), (1, 2)),
      4 -> Set((0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)),
    )
    results.foreach: (length, expected) =>
      val pairs = ExhaustivePairGenerator.pairsFrom(length)
      assertEquals(length * (length - 1) /2, pairs.size)
      assertEquals(expected.size, pairs.size)
      assertEquals(expected, pairs.toSet)
  }
end PairGeneratorTest

