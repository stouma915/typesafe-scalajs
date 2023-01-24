package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{TableCellAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object TableCell {

  type AcceptAttribute = GlobalAttribute | TableCellAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCell =
    TableCell(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): TableCell =
    TableCell(attributes.toSet, children.toList)

}

final case class TableCell(attributes: Set[(TableCell.AcceptAttribute, _)], children: List[Node])
    extends Tag[TableCell.AcceptAttribute]
