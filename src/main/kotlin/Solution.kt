/**
 * A,E,I,O,U 만 사용할 수 있는 길이 5이하의 모든단어
 * 그 단어가 사전에서 몇번째 단어 인지 return
 *
 * A
 * AA
 * AAA
 * AAAA
 * AAAAA
 * AAAAE~AAAAU
 * AAAEA~AAAEU
 * AAAIA~AAAIU
 *
 *
 *
 *1. 사전의 경우 알파벳순이다
 *2. 모든 경우의 수를 저장하는 해법이 필요
 *  - 스택인가?
 *  - 즉 순서대로 스택에 넣고, 모든 경우의 수를 탐색하는것인가
 *
 * ## Stack 의 규칙?
 * 1.알파벳 순으로 채워줘야한다
 * 2.같은 노드에 최대 5번까지 가능하다 즉 순환 노드라는개념이 있다...?
 */

import java.util.Stack

class Solution {
    fun solution(word: String): Int {
        var answer = 0
        var vowels = listOf("A", "E", "I", "O", "U")
        var nodes = arrayOf(
            listOf("A", "A"), listOf("A", "A"), listOf("A", "A"), listOf("A", "A"), listOf("A", "A"),
            listOf("E", "E"), listOf("E", "E"), listOf("E", "E"), listOf("E", "E"), listOf("E", "E"),
            listOf("I", "I"), listOf("I", "I"), listOf("I", "I"), listOf("I", "I"), listOf("I", "I"),
            listOf("O", "O"), listOf("O", "O"), listOf("O", "O"), listOf("O", "O"), listOf("O", "O"),
            listOf("U", "U"), listOf("U", "U"), listOf("U", "U"), listOf("U", "U"), listOf("U", "U"),
            listOf("A", "E"),
            listOf("A", "I"),
            listOf("A", "O"),
            listOf("A", "U"),
            listOf("E", "A"),
            listOf("E", "I"),
            listOf("E", "O"),
            listOf("E", "U"),
            listOf("I", "O"),
            listOf("I", "U"),
            listOf("O", "U")
        )
        var list = mutableListOf<String>()
        var stack = Stack<String>()
        stack.push("A")


        return answer
    }
}

fun main() {
    var a = Solution()
    a.solution("AAAAE")//6
    a.solution("AAAE")//10
    a.solution("I")//1563
    a.solution("EIO")//1189
}