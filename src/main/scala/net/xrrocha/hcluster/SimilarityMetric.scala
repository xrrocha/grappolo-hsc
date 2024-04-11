package net.xrrocha.hcluster

import net.xrrocha.hcluster.Types.*

trait SimilarityMetric[A] {
  def lowThreshold: Similarity = 0d

  def compare(a1: A, a2: A): Similarity
}

// TODO Add Debatty string distance metrics
trait LuceneSimilarityMetric extends SimilarityMetric[String] {

  import org.apache.lucene.search.spell.StringDistance

  def distance: StringDistance

  def compare(s1: String, s2: String): Similarity = distance.getDistance(s1, s2).toDouble
}
