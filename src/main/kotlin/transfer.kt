fun main() {
    println("За переводы с любых карт комиссия 0.75%, минимум 35 рублей")
    print("Введите цифрами сумму в рублях")
    val amountRub: Int = readln().toInt()
    val amountCop: Int = amountRub * 100
    val commission: Double = (amountCop * 0.75) / 100
    val commissionCop: Int = 35 * 100
    val result = if (commission < commissionCop) commissionCop else commission
    print("Ваша комиссия составит : $result копеек")
}