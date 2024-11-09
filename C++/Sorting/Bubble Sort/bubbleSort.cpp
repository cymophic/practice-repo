#include <iostream>
#include <vector>

void bubbleSort(std::vector<int>& numList) {
    int listSize = numList.size();
    for (int currentIndex = 0; currentIndex < listSize; ++currentIndex) {
        for (int unsortedIndex = 0; unsortedIndex < listSize - currentIndex - 1; ++unsortedIndex) {
            if (numList[unsortedIndex] > numList[unsortedIndex + 1]) {
                std::swap(numList[unsortedIndex], numList[unsortedIndex + 1]);
            }
        }
    }
}

int main() {
    std::vector<int> nums = {100, 1, 1000, 500};
    std::vector<int> newNums(nums);
    
    bubbleSort(newNums);

    std::cout << "Original List:";
    for (int num : nums) {
        std::cout << " " << num;
    }
    std::cout << std::endl;

    std::cout << "Sorted List:";
    for (int num : newNums) {
        std::cout << " " << num;
    }
    std::cout << std::endl;

    return 0;
}
