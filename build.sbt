ThisBuild / organizationName := "ICE"

val Scala3 = "3.3.0"

ThisBuild / scalaVersion := Scala3

ThisBuild / testFrameworks += new TestFramework("munit.Framework")

val catsV = "2.9.0"
val catsEffectV = "3.4.8"
val fs2V = "3.6.1"
val http4sV = "0.23.22"
val circeV = "0.14.5"
val doobieV = "1.0.0-RC2"
val munitCatsEffectV = "1.0.7"


// Projects
lazy val `scala-training` = project
  .aggregate(core)

lazy val core = (project.in(file("core")))
  .settings(
    name := "scala-training",

    libraryDependencies ++= Seq(
      "org.typelevel"               %% "cats-core"                  % catsV,
      "org.typelevel"               %% "cats-effect"                % catsEffectV,

      "co.fs2"                      %% "fs2-core"                   % fs2V,
      "co.fs2"                      %% "fs2-io"                     % fs2V,

      "org.http4s"                  %% "http4s-dsl"                 % http4sV,
      "org.http4s"                  %% "http4s-ember-server"        % http4sV,
      "org.http4s"                  %% "http4s-ember-client"        % http4sV,
      "org.http4s"                  %% "http4s-circe"               % http4sV,

      "io.circe"                    %% "circe-core"                 % circeV,
      "io.circe"                    %% "circe-generic"              % circeV,
      "io.circe"                    %% "circe-parser"               % circeV,

      "org.tpolecat"                %% "doobie-core"                % doobieV,
      "org.tpolecat"                %% "doobie-h2"                  % doobieV,
      "org.tpolecat"                %% "doobie-hikari"              % doobieV,
      "org.tpolecat"                %% "doobie-postgres"            % doobieV,

      "org.typelevel"               %% "munit-cats-effect-3"        % munitCatsEffectV         % Test,

    )
  )
