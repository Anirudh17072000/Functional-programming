package com.SingleResponsibilty


import scala.annotation.tailrec

object StringChanger extends App {

  val text = (text: String) => text

  val modifiedText = (textToBeModified: String) =>  {

    @tailrec
    def modify(accumulator: String, index: Int): String = {

      if (index == textToBeModified.length)
        return accumulator
      var temporaryVariable: String = textToBeModified.charAt(index).toString
      if (index % 2 != 0)
        temporaryVariable = index.toString

      modify(accumulator + temporaryVariable, index + 1)

    }
    modify("",0)
  }


  val reversedText = (text: String) => text.reverse


  (new Print).printString(modifiedText(text("Anirudh")))

  (new Print).printString(reversedText(text("Chauhan")))

}