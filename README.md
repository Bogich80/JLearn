# Unit 1

## Specification and implemetation 

Create a simple Java Maven project. There are three plain text file: 

- *csaladnevek.txt* it's contains lastnames  
- *ferfinevek.txt* it's contains firstnames of men.
- *noinevek.txt* it's contains firstnames of woman.

Copy these files into standard resource path in your project like **/src/main/resources**. 

Write a program that does the following tasks.

Create three container which will store those names. Use any of *java.util.List* implementation like **ArrayList**.

Write a method which will fill those containers from specified files.

The following article there are several ways how to read text file line by line:
[https://www.geeksforgeeks.org/different-ways-reading-text-file-java/](https://www.geeksforgeeks.org/different-ways-reading-text-file-java/)

Following snippet demonstrate how to access resource from **/src/main/resources**

```java
import java.io.File;
import java.net.URL;

public class Program {

	public static void main(String[] args) {

		URL is = Program.class.getResource("csaladnevek.txt");
		File file = new File(is.getFile());
		
		// WRITE HERE
	}
}

```

**Pay attention to character encoding use UTF8**
```java
//In case of using FileReader
new FileReader(file, StandardCharsets.UTF_8)
```

All names in **csaladnevek.txt** are uppercase. Please convert to capital letters only the first character.

## TEST

At the end of your code print size of your containers.
Write a program which randomly create full names from first name and last name.
Let's create a file like teams.txt and write a hundred names to this file.



