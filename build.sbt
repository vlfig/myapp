organization := "l2linkage.myapp"
        name := "myapp"
     version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "l2linkage.bippy" %% "bippy-client" % "1.0"
libraryDependencies += "l2linkage.dingo" %% "dingo-client" % "1.0"

proguardSettings
ProguardKeys.options in Proguard += "-dontobfuscate"
ProguardKeys.options in Proguard  += ProguardOptions.keepMain("l2linkage.myapp.MyApp")
ProguardKeys.proguardVersion in Proguard := "5.0"
