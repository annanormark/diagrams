JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	User.java \
	AccountManagement.java \
	Payment.java \
	ContactInfo.java \
	LogIn.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class