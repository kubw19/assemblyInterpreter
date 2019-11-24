grammar JFK;

entry: command EOF;
command: push
       | mov;

mov: 'test';

push: 'push ' (DIGITS | REGISTERS);


REGISTERS: '%eax' | '%ebx' | '%ecx' | '%edx';

WHITESPACE: (' ' | '\t') ;

DIGITS: [-]?[0-9]+;

