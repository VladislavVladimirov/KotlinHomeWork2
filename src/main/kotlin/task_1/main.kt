package task_1

fun main() {
    val minimumFee = 3500.0
    val standardFee = 0.0075
    val amount = 500_000
    val result = (if (amount * standardFee < minimumFee) minimumFee else amount * standardFee) / 100
    println("Комиссия за перевод составит $result рублей")

}