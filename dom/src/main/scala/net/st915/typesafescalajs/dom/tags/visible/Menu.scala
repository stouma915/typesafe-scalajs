package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{MenuAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Menu {

  type AcceptAttribute = GlobalAttribute | MenuAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Menu =
    Menu(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Menu =
    Menu(attributes.toSet, children.toList)

}

final case class Menu(attributes: Set[(Menu.AcceptAttribute, _)], children: List[Node])
    extends Tag[Menu.AcceptAttribute] {

  override val tagName: String = "menu"

}
