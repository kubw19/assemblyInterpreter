grammar JFK;

entry: command WHITESPACE* EOF;
command: push
       | mov
       | interrupt;

mov: 'mov' WHITESPACE+ expression WHITESPACE* ',' + WHITESPACE* REGISTERS;

push: 'push' WHITESPACE+  expression;

interrupt: 'int' WHITESPACE+ '0x'NUMBER;

expression: NUMBER
           | REGISTERS
           |  expression WHITESPACE* operation WHITESPACE* expression
           | '(' expression ')';

operation: OP;

REGISTERS: '%'('eax' | 'ebx' | 'ecx' | 'edx');

OP: ('+'|'-'|'*');

WHITESPACE: (' ' | '\t');


NUMBER: [0-9]+;

