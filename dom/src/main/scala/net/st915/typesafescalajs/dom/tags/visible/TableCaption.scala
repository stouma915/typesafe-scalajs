package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{
  TableCaptionAttribute,
  VisibleElementAttribute
}
import net.st915.typesafescalajs.dom.tags.Tag

object TableCaption {

  type AcceptAttribute = GlobalAttribute | TableCaptionAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCaption =
    TableCaption(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TableCaption =
    TableCaption(attributes.toSet, childs.toList)

}

final case class TableCaption(
  attributes: Set[(TableCaption.AcceptAttribute, _)],
  childs: List[Node]
) extends Tag[TableCaption.AcceptAttribute]