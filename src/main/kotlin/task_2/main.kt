package task_2

fun main() {
    val likes: Int = 121
    if (likes == 0) {
        println(" Лайков нет")
    } else if (likes % 100 == 11) {
        println("Понравилось $likes людям")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
