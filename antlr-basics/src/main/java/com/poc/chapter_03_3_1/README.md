At this point, we’ve seen how to run ANTLR on a grammar and integrate the
generated parser into a trivial Java application. An application that merely
checks syntax is not that impressive, though, so let’s finish up by building a
translator that converts short array initializers to String objects.