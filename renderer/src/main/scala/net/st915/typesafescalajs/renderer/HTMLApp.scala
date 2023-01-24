package net.st915.typesafescalajs.renderer

import cats.effect.*
import net.st915.typesafescalajs.dom.tags.special.{Body, Head}
import net.st915.typesafescalajs.renderer.typeclasses.{CanRenderBody, CanRenderHead}

trait HTMLApp extends IOApp {

  val headProgram: IO[Head]
  val bodyProgram: IO[Body]

  override final def run(args: List[String]): IO[ExitCode] = {

    import cats.effect.unsafe.implicits.global
    import net.st915.typesafescalajs.renderer.environments.global
    import net.st915.typesafescalajs.renderer.instances.all.given

    for {
      head <- headProgram
      body <- bodyProgram
      _ <- CanRenderHead[IO].renderHead(head)
      _ <- CanRenderBody[IO].renderBody(body)
    } yield ExitCode.Success

  }

}
