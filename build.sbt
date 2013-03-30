name := "hello"

version := "1.0"

scalaVersion := "2.10.1"

crossScalaVersions := Seq(
  //"2.8.2", 
  "2.9.0", 
  "2.9.1", 
  "2.9.2", 
  "2.9.3", 
  //"2.10.0", 
  "2.10.1"
)

libraryDependencies <+= scalaVersion(v => v match {  
  case "2.10.1" => "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
  case _ => "org.scalatest" %% "scalatest" % "1.9.1" % "test" 
})

