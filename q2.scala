import scala.io.StdIn.readLine

object Q2 {
  def countLetterOccurrences(wordList:List[String]): Int={
    val length=wordList.map(_.length)
    val count=length.reduce((wordCount1,wordCount2)=>wordCount1+wordCount2)
    count
  }
  def main(args: Array[String]): Unit = {
    println("Enter a list of words separated by commas:")
    val input = readLine()
    val wordList = input.split(",").map(_.trim).toList

    println("Total count of letter occurrences:"+countLetterOccurrences(wordList))
  }
}