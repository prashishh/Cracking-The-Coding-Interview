/* Implement a function void reverse(char* str) in C or C++ which
 * reverses a null-terminated string.
 */

 #include <iostream>
 #include <string>
 using namespace std;

/*first attempt - using string*/
void reverse(char* str) {
	string result = "";
	for (char* i = str; *i; i++) {
		result = *i + result ;
	}
	cout << result << endl;

}

int main() {
	char temp[] = "hello world";
	reverse(temp);

	return 0;
}