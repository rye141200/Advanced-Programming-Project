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
