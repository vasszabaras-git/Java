package gr.aueb.cf.cf9.ch8;

public class _1_ {
}

//stack einai memory that main when calls a method

/*sto programma mporei n ginoun lathi.
at Runtime lathi
px diaresh me 0, diavasma arxeiou p den uparxei

kathe lathos sxetizetai me ena exception
exceptions einai class (container) periexei plhrofories
dinei k to stacktrace (tracking pou egine to lathos)


2 categories of exceptions
1)runtime (unchecked) exceptions
NPE: references, Types
Arithemtic
arraysIndexoutofbounds
Numberformat (integer.parseInt-pairnei string, converts into number
inputmissmatch--scanner


2)checked exceptions
ta dhlwnoume sthn epikefalida
px(add(int a,intb) thows IO exception
IOexception,
Filenotfound
userdefinedexceptions


Handling of exceptions
1)if runtime exception
einai programmatistiko lathos, we need to correct them
-->Validation/ state-test (ti times exoun oi metavlhtes)

2)if checked exception
we use
try{
--------------code we want to be safe
}catch{
--------------entoles xeirismou (grafei logs, kanei rollback(episterfei to system sth arxikh tou katastash), gives feedback)
}finally{
--------------close resourses (datasources, usually arxeia)
}




----------------------------------------------------------------------------------------

typos exception --arithemtic, nullpointer,filenotfiound
message--e.getMessage()
stacktrace akolouthia twn klhsewn e.printStackTrace() 4-5 grammes
class-NullPointerException p exei th plhroforia

root class-Throwable gives the methods

subclass Error--system resources(stack, heap)
1.VMError,
2.OutofMemory
3.stackoverflowError

subclass Exception
RunTimeException
(einai ola programatistika lathi,oxi declare, de ta tsekarei o compiler-oxi at compileTime)
eg.NPE, arrayindexoutofbounds, NumberFormat (integer.parseInt()),
 inputmissmatchException(scanner),Aritheticexception

checked exceptions
(declare me throws sthn epikefalida ths method--ta
checkarei o comipler)
IOExemption - metafora arxeiwn
Filenotfoundexception -
ParseException
UserdefinedExceptions


Exception handling
a)checked exemptions
try{code that gives exception}
catch{commands for handling exception} --logging--rollback
finally{close resourses}

b)runtime exceptions

*/
