/*
 * Write a method to replace all the spaces in a string with %20.
 * 
 */

#include <iostream>
#include <string>
#include <cstring>
using namespace std;

void replaceSpace(char word[], int length) {
	int spaceCount = 0, newLength;
	for (int i = 0; i < length; i++) {
		if(word[i] == ' ')
			spaceCount++;
	}

	newLength = length + (spaceCount*2);
	for(int j = length; j >= 0; j--) {
		if(word[j] == ' ') {
			word[newLength] = '0';
			word[newLength-1] = '2';
			word[newLength-2] = '%';
			newLength = newLength - 3;
		} else {
			word[newLength] = word[j];
			newLength = newLength - 1;
		}
	}

	cout << word << endl;
}

int main() {

	string word = "He   llo   World   yes!";
	char c_word[256];
	strcpy(c_word, word.c_str());

	replaceSpace(c_word, word.length()+1);
    return 0;
}