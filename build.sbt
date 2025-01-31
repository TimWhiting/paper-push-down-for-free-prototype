name := "p4f-prototype"

version := "1.0"

scalaVersion := "3.6.3"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"

scalacOptions ++= Seq("-new-syntax", "-rewrite", "-source", "3.4-migration")
