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
	LogIn.java \
	ContactEngine.java \
	Feedback.java \
	FeedbackRequester.java \
	FeedbackResponder.java \
	Learning.java \
	LocalStatistics.java \
	Log.java \
	Logging.java \
	Matcher.java \
	Notification.java \
	Preferences.java \
	Request.java \
	Requester.java \
	Responder.java \
	Response.java \
	Scheduler.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class