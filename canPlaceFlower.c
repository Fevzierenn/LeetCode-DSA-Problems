#include <stdio.h>
#include <stdbool.h>

bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {
    int count = 0;

    for (int i = 0; i < flowerbedSize; i++) {
        if (count >= n) {
            return true;
        }

        if (flowerbed[i] == 0 &&
           (i == 0 || flowerbed[i - 1] == 0) &&
           (i == flowerbedSize - 1 || flowerbed[i + 1] == 0)) {
            
            flowerbed[i] = 1;
            count++;
        }
    }

    return count >= n;
}

int main() {
    int flowerbed[] = {1, 0, 0, 0, 1};
    int flowerbedSize = sizeof(flowerbed) / sizeof(flowerbed[0]);
    int n = 1;

    if (canPlaceFlowers(flowerbed, flowerbedSize, n)) {
        printf("true\n");
    } else {
        printf("false\n");
    }

    return 0;
}