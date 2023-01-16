package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{AreaAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Area {

  type AcceptAttribute = GlobalAttribute | AreaAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Area =
    Area(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Area =
    Area(attributes.toSet, childs.toList)

}

final case class Area(attributes: Set[(Area.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Area.AcceptAttribute]
