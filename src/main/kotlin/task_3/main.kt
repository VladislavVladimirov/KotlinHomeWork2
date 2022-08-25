package ru.netology

val scan = java.util.Scanner(System.`in`)

fun main() {
    var itemSumm = 11000
    var discount = 0.0
    if (itemSumm <= 1000) {
        discount = 0.0
    } else if (itemSumm in 1001..10000) {
        discount = 100.0
    } else if (itemSumm > 10000) {
        discount = itemSumm * 0.05
    }
    var totalSumm = itemSumm - discount
    println("Являетесь ли вы постоянным клиентом? Если да - введите true, иначе false")
    var additionalDiscount: Boolean = scan.nextBoolean()
    if (additionalDiscount) {
        discount += totalSumm * 0.01
        totalSumm -= totalSumm * 0.01
    }
    println("Итого: $totalSumm руб. \nСумма скидки: $discount руб" )

}