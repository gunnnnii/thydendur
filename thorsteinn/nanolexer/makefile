NanoLexer.java: nanolexer.jflex
	java -jar jflex-full-1.7.0.jar nanolexer.jflex
Parser.class: Parser.java NanoLexer.java
	javac NanoLexer.java Parser.java
build: NanoLexer.java Parser.java
	javac NanoLexer.java Parser.java
clean:
	del *~ NanoLexer*.class NanoLexer.java Parser*.class
test: Parser.class test2.txt
	java Parser test2.txt