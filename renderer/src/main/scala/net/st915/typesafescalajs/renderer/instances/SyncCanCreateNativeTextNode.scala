package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeTextNode
import net.st915.typesafescalajs.renderer.typeclasses.CanCreateNativeTextNode
import net.st915.typesafescalajs.renderer.util.summonDocument

final class SyncCanCreateNativeTextNode[F[_]: Sync] extends CanCreateNativeTextNode[F] {

  override def createNativeTextNode(using Environment): Kleisli[F, String, NativeTextNode] =
    Kleisli { content => Sync[F].blocking(summonDocument.createTextNode(content)) }

}
