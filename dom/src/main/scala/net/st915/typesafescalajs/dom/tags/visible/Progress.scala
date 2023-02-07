package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ProgressAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Progress {

  type AcceptAttribute = GlobalAttribute | ProgressAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Progress =
    Progress(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Progress =
    Progress(attributes.toSet, children.toList)

}

final case class Progress(attributes: Set[(Progress.AcceptAttribute, _)], children: List[Node])
    extends Tag[Progress.AcceptAttribute] {

  override val tagName: String = "progress"

}
