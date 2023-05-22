# Advanced Programming Project #
## SimuLink file parser and displaying in GUI ##
### Description ###
This Java program parses given Simulink .mdl files and extract blocks attributes. Creating new objects with the extracted
attributes from the .mdl file and then displays these blocks in GUI using these attributes to display them.
### How to run the program ###
1. Download the "Advanced Programming Project" in the GitHub repo.
2. Make sure your IDE has javafx library installed.
3. Download the "Example.mdl" file for test causes.
4. In the "main_test.java" ***line 233*** in the **FileReader()** method update the file directory to the directory of your "Example.mdl" file.
5. Run the code!
6. ***Don't forget step 4***
### Documentation ###
#### Major Parsing Methods ####
Method name | Uses
----------- | -----
FileReader() | Used to read the .xml file and extract the useful content for GUI.
ParseLines() | Used to parse lines from the .xml file.
ParseBranches() | Used to parse branches from the .xml file.
ParseBlocks() | Used to parse blocks from the .xml file.
### GUI methods ###
Method name | Uses
----------- | -----
drawArrow() | Draws arrows.
drawBlock() | Draws blocks with specifications.
### Classes ###
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/7572cfdd-4076-4fb8-80a0-a7e149be7813)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/61b7ebe5-88a1-4054-b6b9-dc77d95ab7b8)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/c1edfcc3-6759-4224-a3a9-ff7d0ee2bf98)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/e1341ee5-f37a-4250-add1-abc6cfecd4c6)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/d2f2563f-a836-4269-93dc-d55d9bea19be)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/a7c2c5e5-258b-4ae8-83fc-fa218e9d9b77)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/30a73111-7458-4065-b693-7cb5a28ed92c)
![image](https://github.com/rye141200/Advanced-Project-/assets/132165303/72060f39-c054-46f4-8dda-18e3dc6801af)
