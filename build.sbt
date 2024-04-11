name := "hcluster-scala"

version := "0.1"

scalaVersion := "3.4.1"

scalacOptions ++= Seq("-deprecation")

libraryDependencies ++= Seq(
  "org.apache.lucene" % "lucene-spellchecker" % "3.6.2",
  "info.debatty" % "java-string-similarity"% "2.0.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.5.4",
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4",
  "org.scalameta" %% "munit" % "1.0.0-M11" % Test,
)
