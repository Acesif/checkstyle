/*
IllegalInstantiation
classes = jjva.lang.Boolean, java.lang*Boolean
tokens = (default)CLASS_DEF


*/

//non-compiled with javac: compiling on jdk before 9
package java.lang;

class InputIllegalInstantiationLang2 {
    Boolean obj = new Boolean(); // violation
    Integer obj2 = new Integer();
}

class Boolean{}
class Integer{}

class Input2 {
	String a = new String();
}
