package net.st915.typesafescalajs.dom.attributes

import net.st915.typesafescalajs.dom.attributes.Attribute

/**
 * @see
 *   https://www.w3schools.com/tags/ref_standardattributes.asp
 */
package object global {

  sealed trait GlobalAttribute

  case object accessKey extends Attribute[String] with GlobalAttribute

  case object className extends Attribute[String] with GlobalAttribute

  case object contentEditable extends Attribute[Boolean] with GlobalAttribute

  case object dir extends Attribute[String] with GlobalAttribute

  case object draggable extends Attribute[Boolean] with GlobalAttribute

  case object id extends Attribute[String] with GlobalAttribute

  case object lang extends Attribute[String] with GlobalAttribute

  case object spellCheck extends Attribute[Boolean] with GlobalAttribute

  case object style extends Attribute[String] with GlobalAttribute

  case object tabIndex extends Attribute[Int] with GlobalAttribute

  case object title extends Attribute[String] with GlobalAttribute

}
