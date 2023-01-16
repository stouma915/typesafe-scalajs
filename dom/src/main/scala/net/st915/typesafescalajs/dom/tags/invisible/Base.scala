package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.BaseAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Base {

  type AcceptAttribute = GlobalAttribute | BaseAttribute

  def apply(attributes: (AcceptAttribute, _)*): Base =
    Base(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Base =
    Base(attributes.toSet, childs.toList)

}

final case class Base(attributes: Set[(Base.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Base.AcceptAttribute]