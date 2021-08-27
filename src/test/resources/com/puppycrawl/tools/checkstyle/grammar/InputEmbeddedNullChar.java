/*
com.puppycrawl.tools.checkstyle.checks.naming.MemberName
format = (default)^[a-z][a-zA-Z0-9]*$
applyToPublic = (default)true
applyToProtected = (default)true
applyToPackage = (default)true
applyToPrivate = (default)true


*/

package com.puppycrawl.tools.checkstyle.grammar;

public class InputEmbeddedNullChar // ok
{
    public void doSomething()
    {
        // String below has an embedded null in it as well as char 036 repeated
        // twice - none of shich should cause a problem as they're all valid
        // UTF-8
        String cctCxlMsg = ":ET:OE:}} ";
    }

}
