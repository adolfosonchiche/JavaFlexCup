#! /bin/bash
echo "STARTING JFLEX COMPILING"
#java -jar jflex-full-1.8.2.jar LexicoPista.jflex
jlex LexicoExpresion
echo "---------"
echo "STARTING CUP COMPILING"

#java -jar java-cup-11b.jar -parser ParserPista -symbols Symp ParserPista.cup

cup -parser ParserExpresion  -symbols Sym  ParserExpresion.cup
