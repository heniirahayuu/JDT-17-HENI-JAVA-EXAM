package com.indivaragroup.examtwenty;

import java.util.Stack;

public class BracketValidator {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Jika menemukan kurung buka, masukkan ke dalam stack (maaf mas ini sy pakai ai untuk strukturalnya soalnya saay lupa)
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Jika menemukan kurung tutup, cek kecocokan dengan stack
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // Jika stack kosong, berarti semua kurung sudah tertutup dengan benar
        return stack.isEmpty();
    }
}
