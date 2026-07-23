#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isAnagram(const char *s, const char *t) {
    if (strlen(s) != strlen(t)) return false;
    int freq[256] = {0};   // HashMap<Character, Integer> 

    for (int i = 0; s[i] != '\0'; i++)
        freq[(unsigned char)s[i]]++;

    for (int i = 0; t[i] != '\0'; i++)
        freq[(unsigned char)t[i]]--;

    for (int i = 0; i < 256; i++)
        if (freq[i] != 0) return false;

    return true;
}

int main(void) {
    printf("%s\n", isAnagram("anagram", "garamna") ? "true" : "false");
    printf("%s\n", isAnagram("car", "cat") ? "true" : "false");
    printf("%s\n", isAnagram("aacc", "ccac") ? "true" : "false");
    printf("%s\n", isAnagram("aacc", "ccaa") ? "true" : "false");

    return 0;
}