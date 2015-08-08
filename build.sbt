android.Plugin.androidBuild

// Specifying the Android target Sdk version
platformTarget in Android := "android-22"

// Application Name
name := """scala-android"""

// Application Version
version := "1.0.0"

// Scala version
scalaVersion := "2.11.7"

// Repositories for dependencies
resolvers ++= Seq(Resolver.mavenLocal,
  DefaultMavenRepository,
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.typesafeIvyRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.defaultLocal)

// Override the run task with the android:run
run <<= run in Android

proguardScala in Android := true

useProguard in Android := true

proguardOptions in Android ++= Seq(
  "-ignorewarnings",
  "-keep class scala.Dynamic")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions += "-target:jvm-1.7"
