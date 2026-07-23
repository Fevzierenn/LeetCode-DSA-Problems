#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

bool isPalindrome(char* s) {
    int i = 0;
    int j = strlen(s) - 1;

    while (i < j) {
        while (i < j && !isalnum((unsigned char)s[i])) {
            i++;
        }
        while (i < j && !isalnum((unsigned char)s[j])) {
            j--;
        }

        if (tolower((unsigned char)s[i]) != tolower((unsigned char)s[j])) {
            return false;
        }

        i++;
        j--;
    }

    return true;
}

int main() {
    char text1[] = "A man, a plan, a canal: Panama";
    char text2[] = "race a car";


    if (isPalindrome(text1)) {
        printf("\"%s\" -> Palindrom!\n", text1);
    } else {
        printf("\"%s\" -> Not Palindrom!\n", text1);
    }

    if (isPalindrome(text2)) {
        printf("\"%s\" -> Palindrom!\n", text2);
    } else {
        printf("\"%s\" -> Not Palindrom!\n", text2);
    }

    return 0;
}