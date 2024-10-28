# Text Analyzer (Lab 2 Java Software Development)

This project performs text analysis using `StringBuffer` in Java. It counts how many sentences in a given text contain each word from a provided array of words. The program reads the text and words from user input, processes the text, and outputs the results.



## Assignment

Determine **C3** as the remainder of dividing the student's record book number 13879064 by 3, and **C17** as the remainder of dividing the student's record book number 13879064 by 17.

Based on **C3**, determine the type of text variables:

| C3  | Type          |
|-----|---------------|
| 2   | StringBuffer  |

Based on **C17**, determine the text operation:

| C17 | Operation                                                                                     |
|-----|-----------------------------------------------------------------------------------------------|
| 9   | Given a text and an array of words, count in how many sentences each word from the array appears. |

**Variant:**

- **C3 = 2**: Use `StringBuffer` for text variables.
- **C17 = 9**: Given a text and an array of words, count how many sentences contain each word from the array.


## Features

- **Text Input**: Users can input any text they wish to analyze.
- **Word List Input**: Users can specify a list of words to search for within the text.
- **Sentence Parsing**: The text is split into sentences based on punctuation marks (., !, ?).
- **Word Counting**: Counts the number of sentences in which each word appears.
- **Exception Handling**: Robust error handling for invalid inputs and null values.
- **Uses StringBuffer**: All string manipulations are performed using `StringBuffer`, as per the assignment requirements.
- **Code Standards**: Adheres to Java Code Conventions (or Google Java Style Guide).

## Requirements

- **Java Development Kit (JDK) 8** or higher installed on your system.
- **Git** (optional, for cloning the repository).
  
## How to Run

### Clone the Repository (Optional)

If the project is hosted on GitHub, clone it using:

```bash
git clone https://github.com/HlibPavlyk/text-analyzer.git
cd text-analyzer/src
```

Alternatively, you can download the source code files directly.

### Compile the Source Code

Open a terminal or command prompt in the project directory and compile the Java files:

```bash
javac Main.java TextUtils.java
```

### Run the Program

After successful compilation, run the program using:

```bash
java Main
```

## Usage Instructions

1. **Starting the Program**:
   - Run `java Main` in your terminal.

2. **Input Text**:
   - The program will prompt: `Enter the text:`
   - Input the text you want to analyze. This can be multiple sentences ending with periods, exclamation marks, or question marks.

3. **Input Word List**:
   - The program will prompt: `Enter the number of words to search:`
   - Input an integer representing how many words you want to search for.
   - For each word, you will be prompted: `Enter word X:`
     - Input each word you want to search for in the text.

4. **Results Display**:
   - After processing, the program will display how many sentences contain each word:
     ```
     Word 'example' occurs in 2 sentences.
     Word 'test' occurs in 1 sentences.
     ```

## Example Session

```
Enter the text:
This is a test. Testing is essential! Is this example sufficient? Yes, this example should suffice.

Enter the number of words to search:
2
Enter word 1:
test
Enter word 2:
example
Word 'test' occurs in 1 sentences.
Word 'example' occurs in 2 sentences.
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to reach out for any questions or suggestions regarding this project.
