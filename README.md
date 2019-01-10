# Longest Word In A Sentence

Test Cases

Test Case 1 - 
Input: My name is Ann.
Output: [4, name]

Comments :
- It iterates through the sentence and finds the longest word which is name.
- This is tested by comparing both the expected list size and the result list size in LenghtTest.java file.
Both were equal to 2 so the test was a success.

Test Case 2 - 
Input: There are many books on the shelves! One having a barcode *^&@AmberTolleyBC@. See that?
Output: [13, AmberTolleyBC]

Comments :
- It iterates through the sentence removes all special characters and finds the longest word which is AmberTolleyBC.
- This is tested by comparing both the expected list size and the result list size in LenghtTest.java file.
Both were equal to 2 so the test was a success.

Test Case 3 -
Input: Two Americans near the coastal area. They were having a fantastic time there!
Output: [9, Americans, fantastic]

Comments :
- It iterates through the sentence and finds that there are more than one word with 9 characters, so its added to the list.
- This is tested by comparing both the expected list size and the result list size in LenghtTest.java file.
Both were equal to 3 so the test was a success.
