grammar JFK;

entry: command WHITESPACE* EOF;
command: push
       | mov
       | interrupt
       | xor;

mov: 'mov' WHITESPACE+ expression WHITESPACE* ',' + WHITESPACE* REGISTERS;

xor: 'xor' WHITESPACE+ expression WHITESPACE* ',' + WHITESPACE* REGISTERS;

push: 'push' WHITESPACE+  expression;

interrupt: 'int' WHITESPACE+ '0x'NUMBER;

expression: NUMBER
           | REGISTERS
           | '(' expression ')'
           | expression WHITESPACE* mult='*' WHITESPACE* expression
           |  expression WHITESPACE* operation WHITESPACE* expression;

operation: OP;

REGISTERS: '%'('eax' | 'ebx' | 'ecx' | 'edx');

OP: ('-'|'+');

WHITESPACE: (' ' | '\t');


NUMBER: [0-9]+;

