package ru.netology

fun main() {
    val minimumFee = 3500.0
    val standardFee = 0.0075
    val amount = 500_000
    val fee = amount * standardFee
    val result = (if (fee < minimumFee) minimumFee else fee) / 100
    println("Комиссия за перевод составит: " + result + " рублей")

}