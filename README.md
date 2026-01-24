# Java Textbook Solutions 📖

A comprehensive collection of Java programming exercises, textbook problems, and operating system projects. This repository demonstrates progressive learning of Java fundamentals, object-oriented programming, and system-level programming concepts.

![Java](https://img.shields.io/badge/Java-17+-007396?logo=java)
![OOP](https://img.shields.io/badge/Paradigm-Object%20Oriented-blue)
![Learning](https://img.shields.io/badge/Status-Active%20Learning-success)

## 🎯 Repository Overview

This repository contains solutions to Java textbook exercises organized by chapter, along with operating system projects and advanced Java concepts. The work demonstrates proficiency in core Java programming, data structures, algorithms, and system-level programming.

## 📂 Repository Structure

```
java-textbook-solutions/
│
├── Ch.02/                          # Chapter 2 Exercises
│   ├── Basic syntax and variables
│   ├── Data types and operators
│   └── Input/Output operations
│
├── Ch.03/                          # Chapter 3 Exercises
│   ├── Control structures
│   ├── Loops and iterations
│   └── Conditional statements
│
├── Ch.04/                          # Chapter 4 Exercises
│   ├── Methods and functions
│   ├── Parameter passing
│   └── Return values and scope
│
├── Operating System/               # OS-related Java projects
│   ├── Process management
│   ├── Thread programming
│   └── System resource monitoring
│
├── OS Project/Idea1/               # Operating System Project
│   ├── System implementation
│   └── Advanced OS concepts
│
├── Relearn Class/                  # Review and advanced topics
│   ├── OOP concepts review
│   ├── Advanced Java features
│   └── Best practices
│
├── system_resource_log.txt         # System monitoring output
└── .gitignore                      # Git ignore configuration
```

## 📚 Learning Modules

### Chapter 2: Java Fundamentals

**Topics Covered:**
- ✅ Variables and data types (int, double, String, boolean)
- ✅ Operators (arithmetic, relational, logical)
- ✅ Input/Output with Scanner
- ✅ Type casting and conversion
- ✅ Basic program structure

**Key Concepts:**
```java
// Variable declarations
int age = 25;
double salary = 50000.50;
String name = "Java Developer";
boolean isActive = true;

// Basic I/O
Scanner input = new Scanner(System.in);
System.out.println("Enter your name:");
String userName = input.nextLine();
```

### Chapter 3: Control Flow

**Topics Covered:**
- ✅ If-else statements
- ✅ Switch statements
- ✅ For loops
- ✅ While and do-while loops
- ✅ Break and continue statements
- ✅ Nested control structures

**Key Concepts:**
```java
// Control structures
if (score >= 90) {
    grade = 'A';
} else if (score >= 80) {
    grade = 'B';
}

// Loops
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

while (condition) {
    // Loop body
}
```

### Chapter 4: Methods and Functions

**Topics Covered:**
- ✅ Method declaration and definition
- ✅ Parameter passing (by value)
- ✅ Return types and values
- ✅ Method overloading
- ✅ Scope and lifetime of variables
- ✅ Recursive methods

**Key Concepts:**
```java
// Method definition
public static int add(int a, int b) {
    return a + b;
}

// Method overloading
public static double add(double a, double b) {
    return a + b;
}

// Recursive method
public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

### Operating System Projects

**Topics Covered:**
- ✅ Process management and scheduling
- ✅ Thread creation and synchronization
- ✅ System resource monitoring
- ✅ File I/O operations
- ✅ Memory management concepts
- ✅ Concurrent programming

**Key Features:**
- Process simulation and management
- Multi-threading implementation
- Resource monitoring and logging
- System performance analysis

**Example:**
```java
// Thread creation
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

// System resource monitoring
Runtime runtime = Runtime.getRuntime();
long totalMemory = runtime.totalMemory();
long freeMemory = runtime.freeMemory();
```

### Relearn Class: Advanced Topics

**Topics Covered:**
- ✅ Object-Oriented Programming principles
- ✅ Classes and objects
- ✅ Inheritance and polymorphism
- ✅ Encapsulation and abstraction
- ✅ Interfaces and abstract classes
- ✅ Exception handling
- ✅ Collections Framework

## 🛠️ Prerequisites

### Required Software
- **JDK** (Java Development Kit) 11 or higher
- **IDE** (IntelliJ IDEA, Eclipse, NetBeans, or VS Code with Java extensions)
- **Text Editor** (for quick edits)
- **Git** (for version control)

### Recommended Tools
- **Maven** or **Gradle** (build automation)
- **JUnit** (for testing)
- **JavaDoc** (for documentation)

## 🚀 Getting Started

### Installation

1. **Install Java JDK**
   ```bash
   # Check if Java is installed
   java -version
   javac -version
   
   # Download from Oracle or use package manager
   # Windows: Download from oracle.com/java
   # Mac: brew install openjdk
   # Linux: sudo apt install default-jdk
   ```

2. **Clone the repository**
   ```bash
   git clone https://github.com/junjhon12/Java.git
   cd Java
   ```

3. **Compile and run a program**
   ```bash
   # Navigate to a chapter
   cd Ch.02
   
   # Compile a Java file
   javac YourProgram.java
   
   # Run the compiled program
   java YourProgram
   ```

### Using an IDE

**IntelliJ IDEA:**
1. Open IntelliJ IDEA
2. Click "Open" and select the Java folder
3. Right-click on any `.java` file
4. Select "Run 'FileName.main()'"

**Eclipse:**
1. File → Open Projects from File System
2. Select the Java folder
3. Right-click on any `.java` file
4. Run As → Java Application

**VS Code:**
1. Install Java Extension Pack
2. Open the Java folder
3. Click "Run" above the main method

## 💡 How to Use This Repository

### For Learning
1. **Follow Chapter Order** - Start with Ch.02 and progress sequentially
2. **Read the Problem** - Understand what each exercise asks
3. **Try It Yourself** - Attempt the problem before viewing solution
4. **Compare Solutions** - Check your approach against the provided code
5. **Experiment** - Modify code to see different outcomes

### For Practice
1. **Identify Weak Areas** - Focus on challenging topics
2. **Solve Similar Problems** - Create variations of exercises
3. **Time Yourself** - Build problem-solving speed
4. **Code Reviews** - Analyze code for improvements

### For Reference
1. **Syntax Lookup** - Find examples of specific Java features
2. **Pattern Library** - Reference common programming patterns
3. **Best Practices** - Learn from well-structured code

## 📖 Skills Demonstrated

### Programming Fundamentals
- ✅ Variables, data types, and operators
- ✅ Control flow and decision making
- ✅ Loops and iterations
- ✅ Methods and functions
- ✅ Arrays and collections

### Object-Oriented Programming
- ✅ Classes and objects
- ✅ Encapsulation and data hiding
- ✅ Inheritance and code reuse
- ✅ Polymorphism and dynamic binding
- ✅ Interfaces and abstract classes

### Advanced Concepts
- ✅ Exception handling
- ✅ File I/O operations
- ✅ Multi-threading and concurrency
- ✅ System programming
- ✅ Resource management

### Problem-Solving Skills
- ✅ Algorithm design
- ✅ Logic development
- ✅ Code optimization
- ✅ Debugging techniques
- ✅ Testing and validation

## 🎓 Learning Outcomes

By working through this repository, I have gained:

- **Strong Java Foundation** - Solid understanding of core concepts
- **OOP Mastery** - Proficiency in object-oriented design
- **Problem-Solving Skills** - Ability to break down complex problems
- **System Programming** - Knowledge of OS-level concepts in Java
- **Best Practices** - Clean, maintainable code writing
- **Debugging Skills** - Effective error identification and resolution

## 🔧 Code Style Guidelines

This repository follows Java coding conventions:

```java
// Class naming: PascalCase
public class MyClass {
    
    // Constant naming: UPPER_SNAKE_CASE
    public static final int MAX_SIZE = 100;
    
    // Variable naming: camelCase
    private int myVariable;
    
    // Method naming: camelCase
    public void calculateSum() {
        // Method implementation
    }
    
    // Proper indentation and spacing
    if (condition) {
        // Code block
    }
}
```

## 📊 Progress Tracker

### Completed Chapters
- [x] Chapter 2: Java Fundamentals
- [x] Chapter 3: Control Flow
- [x] Chapter 4: Methods
- [ ] Chapter 5: Arrays (if applicable)
- [ ] Chapter 6: Object-Oriented Programming (if applicable)

### Projects
- [x] Operating System Project - Idea 1
- [x] System Resource Monitor
- [x] Relearn Class Review

### Skills Mastered
- [x] Basic syntax and program structure
- [x] Control structures and loops
- [x] Methods and recursion
- [x] Thread programming
- [ ] Advanced OOP concepts
- [ ] Data structures implementation
- [ ] GUI programming

## 🚧 Common Challenges & Solutions

### Challenge 1: Understanding Object-Oriented Concepts
**Problem:** Difficulty grasping inheritance and polymorphism

**Solution:**
- Started with simple class hierarchies
- Drew UML diagrams to visualize relationships
- Practiced with real-world examples

### Challenge 2: Thread Synchronization
**Problem:** Race conditions in multi-threaded programs

**Solution:**
- Learned about synchronized blocks
- Used proper locking mechanisms
- Tested with multiple scenarios

### Challenge 3: Memory Management
**Problem:** Understanding Java memory model

**Solution:**
- Studied heap vs stack allocation
- Learned about garbage collection
- Monitored memory usage in programs

## 🔮 Future Enhancements

### Planned Additions
- [ ] More advanced OOP exercises
- [ ] Data structures implementations
- [ ] Algorithm practice problems
- [ ] Design pattern examples
- [ ] GUI applications with JavaFX/Swing
- [ ] Database connectivity (JDBC)
- [ ] Unit tests for all exercises
- [ ] Performance optimization examples

### Learning Goals
- [ ] Master Java Collections Framework
- [ ] Learn Spring Framework basics
- [ ] Explore Java 17+ features
- [ ] Build full applications
- [ ] Contribute to open source Java projects

## 📚 Resources Used

### Textbooks
- Introduction to Java Programming (or your specific textbook)
- Operating Systems Concepts
- Java: The Complete Reference

### Online Resources
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)
- [GeeksforGeeks Java](https://www.geeksforgeeks.org/java/)
- [Baeldung](https://www.baeldung.com/)

### Practice Platforms
- HackerRank
- LeetCode
- Codewars
- Exercism

## 🐛 Known Issues

Currently no known issues. If you discover a bug in any solution, please open an issue.

## 🤝 Contributing

While this is a personal learning repository, suggestions are welcome!

Feel free to:
- Suggest alternative solutions
- Point out improvements
- Share additional resources
- Provide feedback on code quality

## 📄 License

This repository is for educational purposes. Solutions are based on textbook exercises.

## 👨‍💻 Author

**Jun Jhon**

- GitHub: [@junjhon12](https://github.com/junjhon12)

## 🙏 Acknowledgments

- Course instructors and professors
- Textbook authors
- Java community and documentation
- Stack Overflow contributors
- Fellow students for discussions and collaboration

## 📊 Repository Statistics

- **Total Chapters:** 3+ (Ch.02, Ch.03, Ch.04)
- **Projects:** Operating System implementations
- **Language:** 100% Java
- **Commits:** 23+
- **Status:** Active development

---

<div align="center">

**⭐ Star this repository if you found it helpful!**

**Made with ☕ and 💻**

*Documenting the journey from Java basics to advanced system programming*

</div>
