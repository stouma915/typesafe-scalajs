package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.AudioAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Audio {

  type AcceptAttribute = GlobalAttribute | AudioAttribute

  def apply(attributes: (AcceptAttribute, _)*): Audio =
    Audio(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Audio =
    Audio(attributes.toSet, children.toList)

}

final case class Audio(attributes: Set[(Audio.AcceptAttribute, _)], children: List[Node])
    extends Tag[Audio.AcceptAttribute]
