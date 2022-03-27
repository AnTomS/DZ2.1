fun main() {

    print("Введите количество лайков цифрами")
    val likes: Int = readln().toInt()
    if (likes % 2 == 0)
        println(" понравилось $likes людям")
    else
        println(" понравилось $likes человеку")
}