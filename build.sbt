organization := "com.srednal"

name := "testit"

scalaVersion := "2.12.1"

lazy val under = (project in file("under"))
	.settings(
		scalaVersion := "2.12.1",
		exportJars := true,
		libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
	)
	
lazy val root = (project in file("."))
  .aggregate(under)
