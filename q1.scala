object TemperatureConverterss {
  def calculateAverage(temperaturesCelsius: List[Double]): Double = {
    val temperaturesFahrenheit = temperaturesCelsius.map(c => (c * 9/5) + 32)
    val sumOfTemperatures = temperaturesFahrenheit.reduce(_ + _)
    val averageTemperature = sumOfTemperatures / temperaturesFahrenheit.length
    averageTemperature
  }

  def main(args: Array[String]): Unit = {
    println("Enter temperatures in Celsius separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val temperaturesCelsius = input.split(" ").map(_.toDouble).toList
    val averageFahrenheit = calculateAverage(temperaturesCelsius)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
