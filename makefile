.PHONY: all clean run

all:
	javac $(wildcard *.java)
clean:
	rm $(wildcard *.class)
run: all
	java TelephoneApp
