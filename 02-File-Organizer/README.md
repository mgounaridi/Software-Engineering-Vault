# Automated File Organizer

A Java utility that scans a specified directory (like the local Downloads folder) and automatically sorts files into categorized subfolders based on their file extensions.

**Why I Built This**
To solve the real-world problem of cluttered directories while getting hands-on experience with file system manipulation. This script represents a transition from theoretical programming logic to a practical, automated desktop tool.

**Core Concepts Demonstrated**
* **File I/O Operations:** Utilizing `java.nio.file` to scan directories, read paths, and safely move files across the file system without data loss.
* **String Manipulation:** Extracting file extensions dynamically using `lastIndexOf()` and `substring()` to parse file names and determine their type.
* **Dynamic Directory Creation:** Categorizing extensions (e.g., `.png`, `.pdf`, `.dmg`) and automatically generating category folders (Images, Documents, Installers) on the fly.
* **Exception Handling:** Managing `IOException` and `NoSuchFileException` to ensure the program doesn't crash during restricted file access or missing directory paths.
