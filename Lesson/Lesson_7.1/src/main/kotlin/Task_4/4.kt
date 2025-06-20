package org.example.Task_4

/**
 * Дана строка — предложение на русском языке.
 * Поменять местами первую и последнюю буквы каждого слова.
 */
fun main() {
    println(swapLetter("Это предложение содержит несколько слов"))

    println("Введите слово или предложение, которое состоит больше чем из 1 буквы")
    val str = readln()
    println(swapLetter(str))
}

/**
 * Функция меняет первую и последнюю букву каждого слова.
 * возвращает строку разбитую на слова пробелами,
 *     после обработки объединяю слова пробелами,
 *     если в слове больше 1 символа где первый и последний символ буквы,
 *     меняю местами первую и последнюю букву
 *
 *     Или
 *  * fun swapLetter2(str: String) :String {
 *  *     return Regex("""\b(\w)(\w*)(\w)\b""").replace(str) {
 *  *         "${it.groupValues[3]}${it.groupValues[2]}${it.groupValues[1]}"
 *  *     }
 *  * }
 */
fun swapLetter(str: String): String {
    return str.split(" ").joinToString(" ") { word ->
        if (word.length > 1) {
            word.last() + word.substring(1, word.length - 1) + word.first()
        } else {
            word
        }
    }
}