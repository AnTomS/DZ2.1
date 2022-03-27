fun main() {

    print("Введите сумму покупок")

    val dicsount: Int = readln().toInt()
    val dicsount1: Int = dicsount - 100
    val dicsount2: Int = (dicsount * 5) / 100
    if (dicsount <= 1000) {
        print("Для текущей суммы покупок скидки не предусмотрены")
    } else if (dicsount >= 1001 || dicsount <= 10000) {
        print("Для текущей суммы покупок предусмотрена стандартная скидка. Итоговая цена $dicsount1")
    }
    else if (dicsount >= 10001) {
        print("Для текущей суммы покупок предусмотрена стандартная скидка. Итоговая цена $dicsount2")
    }
}