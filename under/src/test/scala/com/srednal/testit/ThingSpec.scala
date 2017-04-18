package com.srednal.testit

import org.scalatest._

class ThingSpec extends FlatSpec with Matchers {

  "A Thing" should "go to eleven" in {
	val t = new Thing
	t.foo shouldBe 11
  }
  
}
